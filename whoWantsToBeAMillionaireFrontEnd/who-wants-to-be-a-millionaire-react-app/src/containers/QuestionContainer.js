import React, {useEffect, useState} from 'react';
import QuestionComponent from '../components/questionContainerComponents/QuestionComponent';
import AnswersListComponent from '../components/questionContainerComponents/AnswersListComponent';
import Request from '../helpers/request';


function QuestionContainer({round, setRound}){

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

    // set whether person can click or not
    const [canClick, setCanClick] = useState(true);

    // total number of questions in a specific difficulty which factors in that index numbers in arrays start from 0 (20 questions total)
    const numberOfQuestions = 19;

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

    // increases the round and sets a new question number whenever an answer is clicked
    const handleAnswerSelect = function (){
        if(canClick){
            setCanClick(false);
            setRound(round + 1);
            setQuestionNumber(randomNumberGenerator);
        }
    }

    // sets question and associated answers in game whenever the questions are downloaded, when the question number changes and when the app first loads
    useEffect(()=>{
        if(questions){
            setQuestion(questions[questionNumber].question)
            setAnswers(questions[questionNumber].answers)
            // below to be attached to CSS flickering at a later point
        }
    }, [questions, questionNumber])

    //sets can click to be true once the answers to the question have loaded
    useEffect(() => {
        setTimeout(() => setCanClick(true), 2000)
    }, [answers])

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

    return (
        <section>
            QuestionContainer stuff 
            <QuestionComponent question = {question}/>
            <AnswersListComponent answers = {answers} handleAnswerSelect={handleAnswerSelect} canClick = {canClick}/>
        </section>
    )
}

export default QuestionContainer;