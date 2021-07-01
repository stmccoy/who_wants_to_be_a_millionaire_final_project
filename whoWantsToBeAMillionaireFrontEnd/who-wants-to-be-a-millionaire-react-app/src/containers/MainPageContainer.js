import React, {useState, useEffect} from 'react';
import RoundTrackerComponent from '../components/mainPageContainerComponents/RoundTrackerComponent';
import LifeLinesComponent from '../components/mainPageContainerComponents/LifeLinesComponent';
import CentralTitleComponent from '../components/mainPageContainerComponents/CentralTitleComponent';
import Request from '../helpers/request';

function MainPageContainer({round}){

    const [rounds, setRounds] = useState([])

    // fetch request for questions based upon difficulty rating that the player is currently on
    const findRounds = function(){
        const request = new Request();
        request.get('http://localhost:8080/rounds/')
            .then(res => setRounds(res))
    }

    useEffect(() => {
        findRounds();
    }, [])

    return(
        <section>
            Main Page ContainerContent
            <LifeLinesComponent/>
            <CentralTitleComponent/>
            <RoundTrackerComponent rounds={rounds} round={round}/>
        </section>
    )
}

export default MainPageContainer;