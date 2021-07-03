import React from 'react';

function CentralTitleComponent ({askFiftyFifty, askPhoneAFriend, askTheAudience, correctAnswer, fiftyFiftyDecides, phoneAFriendDecides, askTheAudienceDecides}){
    return (
        <section>
            <img src="./images/who-wants-to-be-a-millionaire-logo.png" alt="who wants to be a millionaire logo" id="millionaire-logo"/>
            {askFiftyFifty 
            ?
            <p>
                fiftyFifty loading
            </p>
            :
            null
            }
            {fiftyFiftyDecides 
            ?
            <p>
                fiftyFifty chooses {correctAnswer}
            </p>
            :
            null
            }
            {askTheAudience 
            ?
            <p>
                Audience is thinking
            </p>
            :
            null}
            {askTheAudienceDecides 
            ?
            <p>
                Audience chooses {correctAnswer}
            </p>
            :
            null}
            {askPhoneAFriend 
            ?
            <p>
                Friend is thinking
            </p>
            :
            null}
            {phoneAFriendDecides 
            ?
            <p>
                Friend thinks it's {correctAnswer}
            </p>
            :
            null}

        </section>
    )
}

export default CentralTitleComponent;