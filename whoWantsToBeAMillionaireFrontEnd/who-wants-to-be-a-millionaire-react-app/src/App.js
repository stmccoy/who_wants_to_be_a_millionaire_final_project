import { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import QuestionContainer from './containers/QuestionContainer'
import MainPageContainer from './containers/MainPageContainer';

function App() {
  const [round, setRound] = useState(0);
  const [gameOver, setGameOver] = useState(false);

  return (
    gameOver

    ?

    [
      <MainPageContainer round={round}/>,
      <h1>GAME OVER</h1>
    ]

    :

    [
    <MainPageContainer round={round}/>,
    <QuestionContainer round={round} setRound={setRound} setGameOver={setGameOver} gameOver ={gameOver}/>
    ]
  )
}

export default App;
