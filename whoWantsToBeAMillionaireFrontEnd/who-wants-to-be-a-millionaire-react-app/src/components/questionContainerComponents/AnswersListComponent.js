import React from 'react';
import AnswerComponent from './AnswerComponent';
import './AnswerList.css';

function AnswersListComponent({answers, handleAnswerSelect}){

    const answerList = answers.map( (item) => {
        return (<li onClick={handleAnswerSelect} key={item.correct}>{item.answer}</li>)
    });

    return(
        <div>
            AnswersListComponent content Goes Here
            <ul>
                {answerList}
            </ul>
        </div>
    )
}

export default AnswersListComponent;