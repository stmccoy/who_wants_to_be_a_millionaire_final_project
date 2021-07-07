import React from 'react';

function GameOverComponent({gameWon}){

    //restarts game if play again button clicked
    const handlePlayAgainClick = function (){
        window.location.reload()
    }

    return(
        gameWon
        ?
        <div>
            <div className="game-won">
                <h1>Thanks For Playing</h1>
                <h1>You Won</h1>
                <button onClick={handlePlayAgainClick}>Play Again</button>
            </div>
            <img src="./images/dancing-duckdancing.gif" alt="dancing duck" id="dancing-duck"/>

        </div>

        :
        <div className="end-game">
            <h1>You Lost</h1>
            <h1>Game Over</h1>
            <button onClick={handlePlayAgainClick}>Play Again</button>
        </div>
    )

}

export default GameOverComponent;