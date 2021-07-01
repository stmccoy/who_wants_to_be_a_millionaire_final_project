import React from 'react';
import QuestionComponent from '../components/questionContainerComponents/QuestionComponent';
import AnswersListComponent from '../components/questionContainerComponents/AnswersListComponent';

function QuestionContainer(){
    return (
        <section>
            QuestionContainer stuff 
            <QuestionComponent/>
            <AnswersListComponent/>
        </section>
    )
}

export default QuestionContainer;