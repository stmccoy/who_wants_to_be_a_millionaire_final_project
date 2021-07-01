import React from 'react';
import RoundTrackerComponent from '../components/mainPageContainerComponents/RoundTrackerComponent';
import LifeLinesComponent from '../components/mainPageContainerComponents/LifeLinesComponent'
import CentralTitleComponent from '../components/mainPageContainerComponents/CentralTitleComponent'

function MainPageContainer(){
    return(
        <section>
            Main Page ContainerContent
            <LifeLinesComponent/>
            <CentralTitleComponent/>
            <RoundTrackerComponent/>
        </section>
    )
}

export default MainPageContainer;