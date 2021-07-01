import { useState } from 'react';
import logo from './logo.svg';
import './App.css';
import QuestionContainer from './containers/QuestionContainer'
import MainPageContainer from './containers/MainPageContainer';

function App() {
  const [round, setRound] = useState(0);

  return (
    [
    <MainPageContainer round={round}/>,
    <QuestionContainer round={round} setRound={setRound}/>
    ]
  )
}

export default App;
