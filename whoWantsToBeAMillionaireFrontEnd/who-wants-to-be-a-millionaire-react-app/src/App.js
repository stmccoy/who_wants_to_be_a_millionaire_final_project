import logo from './logo.svg';
import './App.css';
import QuestionContainer from './containers/QuestionContainer'
import MainPageContainer from './containers/MainPageContainer';

function App() {
  return (
    [
    <MainPageContainer/>,
    <QuestionContainer/>
    ]
  )
}

export default App;
