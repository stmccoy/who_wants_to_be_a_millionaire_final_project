import React from 'react';
import './RoundTracker.css'

function RoundTrackerComponent({rounds, round}){

    const roundsList = rounds.map( (item) => {
        return (<li key={item.roundValue} className={item.id -1 === round ? "current" : "not-current"} value={item.roundValue}>{item.roundDisplayString}</li>)
    });

    return(
        <aside>
           <ul>
               {roundsList}
           </ul>
        </aside>
    )
}

export default RoundTrackerComponent;