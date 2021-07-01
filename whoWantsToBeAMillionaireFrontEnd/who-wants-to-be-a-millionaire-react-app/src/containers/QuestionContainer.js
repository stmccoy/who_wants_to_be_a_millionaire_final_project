import React, {useEffect, useState} from 'react';
import QuestionComponent from '../components/questionContainerComponents/QuestionComponent';
import AnswersListComponent from '../components/questionContainerComponents/AnswersListComponent';
import Request from '../helpers/request';


function QuestionContainer(){

    const [questions, setQuestions] = useState(null);
    const [question, setQuestion] = useState(null);
    const [answers, setAnswers] = useState([]);
    const [difficulty, setDifficulty] = useState(0);
    const [questionNumber, setQuestionNumber] = useState(0);
    const [round, setRound] = useState(0);

    const numberOfQuestions = 19;

    const findQuestionByDifficultyRating = function(){
        const request = new Request();
        request.get('http://localhost:8080/questions/' + difficulty)
            .then(res => setQuestions(res))
    }

    const randomNumberGenerator = function(){
        return Math.floor((Math.random() * numberOfQuestions))
    }

    const handleAnswerSelect = function (){
        setRound(round + 1);
        setQuestionNumber(randomNumberGenerator)
    }

    useEffect(() => {
        setQuestionNumber(randomNumberGenerator)    
        findQuestionByDifficultyRating()
    }, [difficulty])

    useEffect(()=>{
        if(questions){
            setQuestion(questions[questionNumber].question)
            setAnswers(questions[questionNumber].answers)
        }
    }, [questions, questionNumber])

    useEffect(() => {
        if(round % 2 == 0 && round != 0){
            setDifficulty(difficulty + 1);
            findQuestionByDifficultyRating();
        }
    },[round])

    return (
        <section>
            QuestionContainer stuff 
            <QuestionComponent question = {question}/>
            <AnswersListComponent answers = {answers} handleAnswerSelect={handleAnswerSelect}/>
        </section>
    )
}

export default QuestionContainer;