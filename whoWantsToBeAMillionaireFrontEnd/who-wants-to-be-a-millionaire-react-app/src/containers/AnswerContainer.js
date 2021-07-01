import React from 'react';
import AnswerComponent from '../components/AnswerComponent';

function AnswerContainer(){

    const answers = [];

    for(let i = 0; i < 4; i++){
        answers.push(<AnswerComponent/>)
    }

    return(
        <div>
            AnswerContainer content Goes Here
            {answers}
        </div>
    )
}

export default AnswerContainer;