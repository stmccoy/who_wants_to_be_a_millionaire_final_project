import React from 'react';

function LifeLinesComponent({handleLifeLineClick, usedFiftyFifty, usedPhoneAFriend, usedAskTheAudience}){
    return (
        <aside className="life-lines">
            <div>
                {usedFiftyFifty
                ?
                <img src="./images/Classic5050used.png" className="used-life-lines-pictures" alt="Used 50-50 logo" id="Used-50-50-logo"/>
                :
                <img onClick={handleLifeLineClick} src="./images/Classic5050.png" className="life-lines-pictures" alt="50-50 logo" id="50-50-logo"/>
                }   
            </div>
            <div>
                {usedAskTheAudience
                ?              
                <img src="./images/ClassicATAused.png" className="used-life-lines-pictures" alt="Used Ask The Audience logo" id="used-ask-the-audience-logo"/>
                :
                <img onClick={handleLifeLineClick} src="./images/ClassicATA.png" className="life-lines-pictures" alt="Ask The Audience logo" id="ask-the-audience-logo"/>               
                }
            </div>
            <div>
                {usedPhoneAFriend
                ?
                <img onClick={handleLifeLineClick} src="./images/ClassicPAFused.png" className="used-life-lines-pictures" alt="Used Phone A Friend Logo" id="used-phone-a-friend-logo"/>
                :
                <img onClick={handleLifeLineClick} src="./images/ClassicPAF.png" className="life-lines-pictures" alt="Phone A Friend Logo" id="phone-a-friend-logo"/>
                }
            </div>
        </aside>
    )
}

export default LifeLinesComponent;