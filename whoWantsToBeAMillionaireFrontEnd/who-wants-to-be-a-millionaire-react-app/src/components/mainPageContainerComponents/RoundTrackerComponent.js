import React from 'react';

function RoundTrackerComponent({rounds, round}){

    const roundsList = rounds.map( (item) => {
        return (<li key={item.roundValue} className={item.id -1 === round ? "current" : "not-current"} value={item.roundValue}>{item.roundDisplayString}</li>)
    });

    return(
        <aside className="round-tracker">
           <ul className="rounds">
               {roundsList}
           </ul>
        </aside>
    )
}

export default RoundTrackerComponent;