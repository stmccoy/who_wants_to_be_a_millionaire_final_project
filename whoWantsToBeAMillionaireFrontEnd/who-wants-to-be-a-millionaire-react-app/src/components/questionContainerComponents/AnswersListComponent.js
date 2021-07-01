import React from 'react';
import AnswerComponent from './AnswerComponent';

function AnswersListComponent(){

    const answers = [];

    for(let i = 0; i < 4; i++){
        answers.push(<AnswerComponent/>)
    }

    return(
        <div>
            AnswersListComponent content Goes Here
            {answers}
        </div>
    )
}

export default AnswersListComponent;