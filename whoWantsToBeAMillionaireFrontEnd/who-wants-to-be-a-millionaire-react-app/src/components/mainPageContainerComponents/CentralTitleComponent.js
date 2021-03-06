import React from 'react';

function CentralTitleComponent ({askFiftyFifty, askPhoneAFriend, askTheAudience, correctAnswer, fiftyFiftyDecides, phoneAFriendDecides, askTheAudienceDecides}){
    return (
        <section>
            <div>
                <img src="./images/who-wants-to-be-a-millionaire-logo-2.png" alt="who wants to be a millionaire logo" id="millionaire-logo"/>
            </div>
            {askPhoneAFriend 
            ?
            <div>
                <img src="./images/phone-a-friend-clock.gif" alt="clock counting down" id="phone-a-friend-clock"/>
            </div>
            :
            null}
            {phoneAFriendDecides 
            ?
            <h2 class="life-line-response">
                Friend thinks it's {correctAnswer}
            </h2>
            :
            null}
            {askTheAudienceDecides 
            ?
            <h2 class="life-line-response">
                Audience chooses {correctAnswer}
            </h2>
            :
            null}

        </section>
    )
}

export default CentralTitleComponent;