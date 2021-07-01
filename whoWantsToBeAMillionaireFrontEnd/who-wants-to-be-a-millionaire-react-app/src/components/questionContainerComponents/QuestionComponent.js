import React from 'react';

function QuestionComponent({question}){
    return(
        question ?
        <div>
            {question}
        </div>

        :

        <div>
            loading
        </div>
    )
}

export default QuestionComponent;