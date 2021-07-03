import React from 'react';

function CentralTitleComponent ({askFiftyFifty, askPhoneAFriend, askTheAudience, correctAnswer}){
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
                Audience thinks it's {correctAnswer}
            </p>
            :
            null}
            {askPhoneAFriend 
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