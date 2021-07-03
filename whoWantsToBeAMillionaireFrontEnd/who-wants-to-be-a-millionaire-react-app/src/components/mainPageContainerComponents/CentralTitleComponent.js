import React from 'react';

function CentralTitleComponent ({askFiftyFifty, askPhoneAFriend, askTheAudience}){
    return (
        <section>
            <img src="./images/who-wants-to-be-a-millionaire-logo.png" alt="who wants to be a millionaire logo" id="millionaire-logo"/>
            {askFiftyFifty 
            ?
            <p>
                fiftyFifty loading
            </p>
            :
            null}
            {askTheAudience 
            ?
            <p>
                Audience thinking
            </p>
            :
            null}
            {askPhoneAFriend 
            ?
            <p>
                Friend thinking
            </p>
            :
            null}

        </section>
    )
}

export default CentralTitleComponent;