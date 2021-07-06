import { useState } from 'react';
import logo from './logo.svg';
import './CSS/style.css';
import QuestionContainer from './containers/QuestionContainer'
import MainPageContainer from './containers/MainPageContainer';
import GameOverComponent from './components/gameOverComponents/gameOverComponents';
import StartGameComponent from './components/gameOverComponents/StartGameComponent';

function App() {
  const [round, setRound] = useState(0);
  const [gameStart, setGameStart] = useState(false);
  const [gameOver, setGameOver] = useState(false);
  const [fiftyFiftyDecides, setFiftyFiftyDecides] = useState(false)
  const [phoneAFriendDecides, setPhoneAFriendDecides] = useState(false)
  const [askTheAudienceDecides, setAskTheAudienceDecides] = useState(false)
  const [gameWon, setGameWon] = useState(false);
  const [startClick, setStartClick] = useState(false)

  //correct answer value
  const [correctAnswer, setCorrectAnswer] = useState(null);

  // set whether person can click on answers or not
  const [canClick, setCanClick] = useState(true);


  //audio states
  const [startGameSound, setStartGameSound] = useState(new Audio('/audio/StartGameSound.mp3'))
  const [firstFiveQuestionsAudio, setFirstFiveQuestionsAudio] = useState(new Audio('/audio/FirstFiveQuestionsAudio.mp3'))
  const [correctAnswerAudio, setCorrectAnswerAudio] = useState(new Audio('/audio/CorrectAnswer.mp3'))

  const [correctAnswerOneHundredToOneThousand, setCorrectAnswerOneHundredToOneThousand] = useState(new Audio('/audio/askTheAudienceEnding.mp3') )

  const [wrongAnswerAudioOnehundredToOneThousandAudio, setWrongAnswerAudioOnehundredToOneThousandAudio] = useState(new Audio('/audio/LoseOneHundredToOneThousand.mp3'))
  const [wrongAnswerHarderQuestions, setWrongAnswerHarderQuestions] = useState(new Audio('/audio/HarderQuestionsLose.mp3'))

  const [OneThousandPoundsWinAudio, setOneThousandPoundsWinAudio] = useState(new Audio('/audio/OneThousandPoundWin.mp3'))
  const [HarderQuestionsMusic, setHarderQuestionsMusic] = useState(new Audio('/audio/HarderQuestionsMusic.mp3'))

  const [HarderQuestionAnswerSelected, setHarderQuestionAnswerSelected] = useState(new Audio('/audio/HarderQuestionsFinalAnswer.mp3'))

  const [OneMillionDollarWin, setOneMillionDollarWin] = useState(new Audio('/audio/OneMillionWin.mp3'))

  const [AskTheAudienceMusic, setAskTheAudienceMusic] = useState(new Audio('/audio/AskTheAudience.mp3'))

  const [PhoneAFriendMusic, setPhoneAFriendMusic] = useState(new Audio('/audio/PhoneAFriend.mp3'))

  const [StartGameAudio, setStartGameAudio] = useState(new Audio('/audio/StartGame.mp3'))

  const [fiftyFiftySelectSound, setFifFiftySelectSound] = useState(new Audio('/audio/FiftyFiftySelect.mp3'))

  const restartAllSoundEffects = function() {
    setStartGameSound(new Audio('/audio/StartGameSound.mp3'))
    setCorrectAnswerAudio(new Audio('/audio/CorrectAnswer.mp3'))
    setWrongAnswerAudioOnehundredToOneThousandAudio(new Audio('/audio/LoseOneHundredToOneThousand.mp3'))
    setOneThousandPoundsWinAudio(new Audio('/audio/OneThousandPoundWin.mp3'))
    setHarderQuestionAnswerSelected(new Audio('/audio/HarderQuestionsFinalAnswer.mp3'))
    setFifFiftySelectSound(new Audio('/audio/FiftyFiftySelect.mp3'))
    setAskTheAudienceMusic(new Audio('/audio/AskTheAudience.mp3'))
    setPhoneAFriendMusic(new Audio('/audio/PhoneAFriend.mp3'))
    setCanClick(true)
  }

  const handleStartClick = function(){
    setStartClick(true);
    StartGameAudio.play();
    setTimeout(() => {
      setGameStart(true);
      firstFiveQuestionsAudio.play();
    }, 14000)
    setTimeout(() => {
      StartGameAudio.pause();
      restartAllSoundEffects();
      setStartClick(false)
    }, 14500)
    
  }

  return (

    gameStart 
    
    ?

      [

      <MainPageContainer round={round} correctAnswer={correctAnswer} setCanClick={setCanClick} fiftyFiftyDecides={fiftyFiftyDecides} setFiftyFiftyDecides={setFiftyFiftyDecides} phoneAFriendDecides={phoneAFriendDecides}setPhoneAFriendDecides={setPhoneAFriendDecides} askTheAudienceDecides={askTheAudienceDecides} setAskTheAudienceDecides={setAskTheAudienceDecides} firstFiveQuestionsAudio={firstFiveQuestionsAudio} HarderQuestionsMusic={HarderQuestionsMusic} AskTheAudienceMusic={AskTheAudienceMusic} PhoneAFriendMusic={PhoneAFriendMusic} correctAnswerOneHundredToOneThousand={correctAnswerOneHundredToOneThousand} restartAllSoundEffects={restartAllSoundEffects} canClick={canClick} fiftyFiftySelectSound={fiftyFiftySelectSound}/>
      ,

      gameOver

      ?

      <GameOverComponent gameWon={gameWon}/>

      :

      <QuestionContainer round={round} setRound={setRound} setGameOver={setGameOver} gameOver ={gameOver} correctAnswer={correctAnswer} setCorrectAnswer={setCorrectAnswer} canClick={canClick} setCanClick={setCanClick} fiftyFiftyDecides={fiftyFiftyDecides} setFiftyFiftyDecides={setFiftyFiftyDecides} phoneAFriendDecides={phoneAFriendDecides} setPhoneAFriendDecides={setPhoneAFriendDecides} askTheAudienceDecides={askTheAudienceDecides} setAskTheAudienceDecides={setAskTheAudienceDecides} firstFiveQuestionsAudio={firstFiveQuestionsAudio} correctAnswerAudio={correctAnswerAudio} wrongAnswerAudioOnehundredToOneThousandAudio={wrongAnswerAudioOnehundredToOneThousandAudio} OneThousandPoundsWinAudio={OneThousandPoundsWinAudio} HarderQuestionsMusic= {HarderQuestionsMusic} startGameSound={startGameSound} restartAllSoundEffects={restartAllSoundEffects} wrongAnswerHarderQuestions={wrongAnswerHarderQuestions} HarderQuestionAnswerSelected={HarderQuestionAnswerSelected} OneMillionDollarWin={OneMillionDollarWin} setGameWon={setGameWon} correctAnswerOneHundredToOneThousand={correctAnswerOneHundredToOneThousand}/>
      ]
    
    :

    <StartGameComponent handleStartClick={handleStartClick} startClick={startClick}/>

  )
}

export default App;
