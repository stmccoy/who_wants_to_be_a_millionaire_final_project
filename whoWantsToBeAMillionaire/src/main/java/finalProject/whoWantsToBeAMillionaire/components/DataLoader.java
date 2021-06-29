package finalProject.whoWantsToBeAMillionaire.components;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import finalProject.whoWantsToBeAMillionaire.repositories.AnswerRepository;
import finalProject.whoWantsToBeAMillionaire.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Question questionOne = new Question("Who Wrote Harry Potter", Difficulty.ONE);
        questionRepository.save(questionOne);

        Answer q1AnswerOne = new Answer("J.K. Rowling", questionOne, true);
        answerRepository.save(q1AnswerOne);

        Answer q1AnswerTwo = new Answer("J.R.R. Tolkien", questionOne, false);
        answerRepository.save(q1AnswerTwo);

        Answer q1AnswerThree = new Answer("Terry Pratchett", questionOne, false);
        answerRepository.save(q1AnswerThree);

        Answer q1AnswerFour = new Answer("Daniel Radcliffe", questionOne, false);
        answerRepository.save(q1AnswerFour);

        Question questionTwo = new Question("Who discovered Penicillin", Difficulty.ONE);
        questionRepository.save(questionTwo);

        Answer q2AnswerOne = new Answer("Alexander Flemming", questionTwo, true);
        answerRepository.save(q2AnswerOne);

        Answer q2AnswerTwo = new Answer("Marie Curie", questionTwo, false);
        answerRepository.save(q2AnswerTwo);

        Answer q2AnswerThree = new Answer("Alfred Nobel", questionTwo, false);
        answerRepository.save(q2AnswerThree);

        Answer q2AnswerFour = new Answer("Louis Pasteur", questionTwo, false);
        answerRepository.save(q2AnswerFour);

        Question questionThree = new Question("Kanye West at 2009 VMA's interrupted which celebrity?", Difficulty.ONE);
        questionRepository.save(questionThree);

        Answer q3AnswerOne = new Answer("Taylor Swift", questionThree, true);
        answerRepository.save(q3AnswerOne);

        Answer q3AnswerTwo = new Answer("MF DOOM", questionThree, false);
        answerRepository.save(q3AnswerTwo);

        Answer q3AnswerThree = new Answer("Beyonce", questionThree, false);
        answerRepository.save(q3AnswerThree);

        Answer q3AnswerFour = new Answer("Beck", questionThree, false);
        answerRepository.save(q3AnswerFour);

        Question questionFour = new Question("The film 28 Day's Later is mainly set in which European country", Difficulty.ONE);
        questionRepository.save(questionFour);

        Answer q4AnswerOne = new Answer("United Kingdom", questionFour, true);
        answerRepository.save(q4AnswerOne);

        Answer q4AnswerTwo = new Answer("France", questionFour, false);
        answerRepository.save(q4AnswerTwo);

        Answer q4AnswerThree = new Answer("Italy", questionFour, false);
        answerRepository.save(q4AnswerThree);

        Answer q4AnswerFour = new Answer("Germany", questionFour, false);
        answerRepository.save(q4AnswerFour);

        Question questionFive = new Question("Which of these characters live in a pineapple under the sea", Difficulty.ONE);
        questionRepository.save(questionFive);

        Answer q5AnswerOne = new Answer("SpongeBob SquarePants", questionFive, true);
        answerRepository.save(q5AnswerOne);

        Answer q5AnswerTwo = new Answer("Patrick Star", questionFive, false);
        answerRepository.save(q5AnswerTwo);

        Answer q5AnswerThree = new Answer("Squidward Tentacles", questionFive, false);
        answerRepository.save(q5AnswerThree);

        Answer q5AnswerFour = new Answer("Mr. Krabs", questionFive, false);
        answerRepository.save(q5AnswerFour);

        Question questionSix = new Question("Who painted the Mona Lisa?", Difficulty.ONE);
        questionRepository.save(questionSix);

        Answer q6AnswerOne = new Answer("Leonardo da Vinci", questionSix, true);
        answerRepository.save(q6AnswerOne);

        Answer q6AnswerTwo = new Answer("Pablo Picasso", questionSix, false);
        answerRepository.save(q6AnswerTwo);

        Answer q6AnswerThree = new Answer("Claude Monet", questionSix, false);
        answerRepository.save(q6AnswerThree);

        Answer q6AnswerFour = new Answer("Vincent van Gogh", questionSix, false);
        answerRepository.save(q6AnswerFour);

        Question questionSeven = new Question("In what sport is a 'shuttlecock' used?", Difficulty.ONE);
        questionRepository.save(questionSeven);

        Answer q7AnswerOne = new Answer("Badminton", questionSeven, true);
        answerRepository.save(q7AnswerOne);

        Answer q7AnswerTwo = new Answer("Table Tennis", questionSeven, false);
        answerRepository.save(q7AnswerTwo);

        Answer q7AnswerThree = new Answer("Rugby", questionSeven, false);
        answerRepository.save(q7AnswerThree);

        Answer q7AnswerFour = new Answer("Cricket", questionSeven, false);
        answerRepository.save(q7AnswerFour);

        Question questionEight = new Question("Who is the lead singer of the band Coldplay?", Difficulty.ONE);
        questionRepository.save(questionEight);

        Answer q8AnswerOne = new Answer("Chris Martin", questionEight, true);
        answerRepository.save(q8AnswerOne);

        Answer q8AnswerTwo = new Answer("Chris Isaak", questionEight, false);
        answerRepository.save(q8AnswerTwo);

        Answer q8AnswerThree = new Answer("Chris Wallace", questionEight, false);
        answerRepository.save(q8AnswerThree);

        Answer q8AnswerFour = new Answer("Chris Connelly", questionEight, false);
        answerRepository.save(q8AnswerFour);

        Question questionNine = new Question("Alzheimer's disease primarily affects which part of the human body?", Difficulty.ONE);
        questionRepository.save(questionNine);

        Answer q9AnswerOne = new Answer("Brain", questionNine, true);
        answerRepository.save(q9AnswerOne);

        Answer q9AnswerTwo = new Answer("Lungs", questionNine, false);
        answerRepository.save(q9AnswerTwo);

        Answer q9AnswerThree = new Answer("Skin", questionNine, false);
        answerRepository.save(q9AnswerThree);

        Answer q9AnswerFour = new Answer("Heart", questionNine, false);
        answerRepository.save(q9AnswerFour);

        Question questionTen = new Question("Which punk rock band released hit songs such as 'Californication', 'Can't Stop' and 'Under the Bridge'", Difficulty.ONE);
        questionRepository.save(questionTen);

        Answer q10AnswerOne = new Answer("Red Hot Chilli Peppers", questionTen, true);
        answerRepository.save(q10AnswerOne);

        Answer q10AnswerTwo = new Answer("Green Day", questionTen, false);
        answerRepository.save(q10AnswerTwo);

        Answer q10AnswerThree = new Answer("Linkin Park", questionTen, false);
        answerRepository.save(q10AnswerThree);

        Answer q10AnswerFour = new Answer("Foo Fighters", questionTen, false);
        answerRepository.save(q10AnswerFour);

        Question questionEleven = new Question("In which city of America was the Fresh Prince of Bel-Air born and raised in?", Difficulty.ONE);
        questionRepository.save(questionEleven);

        Answer q11AnswerOne = new Answer("Philadelphia", questionEleven, true);
        answerRepository.save(q11AnswerOne);

        Answer q11AnswerTwo = new Answer("LA", questionEleven, false);
        answerRepository.save(q11AnswerTwo);

        Answer q11AnswerThree = new Answer("New York", questionEleven, false);
        answerRepository.save(q11AnswerThree);

        Answer q11AnswerFour = new Answer("Dallas", questionEleven, false);
        answerRepository.save(q11AnswerFour);

        Question questionTwelve = new Question("Who was the villain of The Lion King?", Difficulty.ONE);
        questionRepository.save(questionTwelve);

        Answer q12AnswerOne = new Answer("Scar", questionTwelve, true);
        answerRepository.save(q12AnswerOne);

        Answer q12AnswerTwo = new Answer("Fred", questionTwelve, false);
        answerRepository.save(q12AnswerTwo);

        Answer q12AnswerThree = new Answer("Jafar", questionTwelve, false);
        answerRepository.save(q12AnswerThree);

        Answer q12AnswerFour = new Answer("Vada", questionTwelve, false);
        answerRepository.save(q12AnswerFour);

        Question questionThirteen = new Question("Which former boy-band star released hit solo single 'Angels' in 1997?", Difficulty.ONE);
        questionRepository.save(questionThirteen);

        Answer q13AnswerOne = new Answer("Robbie Williams", questionThirteen, true);
        answerRepository.save(q13AnswerOne);

        Answer q13AnswerTwo = new Answer("Justin Timberlake", questionThirteen, false);
        answerRepository.save(q13AnswerTwo);

        Answer q13AnswerThree = new Answer("Harry Styles", questionThirteen, false);
        answerRepository.save(q13AnswerThree);

        Answer q13AnswerFour = new Answer("Gary Barlow", questionThirteen, false);
        answerRepository.save(q13AnswerFour);

        Question questionFourteen = new Question("When someone is cowardly, they are said to have what color belly?", Difficulty.ONE);
        questionRepository.save(questionFourteen);

        Answer q14AnswerOne = new Answer("Yellow", questionFourteen, true);
        answerRepository.save(q14AnswerOne);

        Answer q14AnswerTwo = new Answer("Green", questionFourteen, false);
        answerRepository.save(q14AnswerTwo);

        Answer q14AnswerThree = new Answer("Red", questionFourteen, false);
        answerRepository.save(q14AnswerThree);

        Answer q14AnswerFour = new Answer("Blue", questionFourteen, false);
        answerRepository.save(q14AnswerFour);

        Question questionFifteen = new Question("What is the name of Finnish DJ Darude's hit single released in October 1999?", Difficulty.ONE);
        questionRepository.save(questionFifteen);

        Answer q15AnswerOne = new Answer("Sandstorm", questionFifteen, true);
        answerRepository.save(q15AnswerOne);

        Answer q15AnswerTwo = new Answer("Dust Devil", questionFifteen, false);
        answerRepository.save(q15AnswerTwo);

        Answer q15AnswerThree = new Answer("Sirocco", questionFifteen, false);
        answerRepository.save(q15AnswerThree);

        Answer q15AnswerFour = new Answer("Khamsin", questionFifteen, false);
        answerRepository.save(q15AnswerFour);

        Question questionSixteen = new Question("Which song on Daft Punk's album 'Random Access Memories' features Pharrell Williams?", Difficulty.ONE);
        questionRepository.save(questionSixteen);

        Answer q16AnswerOne = new Answer("Sandstorm", questionSixteen, true);
        answerRepository.save(q16AnswerOne);

        Answer q16AnswerTwo = new Answer("Dust Devil", questionSixteen, false);
        answerRepository.save(q16AnswerTwo);

        Answer q16AnswerThree = new Answer("Sirocco", questionSixteen, false);
        answerRepository.save(q16AnswerThree);

        Answer q16AnswerFour = new Answer("Khamsin", questionSixteen, false);
        answerRepository.save(q16AnswerFour);

        Question questionSeventeen = new Question("Which famous cartoon features a mouse and a cat as the two main characters?", Difficulty.ONE);
        questionRepository.save(questionSeventeen);

        Answer q17AnswerOne = new Answer("Tom and Jerry", questionSeventeen, true);
        answerRepository.save(q17AnswerOne);

        Answer q17AnswerTwo = new Answer("Simpsons", questionSeventeen, false);
        answerRepository.save(q17AnswerTwo);

        Answer q17AnswerThree = new Answer("DuckTales", questionSeventeen, false);
        answerRepository.save(q17AnswerThree);

        Answer q17AnswerFour = new Answer("Futurama", questionSeventeen, false);
        answerRepository.save(q17AnswerFour);

        Question questionEighteen = new Question("What colour is the circle on the Japanese flag?", Difficulty.ONE);
        questionRepository.save(questionEighteen);

        Answer q18AnswerOne = new Answer("Red", questionEighteen, true);
        answerRepository.save(q18AnswerOne);

        Answer q18AnswerTwo = new Answer("White", questionEighteen, false);
        answerRepository.save(q18AnswerTwo);

        Answer q18AnswerThree = new Answer("Yellow", questionEighteen, false);
        answerRepository.save(q18AnswerThree);

        Answer q18AnswerFour = new Answer("Black", questionEighteen, false);
        answerRepository.save(q18AnswerFour);

        Question questionNineteen = new Question("In the movie Gremlins, after what time of day should you not feed Mogwai?", Difficulty.ONE);
        questionRepository.save(questionNineteen);

        Answer q19AnswerOne = new Answer("Midnight", questionNineteen, true);
        answerRepository.save(q19AnswerOne);

        Answer q19AnswerTwo = new Answer("Evening", questionNineteen, false);
        answerRepository.save(q19AnswerTwo);

        Answer q19AnswerThree = new Answer("Morning", questionNineteen, false);
        answerRepository.save(q19AnswerThree);

        Answer q19AnswerFour = new Answer("Afternoon", questionNineteen, false);
        answerRepository.save(q19AnswerFour);

        Question questionTwenty = new Question("What do the letters of the fast food chain KFC stand for?", Difficulty.ONE);
        questionRepository.save(questionTwenty);

        Answer q20AnswerOne = new Answer("Kentucky Fried Chicken", questionTwenty, true);
        answerRepository.save(q20AnswerOne);

        Answer q20AnswerTwo = new Answer("Kentucky Fresh Cheese", questionTwenty, false);
        answerRepository.save(q20AnswerTwo);

        Answer q20AnswerThree = new Answer("Kibbled Freaky Cow", questionTwenty, false);
        answerRepository.save(q20AnswerThree);

        Answer q20AnswerFour = new Answer("Kiwi Food Cut", questionTwenty, false);
        answerRepository.save(q20AnswerFour);




    }
}
