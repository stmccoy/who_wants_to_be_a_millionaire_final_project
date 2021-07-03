import React from 'react';
import AnswerComponent from './AnswerComponent';
// import './AnswerList.css';

function AnswersListComponent({answers, handleAnswerSelect, correctAnswer, answerSelected, rightAnswer, wrongAnswer, fiftyFiftyDecides, fiftyFiftyOtherOption}){

    const answerListSelected = answers.map( (item) => {
        return (<li className={answerSelected === item.answer ? "selected" : null}onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer}>{item.answer}</li>)
    });

    const answerListRightOrWrong = answers.map( (item) => {
        return (<li className={`${rightAnswer && item.answer === answerSelected ? "right-answer" : null} ${wrongAnswer && item.answer === answerSelected ? "wrong-answer" : null}`} onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer}>{item.answer}</li>)
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