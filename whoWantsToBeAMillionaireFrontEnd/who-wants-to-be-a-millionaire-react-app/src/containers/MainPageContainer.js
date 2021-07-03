import React, {useState, useEffect} from 'react';
import RoundTrackerComponent from '../components/mainPageContainerComponents/RoundTrackerComponent';
import LifeLinesComponent from '../components/mainPageContainerComponents/LifeLinesComponent';
import CentralTitleComponent from '../components/mainPageContainerComponents/CentralTitleComponent';
import Request from '../helpers/request';

function MainPageContainer({round, correctAnswer, setCanClick, fiftyFiftyDecides, setFiftyFiftyDecides, phoneAFriendDecides, setPhoneAFriendDecides, askTheAudienceDecides, setAskTheAudienceDecides}){

    const [rounds, setRounds] = useState([])

    const [askFiftyFifty, setAskFiftyFifty] = useState(false)
    const [usedFiftyFifty, setUsedFiftyFifty] = useState(false)

    const [askPhoneAFriend, setAskPhoneAFriend] = useState(false)
    const [usedPhoneAFriend, setUsedPhoneAFriend] = useState(false)

    const [askTheAudience, setAskTheAudience] = useState(false)
    const [usedAskTheAudience, setUsedAskTheAudience] = useState(false)

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
        setCanClick(false);
        if(event.target.id == "50-50-logo"){
            setAskFiftyFifty(true);
            setTimeout(() => {
                setAskFiftyFifty(false); 
                setFiftyFiftyDecides(true)
            }, 5000)
            setTimeout(() => {
                setUsedFiftyFifty(true);
                setCanClick(true);
            }, 10000)

        }else if (event.target.id == "ask-the-audience-logo"){
            setAskTheAudience(true);
            setTimeout(() => {
                setAskTheAudience(false);
                setAskTheAudienceDecides(true)
            }, 5000)
            setTimeout(() => {
                setUsedAskTheAudience(true);
                setCanClick(true);
            }, 10000)
        } else{
            setAskPhoneAFriend(true);
            setTimeout(() => {
                setAskPhoneAFriend(false);
                setPhoneAFriendDecides(true)
            }, 5000)
            setTimeout(() => {
                setUsedPhoneAFriend(true);
                setCanClick(true);
            }, 10000)
        }
    }

    return(
        <section className="main-page">
            <LifeLinesComponent handleLifeLineClick= {handleLifeLineClick} usedFiftyFifty={usedFiftyFifty} usedPhoneAFriend={usedPhoneAFriend} usedAskTheAudience={usedAskTheAudience}/>
            <CentralTitleComponent askFiftyFifty={askFiftyFifty} askTheAudience={askTheAudience} askPhoneAFriend={askPhoneAFriend} correctAnswer={correctAnswer} fiftyFiftyDecides={fiftyFiftyDecides} phoneAFriendDecides={phoneAFriendDecides} askTheAudienceDecides={askTheAudienceDecides}/>
            <RoundTrackerComponent rounds={rounds} round={round}/>
        </section>
    )
}

export default MainPageContainer;