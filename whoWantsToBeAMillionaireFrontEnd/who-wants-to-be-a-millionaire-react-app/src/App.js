import { useState } from 'react';
import logo from './logo.svg';
import './CSS/style.css';
import QuestionContainer from './containers/QuestionContainer'
import MainPageContainer from './containers/MainPageContainer';

function App() {
  const [round, setRound] = useState(0);
  const [gameOver, setGameOver] = useState(false);
  const [fiftyFiftyDecides, setFiftyFiftyDecides] = useState(false)

  //correct answer value
  const [correctAnswer, setCorrectAnswer] = useState(null);

  // set whether person can click on answers or not
  const [canClick, setCanClick] = useState(true);


  return (
    gameOver

    ?

    [
      <MainPageContainer round={round}/>,
      <h1>GAME OVER</h1>
    ]

    :

    [
    <MainPageContainer round={round} correctAnswer={correctAnswer} setCanClick={setCanClick} fiftyFiftyDecides={fiftyFiftyDecides} setFiftyFiftyDecides={setFiftyFiftyDecides}/>
    ,
    <QuestionContainer round={round} setRound={setRound} setGameOver={setGameOver} gameOver ={gameOver} correctAnswer={correctAnswer} setCorrectAnswer={setCorrectAnswer} canClick={canClick} setCanClick={setCanClick} fiftyFiftyDecides={fiftyFiftyDecides}/>
    ]
  )
}

export default App;
