import React from 'react';
import AnswerComponent from './AnswerComponent';

function AnswersListComponent({answers}){

    const answerList = answers.map( (item) => {
        return (<li key={item.correct}>{item.answer}</li>)
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