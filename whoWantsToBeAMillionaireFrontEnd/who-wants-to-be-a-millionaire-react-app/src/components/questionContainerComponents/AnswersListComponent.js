import React from 'react';

function AnswersListComponent({answers, handleAnswerSelect, correctAnswer, answerSelected, rightAnswer, wrongAnswer, fiftyFiftyDecides, fiftyFiftyOtherOption}){

    //creates a list of answers tied to the selected class
    const answerListSelected = answers.map( (item) => {
        return (<li className={answerSelected === item.answer ? "selected" : null}onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer} id="not-5050">{item.answer}</li>)
    });

    //creates a list of answers tied to right or wrong class
    const answerListRightOrWrong = answers.map( (item) => {
        return (<li className={`${rightAnswer && item.answer === answerSelected ? "right-answer" : null} ${wrongAnswer && item.answer === answerSelected ? "wrong-answer" : null}`} onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer} id="not-5050">{item.answer}</li>)
    });

    return(
        rightAnswer || wrongAnswer 
        
        ?
        <div>
            <ul className= "answers">
                {answerListRightOrWrong}
            </ul>
        </div>

        :

        <div>
            <ul className= "answers">
                {answerListSelected}
            </ul>
        </div>
    )
}

export default AnswersListComponent;