import React, {useState, useEffect} from 'react';
import RoundTrackerComponent from '../components/mainPageContainerComponents/RoundTrackerComponent';
import LifeLinesComponent from '../components/mainPageContainerComponents/LifeLinesComponent';
import CentralTitleComponent from '../components/mainPageContainerComponents/CentralTitleComponent';
import Request from '../helpers/request';

function MainPageContainer({round}){

    const [rounds, setRounds] = useState([])
    const [fiftyFifty, setfiftyFifty] = useState(false)
    const [phoneAFriend, setPhoneAFriend] = useState(false)
    const [askTheAudience, setAskTheAudience] = useState(false)

    // fetch request for questions based upon difficulty rating that the player is currently on
    const findRounds = function(){
        const request = new Request();
        request.get('http://localhost:8080/rounds/')
            .then(res => setRounds(res.reverse()))
    }

    useEffect(() => {
        findRounds();
    }, [])

    const handleLifeLineClick = function(event){
        if(event.target.id == "50-50-logo"){
            setfiftyFifty(true);
            setTimeout(() => {setfiftyFifty(false)}, 5000)
        }else if (event.target.id == "ask-the-audience-logo"){
            setAskTheAudience(true);
            setTimeout(() => {setAskTheAudience(false)}, 5000)
        } else{
            setPhoneAFriend(true);
            setTimeout(() => {setPhoneAFriend(false)}, 5000)
        }
    }

    return(
        <section className="main-page">
            <LifeLinesComponent handleLifeLineClick= {handleLifeLineClick}/>
            <CentralTitleComponent fiftyFifty={fiftyFifty} askTheAudience={askTheAudience} phoneAFriend={phoneAFriend}/>
            <RoundTrackerComponent rounds={rounds} round={round}/>
        </section>
    )
}

export default MainPageContainer;