import React from 'react';

function LifeLinesComponent({handleLifeLineClick}){
    return (
        <aside className="life-lines">
            <div>
                <img onClick={handleLifeLineClick} src="./images/Classic5050.png" className="life-lines-pictures" alt="50-50 logo" id="50-50-logo"/>
            </div>
            <div>
                <img onClick={handleLifeLineClick} src="./images/ClassicATA.png" className="life-lines-pictures" alt="Ask The Audience logo" id="ask-the-audience-logo"/>
            </div>
            <div>
                <img onClick={handleLifeLineClick} src="./images/ClassicPAF.png" className="life-lines-pictures" alt="Phone A Friend Logo" id="phone-a-friend-logo"/>
            </div>
        </aside>
    )
}

export default LifeLinesComponent;