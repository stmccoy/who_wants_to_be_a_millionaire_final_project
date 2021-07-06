import React from 'react';

function QuestionComponent({question}){
    return(
        question ?
        <div className="question">
            <p>{question}</p>
        </div>

        :

        <div className="question">
            loading
        </div>
    )
}

export default QuestionComponent;