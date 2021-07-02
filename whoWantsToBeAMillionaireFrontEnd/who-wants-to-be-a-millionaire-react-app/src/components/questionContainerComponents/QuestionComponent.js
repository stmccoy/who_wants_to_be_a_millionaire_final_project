import React from 'react';

function QuestionComponent({question}){
    return(
        question ?
        <div className="question">
            {question}
        </div>

        :

        <div className="question">
            loading
        </div>
    )
}

export default QuestionComponent;