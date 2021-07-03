import React from 'react';

function CentralTitleComponent ({fiftyFifty, phoneAFriend, askTheAudience}){
    return (
        <section>
            <img src="./images/who-wants-to-be-a-millionaire-logo.png" alt="who wants to be a millionaire logo" id="millionaire-logo"/>
            {fiftyFifty 
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
            {phoneAFriend 
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