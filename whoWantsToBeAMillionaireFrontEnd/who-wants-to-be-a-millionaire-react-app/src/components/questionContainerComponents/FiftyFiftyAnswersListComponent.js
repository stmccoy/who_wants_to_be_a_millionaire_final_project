import React from 'react';


function AnswersListComponent({answers, handleAnswerSelect, correctAnswer, answerSelected, rightAnswer, wrongAnswer, fiftyFiftyDecides, fiftyFiftyOtherOption}){

    //creates an array of the two remaining items when fifty fifty selected
    const FiftyFiftyArray = [correctAnswer, fiftyFiftyOtherOption]

    //creates a selected answer class list for fifty fifty lifeline
    const fiftyFiftyAnswerListSelected = answers.map( (item) => {
        return (<li className={answerSelected === item.answer ? "selected" : null}onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer} id={FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : "empty"}>{FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : null}</li>)
    });

    //creates a right or wrong class for fifty fifty life line
    const fiftyFiftyAnswerListRightOrWrong = answers.map( (item) => {
        return (<li className={`${rightAnswer && item.answer === answerSelected ? "right-answer" : null} ${wrongAnswer && item.answer === answerSelected ? "wrong-answer" : null}`} onClick={(() => handleAnswerSelect(item.answer))} key={item.id} value={item.answer} id={FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : "empty"}>{FiftyFiftyArray.includes(item.answer) && correctAnswer ? item.answer : null}</li>)
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