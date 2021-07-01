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

    const findQuestionByDifficultyRating = function(){
        const request = new Request();
        request.get('http://localhost:8080/questions/' + difficulty)
            .then(res => setQuestions(res))
    }

    useEffect(() => {
        setQuestionNumber(Math.floor((Math.random() * 19)))
        findQuestionByDifficultyRating()
    }, [])

    useEffect(()=>{
        if(questions){
            setQuestion(questions[questionNumber].question)
            setAnswers(questions[questionNumber].answers)
        }
    }, [questions])

    return (
        <section>
            QuestionContainer stuff 
            <QuestionComponent question = {question}/>
            <AnswersListComponent answers = {answers}/>
        </section>
    )
}

export default QuestionContainer;