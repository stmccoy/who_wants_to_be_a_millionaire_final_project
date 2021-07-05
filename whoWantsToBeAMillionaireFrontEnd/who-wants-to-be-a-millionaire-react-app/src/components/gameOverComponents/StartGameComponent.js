import React from 'react';

function StartGameComponent({handleStartClick, startClick}){

    return (
        <div id="start-button-div">
            <div>
                <img src="./images/who-wants-to-be-a-millionaire-logo-2.png" alt="who wants to be a millionaire logo" className={!startClick ? "start-image" : "start-image-spin"}/>
            </div>
            {!startClick
            ?

            <button onClick={handleStartClick} id="start-button">Start</button>

            :

            <></>
            }
        </div>
    )
}


export default StartGameComponent;
