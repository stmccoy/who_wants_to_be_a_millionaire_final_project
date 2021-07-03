import { useState } from 'react';
import logo from './logo.svg';
import './CSS/style.css';
import QuestionContainer from './containers/QuestionContainer'
import MainPageContainer from './containers/MainPageContainer';
import GameOverComponent from './components/gameOverComponents/gameOverComponents';

function App() {
  const [round, setRound] = useState(0);
  const [gameOver, setGameOver] = useState(false);
  const [fiftyFiftyDecides, setFiftyFiftyDecides] = useState(false)
  const [phoneAFriendDecides, setPhoneAFriendDecides] = useState(false)
  const [askTheAudienceDecides, setAskTheAudienceDecides] = useState(false)

  //correct answer value
  const [correctAnswer, setCorrectAnswer] = useState(null);

  // set whether person can click on answers or not
  const [canClick, setCanClick] = useState(true);


  return (

    [

    <MainPageContainer round={round} correctAnswer={correctAnswer} setCanClick={setCanClick} fiftyFiftyDecides={fiftyFiftyDecides} setFiftyFiftyDecides={setFiftyFiftyDecides} phoneAFriendDecides={phoneAFriendDecides}setPhoneAFriendDecides={setPhoneAFriendDecides} askTheAudienceDecides={askTheAudienceDecides} setAskTheAudienceDecides={setAskTheAudienceDecides}/>
    ,

    gameOver

    ?

    <GameOverComponent/>

    :

    <QuestionContainer round={round} setRound={setRound} setGameOver={setGameOver} gameOver ={gameOver} correctAnswer={correctAnswer} setCorrectAnswer={setCorrectAnswer} canClick={canClick} setCanClick={setCanClick} fiftyFiftyDecides={fiftyFiftyDecides} setFiftyFiftyDecides={setFiftyFiftyDecides} phoneAFriendDecides={phoneAFriendDecides} setPhoneAFriendDecides={setPhoneAFriendDecides} askTheAudienceDecides={askTheAudienceDecides} setAskTheAudienceDecides={setAskTheAudienceDecides}/>
    ]
  )
}

export default App;
