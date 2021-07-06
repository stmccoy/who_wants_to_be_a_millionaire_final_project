import React, {useState, useEffect} from 'react';
import RoundTrackerComponent from '../components/mainPageContainerComponents/RoundTrackerComponent';
import LifeLinesComponent from '../components/mainPageContainerComponents/LifeLinesComponent';
import CentralTitleComponent from '../components/mainPageContainerComponents/CentralTitleComponent';
import Request from '../helpers/request';

function MainPageContainer({round, correctAnswer, setCanClick, fiftyFiftyDecides, setFiftyFiftyDecides, phoneAFriendDecides, setPhoneAFriendDecides, askTheAudienceDecides, setAskTheAudienceDecides, HarderQuestionsMusic, firstFiveQuestionsAudio, AskTheAudienceMusic, PhoneAFriendMusic, correctAnswerOneHundredToOneThousand, restartAllSoundEffects, canClick}){

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
        if(canClick){
            setCanClick(false);
            if(event.target.id == "50-50-logo"){
                setAskTheAudienceDecides(false);
                setPhoneAFriendDecides(false)
                setAskFiftyFifty(true);
                setTimeout(() => {
                    correctAnswerOneHundredToOneThousand.play();
                }, 2750)
                setTimeout(() => {
                    // if(round<= 3){
                    //     firstFiveQuestionsAudio.play()
                    // }else{
                    //     HarderQuestionsMusic.play()
                    // }
                    setAskFiftyFifty(false); 
                    setFiftyFiftyDecides(true);
                    setUsedFiftyFifty(true);
                    restartAllSoundEffects()
                    // setCanClick(true);
                }, 3000)
                // setTimeout(() => {
                //     setUsedFiftyFifty(true);
                //     setCanClick(true);
                // }, 10000)

            }else if (event.target.id == "ask-the-audience-logo"){
                setPhoneAFriendDecides(false)
                AskTheAudienceMusic.play();
                setAskTheAudience(true);
                setTimeout(() => {
                    firstFiveQuestionsAudio.pause();
                    HarderQuestionsMusic.pause();
                }, 250)
                setTimeout(() => {
                    setAskTheAudience(false);
                    setAskTheAudienceDecides(true);
                }, 8500)
                setTimeout(() => {
                    if(round<= 3){
                        firstFiveQuestionsAudio.play()
                    }else{
                        HarderQuestionsMusic.play()
                    }
                    // setAskTheAudience(false);
                    // setAskTheAudienceDecides(true)
                    setUsedAskTheAudience(true);
                    restartAllSoundEffects()
                    // setCanClick(true);
                }, 10000)
                // setTimeout(() => {
                //     setUsedAskTheAudience(true);
                //     setCanClick(true);
                // }, 10000)
            } else{
                setAskTheAudienceDecides(false)
                setAskPhoneAFriend(true);
                PhoneAFriendMusic.play();
                setTimeout(() => {
                    firstFiveQuestionsAudio.pause();
                    HarderQuestionsMusic.pause();
                }, 250)
                setTimeout(() => {
                    setAskPhoneAFriend(false);
                    setPhoneAFriendDecides(true)
                }, 9500)
                setTimeout(() => {
                    if(round<= 3){
                        firstFiveQuestionsAudio.play()
                    }else{
                        HarderQuestionsMusic.play()
                    }
                    setUsedPhoneAFriend(true);
                    restartAllSoundEffects()
                    // setCanClick(true);
                }, 11000)
                // setTimeout(() => {
                //     setUsedPhoneAFriend(true);
                //     setCanClick(true);
                // }, 10000)
            }
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