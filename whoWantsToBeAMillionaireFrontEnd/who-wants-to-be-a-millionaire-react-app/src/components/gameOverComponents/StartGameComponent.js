import React from 'react';

function StartGameComponent({handleStartClick}){

    return (
        <div id="start-button-div">
            <div>
                <img src="./images/who-wants-to-be-a-millionaire-logo.png" alt="who wants to be a millionaire logo" id="start-image"/>
            </div>
            <button onClick={handleStartClick} id="start-button">Start</button>
        </div>
    )
}


export default StartGameComponent;
