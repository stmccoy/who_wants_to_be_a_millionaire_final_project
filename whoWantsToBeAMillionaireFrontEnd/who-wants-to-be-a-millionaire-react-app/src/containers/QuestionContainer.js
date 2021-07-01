import React from 'react';
import QuestionComponent from '../components/QuestionComponent';
import AnswerContainer from './AnswerContainer';

function QuestionContainer(){
    return (
        <section>
            QuestionContainer stuff 
            <QuestionComponent/>
            <AnswerContainer/>
        </section>
    )
}

export default QuestionContainer;