import React from 'react';
import AnswerComponent from './AnswerComponent';
import './AnswerList.css';

function AnswersListComponent({answers, handleAnswerSelect, correctAnswer, answerSelected}){

    const answerList = answers.map( (item) => {
        return (<li className={answerSelected == item.answer ? "selected" : null}onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer}>{item.answer}</li>)
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