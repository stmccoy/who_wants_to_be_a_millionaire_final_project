import React, {useEffect, useState} from 'react';
import QuestionComponent from '../components/questionContainerComponents/QuestionComponent';
import AnswersListComponent from '../components/questionContainerComponents/AnswersListComponent';
import FiftyFiftyAnswersList from '../components/questionContainerComponents/FiftyFiftyAnswersListComponent';
import Request from '../helpers/request';


function QuestionContainer({round, setRound, setGameOver, gameOver, correctAnswer, setCorrectAnswer, canClick, setCanClick, fiftyFiftyDecides, setFiftyFiftyDecides}){

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

    // total number of questions in a specific difficulty which factors in that index numbers in arrays start from 0 (20 questions total)
    const numberOfQuestions = 19;

    const decideIfAnswerCorrect = function (answer){
        if(answer == correctAnswer){
            setRightAnswer(true)
            setTimeout(() => {setRightAnswer(false)}, 5000)
        } else{
            setWrongAnswer(true)
            setTimeout(() => {setGameOver(true)}, 5000)
        }
    }

    // fetch request for questions based upon difficulty rating that the player is currently on
    const findQuestionByDifficultyRating = function(){
        const request = new Request();
        request.get('http://localhost:8080/questions/' + difficulty)
            .then(res => setQuestions(res))
    }

    // generates a random number between 0-19 which is then used as the ordinal number to pick a question from the database out of a pool of 20
    const randomNumberGenerator = function(){
        return Math.floor((Math.random() * numberOfQuestions))
    }

    const randomFiftyFiftyAnswerNumberGenerator = function (){
        return Math.floor((Math.random() * 3))
    }

    //resets round paramenters for next turn
    const resetRoundParameters = function (){
        //change below to length of rounds array
        if(round === 14){
            setGameOver(true)
        }else {
            setRound(round + 1)
        }
        setRightAnswer(false)
        setWrongAnswer(false)
        setCanClick(true)
        setQuestionNumber(randomNumberGenerator)
        setAnswerSelected(null)
        setFiftyFiftyDecides(false); 
    }

    // increases the round and sets a new question number whenever an answer is clicked
    const handleAnswerSelect = function (value){
        if(canClick){
            setAnswerSelected(value)
            setCanClick(false);
            setTimeout(() => {decideIfAnswerCorrect(value)}, 4000)
            setTimeout(() => {resetRoundParameters()}, 9000)
            // setTimeout(() => {setQuestionNumber(randomNumberGenerator)}, 10000);
            // setTimeout(() => {setRound(round + 1)}, 10000);
            // setTimeout(() => setCanClick(true), 10000)
        }
    }

    // sets question and associated answers in game whenever the questions are downloaded, when the question number changes and when the app first loads
    useEffect(()=>{
        if(!gameOver){
            if(questions){
                setQuestion(questions[questionNumber].question)
                setAnswers(questions[questionNumber].answers)
                //filters through answers and sets correct answer to the one that is correct
                const correctAnswer = questions[questionNumber].answers.filter((item) => {
                    if(item.correct){
                        return item.answer
                    }
                })
                setCorrectAnswer(correctAnswer[0].answer);
            }
        }
    }, [questions, questionNumber])

    //sets can click to be true once the answers to the question have loaded
    // useEffect(() => {
    //     setTimeout(() => setCanClick(true), 2000)
    // }, [answers])

    // increases difficulty of questions if the person is on a round that is a multiple of 2 that isn't 0
    useEffect(() => {
        if(round % 2 == 0 && round != 0){
            setDifficulty(difficulty + 1);
            findQuestionByDifficultyRating();
        }
    },[round])

    // sets a new question number then finds the questions from the database with that difficulty whenever the difficulty changes
    useEffect(() => {
        setQuestionNumber(randomNumberGenerator)    
        findQuestionByDifficultyRating()
    }, [difficulty])

    useEffect(() => {
        if(answers.length != 0){
            let tempAnswers = answers;
            tempAnswers = tempAnswers.filter((item) => {
                if(!item.correct){
                    return item.answer
                }
            })
            console.log("temp Answers");
            console.log(tempAnswers);
            setFiftyFiftyOtherOption(tempAnswers[randomFiftyFiftyAnswerNumberGenerator()].answer)
        }

    }, [answers])

    return (
        <section>
            <QuestionComponent question = {question}/>

            {fiftyFiftyDecides

            ?

            <FiftyFiftyAnswersList answers= {answers} handleAnswerSelect={handleAnswerSelect} canClick = {canClick} answerSelected= {answerSelected} correctAnswer={correctAnswer} rightAnswer={rightAnswer} wrongAnswer={wrongAnswer} answerSelected={answerSelected} fiftyFiftyOtherOption={fiftyFiftyOtherOption} fiftyFiftyDecides={fiftyFiftyDecides}/>

            :

            <AnswersListComponent answers= {answers} handleAnswerSelect={handleAnswerSelect} canClick = {canClick} answerSelected= {answerSelected} correctAnswer={correctAnswer} rightAnswer={rightAnswer} wrongAnswer={wrongAnswer} answerSelected={answerSelected} fiftyFiftyOtherOption={fiftyFiftyOtherOption} fiftyFiftyDecides={fiftyFiftyDecides}/>}
        </section>
    )
}

export default QuestionContainer;