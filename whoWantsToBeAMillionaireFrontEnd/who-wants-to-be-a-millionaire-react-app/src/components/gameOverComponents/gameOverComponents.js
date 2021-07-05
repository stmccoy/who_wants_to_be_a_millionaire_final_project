import React from 'react';

function GameOverComponent({gameWon}){

    return(
        gameWon
        ?
        <div className="game-won">
            <h1>Thanks For Playing</h1>
            <h1>You Won</h1>
            <img src="./images/dancing-duckdancing.gif" alt="dancing duck" id="dancing-duck"/>
        </div>

        :
        <div>
            <h1>You Lost</h1>
            <h1>Game Over</h1>
        </div>
    )

}

export default GameOverComponent;