import React, {useEffect, useState} from 'react';
import QuestionComponent from '../components/questionContainerComponents/QuestionComponent';
import AnswersListComponent from '../components/questionContainerComponents/AnswersListComponent';
import FiftyFiftyAnswersList from '../components/questionContainerComponents/FiftyFiftyAnswersListComponent';
import Request from '../helpers/request';


function QuestionContainer({round, setRound, setGameOver, gameOver, correctAnswer, setCorrectAnswer, canClick, setCanClick, fiftyFiftyDecides, setFiftyFiftyDecides, setAskTheAudienceDecides, setPhoneAFriendDecides, firstFiveQuestionsAudio, correctAnswerAudio, wrongAnswerAudioOnehundredToOneThousandAudio, OneThousandPoundsWinAudio, HarderQuestionsMusic, startGameSound, restartAllSoundEffects, wrongAnswerHarderQuestions, HarderQuestionAnswerSelected, OneMillionDollarWin, setGameWon, correctAnswerOneHundredToOneThousand}){

    //state for if player gets answer right
    const [rightAnswer, setRightAnswer] = useState(false);

    //state for if player gets answer wrong
    const [wrongAnswer, setWrongAnswer] = useState(false);

    //Selected Answer State
    const [answerSelected, setAnswerSelected] = useState(null);

    // fetch question bank at current difficulty rating
    const [questions, setQuestions] = useState(null);

    // set question
    const [question, setQuestion] = useState(null);

    // set answers to question
    const [answers, setAnswers] = useState([]);

    // set difficulty rating 
    const [difficulty, setDifficulty] = useState(0);

    // number to index into question group list
    const [questionNumber, setQuestionNumber] = useState(0);

    //sets 5050 other answer
    const [fiftyFiftyOtherOption, setFiftyFiftyOtherOption] = useState(null);

    //used question number designed to prevent repeating questions by random number generator
    const[usedQuestionNumber, setUsedQuestionNumber] = useState(null);

    //answers after first shuffle to be shuffled again to create more randomness
    const[shuffledAnswers, setShuffledAnswers] = useState([]);

    // total number of questions in a specific difficulty which factors in that index numbers in arrays start from 0 (20 questions total)
    const numberOfQuestions = 19;

    // sets question and associated answers in game whenever the questions are downloaded, when the question number changes and when the app first loads
    useEffect(()=>{
        if(!gameOver){
            if(questions){
                setQuestion(questions[questionNumber].question)
                setShuffledAnswers(shuffleAnswers(questions[questionNumber].answers))
                //filters through answers and sets correct answer to the one that is correct
                const correctAnswer = questions[questionNumber].answers.filter((item) => {
                    if(item.correct){
                        return item.answer
                    }
                })
                setCorrectAnswer(correctAnswer[0].answer);
                restartAllSoundEffects()
            }
        }
    }, [questions, questionNumber])

    //sets answers to the shuffled answers reversed for more randomness 
    useEffect(() => {
        setAnswers(shuffledAnswers.reverse())
    }, [shuffledAnswers])

    // increases difficulty of questions if the person is on a round that is a multiple of 2 that isn't 0
    useEffect(() => {
        if(round % 2 == 0 && round != 0){
            setDifficulty(difficulty + 1);
            setUsedQuestionNumber(null);
            // setQuestionNumber(randomNumberGenerator)
        }
    },[round])

    // sets a new question number then finds the questions from the database with that difficulty whenever the difficulty changes
    useEffect(() => {
        setFiftyFiftyDecides(false); 
        if(round === 0){
            setQuestionNumber(randomNumberGenerator);  
            setUsedQuestionNumber(questionNumber);
        }
        findQuestionByDifficultyRating()
        restartAllSoundEffects()
            
    }, [difficulty])

    // when answers created this sets up fifty fifty other option
    useEffect(() => {
        if(answers.length != 0){
            let tempAnswers = answers;
            tempAnswers = tempAnswers.filter((item) => {
                if(!item.correct){
                    return item.answer
                }
            })
            setFiftyFiftyOtherOption(tempAnswers[randomFiftyFiftyAnswerNumberGenerator()].answer)
        }

    }, [answers])

    //decides if selected answer is correct or not
    const decideIfAnswerCorrect = function (answer){
        if(answer == correctAnswer){
            setRightAnswer(true)
            if(round === 3)
            {
                OneThousandPoundsWinAudio.play()
                setTimeout(()=> {
                    firstFiveQuestionsAudio.pause();
                }, 500)
                setTimeout(() => {
                    OneThousandPoundsWinAudio.pause()
                    startGameSound.play()
                    setRound(round + 1);
                    setFiftyFiftyDecides(false);
                }, 7000)
                setTimeout(() => {
                    startGameSound.pause()
                    HarderQuestionsMusic.play()
                }, 12000)
            }else if (round < 3){
                correctAnswerOneHundredToOneThousand.play();
                setTimeout(() => {
                    setRound(round + 1);
                }, 3000)
                setTimeout(() => {
                    setFiftyFiftyDecides(false);
                }, 3350)

            }else{
                if(round !== 14){
                    correctAnswerAudio.play()
                    setTimeout(()=> {
                        HarderQuestionAnswerSelected.pause();
                    }, 500)
                        setTimeout(() => {
                            correctAnswerAudio.pause()
                            startGameSound.play()
                        }, 7000)
                        setTimeout(() => {
                            setRound(round + 1);  
                        }, 7500)
                        setTimeout(() => {
                            startGameSound.pause()
                            HarderQuestionsMusic.play()
                        }, 12000)
                    }else {
                        OneMillionDollarWin.play()
                        setGameWon(true)
                    setTimeout(()=> {
                        HarderQuestionAnswerSelected.pause();
                        firstFiveQuestionsAudio.pause();
                    }, 500)
                    }
                }
        } else{
            setWrongAnswer(true)
            if(round< 4){
                wrongAnswerAudioOnehundredToOneThousandAudio.play()
                setTimeout(()=> {
                    HarderQuestionAnswerSelected.pause();
                    HarderQuestionsMusic.pause();
                    firstFiveQuestionsAudio.pause();
                }, 500)
                setTimeout(() => {
                    setGameOver(true);
                    wrongAnswerAudioOnehundredToOneThousandAudio.pause()
                }, 2000)
            }else{
                wrongAnswerHarderQuestions.play()
                setTimeout(()=> {
                    HarderQuestionAnswerSelected.pause();
                    HarderQuestionsMusic.pause();
                    firstFiveQuestionsAudio.pause();
                }, 500)
                setTimeout(() => {
                    setGameOver(true);
                    wrongAnswerAudioOnehundredToOneThousandAudio.pause()
                }, 5000)
            }
        }
    }

    // fetch request for questions based upon difficulty rating that the player is currently on
    const findQuestionByDifficultyRating = function(){
        const request = new Request();
        request.get('http://localhost:8080/questions/' + difficulty)
            .then(res => setQuestions(res))
    }

    //shuffles answers from database so they're
    function shuffleAnswers(answerArray){
        if(answerArray.length !== 0){
            answerArray.sort();
            let currentIndex = 4;
            let temporaryValue;
            let randomIndex;

            while (0 !== currentIndex) {
                randomIndex = Math.floor(Math.random() * currentIndex);
                currentIndex = currentIndex - 1;
                temporaryValue = { ...answerArray[currentIndex] };
                answerArray[currentIndex] = answerArray[randomIndex];
                answerArray[randomIndex] = temporaryValue;
            }
            return answerArray;
        } else{
            return []
        }
    };

    // generates a random number between 0-19 which is then used as the ordinal number to pick a question from the database out of a pool of 20
    const randomNumberGenerator = function(){
        return Math.floor((Math.random() * numberOfQuestions))
    }

    //generates a random number which selects the wrong fifty fifty answer left remaining with correct answer
    const randomFiftyFiftyAnswerNumberGenerator = function (){
        return Math.floor((Math.random() * 3))
    }

    //resets round paramenters for next turn
    const resetRoundParameters = function (){
        //resets lifelines
        setFiftyFiftyDecides(false); 
        setAskTheAudienceDecides(false);
        setPhoneAFriendDecides(false);

        //change below to length of rounds array
        if(round === 14){
            setGameOver(true)
        }
        setRightAnswer(false)
        setWrongAnswer(false)
        // setCanClick(true)
        if(round % 2 == 0)
        {
            while(true){
                let tempQuestionNumber = randomNumberGenerator()
                if(tempQuestionNumber !== usedQuestionNumber){
                    setQuestionNumber(tempQuestionNumber);
                    setUsedQuestionNumber(tempQuestionNumber);
                    break;
                }
            }
        }
        setAnswerSelected(null)
    }

    // increases the round and sets a new question number whenever an answer is clicked
    const handleAnswerSelect = function (value){
        if(canClick){
            setAnswerSelected(value)
            setAskTheAudienceDecides(false);
            setPhoneAFriendDecides(false);
            if(round > 3){
                HarderQuestionAnswerSelected.play()
                setTimeout(() => {
                    firstFiveQuestionsAudio.pause();
                    HarderQuestionsMusic.pause();
                }, 250)
            }
            setCanClick(false);
            setTimeout(() => {decideIfAnswerCorrect(value)}, 4000)
            if(round >= 3){
                setTimeout(() => {resetRoundParameters()}, 12500)
            }else{
                setTimeout(() => {resetRoundParameters()}, 7500)
            }
        }
    }

    return (
        <section>
            <QuestionComponent question = {question}/>

            {fiftyFiftyDecides

            ?

            <FiftyFiftyAnswersList answers= {answers} handleAnswerSelect={handleAnswerSelect} canClick = {canClick} answerSelected= {answerSelected} correctAnswer={correctAnswer} rightAnswer={rightAnswer} wrongAnswer={wrongAnswer} answerSelected={answerSelected} fiftyFiftyOtherOption={fiftyFiftyOtherOption} fiftyFiftyDecides={fiftyFiftyDecides}/>

            :

            <AnswersListComponent answers= {answers} handleAnswerSelect={handleAnswerSelect} canClick = {canClick} answerSelected= {answerSelected} correctAnswer={correctAnswer} rightAnswer={rightAnswer} wrongAnswer={wrongAnswer} answerSelected={answerSelected} fiftyFiftyOtherOption={fiftyFiftyOtherOption} fiftyFiftyDecides={fiftyFiftyDecides} shuffledAnswers={shuffledAnswers} setShuffledAnswers={setShuffledAnswers}/>}
        </section>
    )
}

export default QuestionContainer;