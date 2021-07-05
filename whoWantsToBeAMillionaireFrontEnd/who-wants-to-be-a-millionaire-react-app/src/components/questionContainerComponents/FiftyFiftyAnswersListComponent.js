import React from 'react';
import AnswerComponent from './AnswerComponent';
// import './AnswerList.css';

function AnswersListComponent({answers, handleAnswerSelect, correctAnswer, answerSelected, rightAnswer, wrongAnswer, fiftyFiftyDecides, fiftyFiftyOtherOption}){


    const FiftyFiftyArray = [correctAnswer, fiftyFiftyOtherOption]

    const fiftyFiftyAnswerListSelected = answers.map( (item) => {
        return (<li className={answerSelected === item.answer ? "selected" : null}onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer} id={FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : "empty"}>{FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : null}</li>)
    });

    const fiftyFiftyAnswerListRightOrWrong = answers.map( (item) => {
        return (<li className={`${rightAnswer && item.answer === answerSelected ? "right-answer" : null} ${wrongAnswer && item.answer === answerSelected ? "wrong-answer" : null}`} onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer}>{FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : null}</li>)
    });

    return(
        rightAnswer || wrongAnswer 
        
        ?
        <div>
            <ul className= "answers">
                {fiftyFiftyAnswerListRightOrWrong}
            </ul>
        </div>
        :

        <div>
            <ul className= "answers">
                {fiftyFiftyAnswerListSelected}
            </ul>
        </div>
    )
}

export default AnswersListComponent;