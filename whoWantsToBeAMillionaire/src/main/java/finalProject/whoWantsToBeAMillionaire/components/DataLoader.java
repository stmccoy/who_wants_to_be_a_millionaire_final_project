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

        Question questionFour = new Question("What is the capital of Scotland?", Difficulty.ONE);
        questionRepository.save(questionFour);

        Answer q4AnswerOne = new Answer("Edinburgh", questionFour, true);
        answerRepository.save(q4AnswerOne);

        Answer q4AnswerTwo = new Answer("Glasgow", questionFour, false);
        answerRepository.save(q4AnswerTwo);

        Answer q4AnswerThree = new Answer("Dundee", questionFour, false);
        answerRepository.save(q4AnswerThree);

        Answer q4AnswerFour = new Answer("London", questionFour, false);
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

        Question questionFifteen = new Question("Who is the star of the AMC series Breaking Bad?", Difficulty.ONE);
        questionRepository.save(questionFifteen);

        Answer q15AnswerOne = new Answer("Walter White", questionFifteen, true);
        answerRepository.save(q15AnswerOne);

        Answer q15AnswerTwo = new Answer("Saul Goodman", questionFifteen, false);
        answerRepository.save(q15AnswerTwo);

        Answer q15AnswerThree = new Answer("Jesse Pinkman", questionFifteen, false);
        answerRepository.save(q15AnswerThree);

        Answer q15AnswerFour = new Answer("Skyler White", questionFifteen, false);
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

        Question questionTwentyOne = new Question("Which of these is NOT a Disney cartoon character?", Difficulty.TWO);
        questionRepository.save(questionTwentyOne);

        Answer q21AnswerOne = new Answer("Daffy Duck", questionTwentyOne, true);
        answerRepository.save(q21AnswerOne);

        Answer q21AnswerTwo = new Answer("Donald Duck", questionTwentyOne, false);
        answerRepository.save(q21AnswerTwo);

        Answer q21AnswerThree = new Answer("Scrooge McDuck", questionTwentyOne, false);
        answerRepository.save(q21AnswerThree);

        Answer q21AnswerFour = new Answer("Dumbo", questionTwentyOne, false);
        answerRepository.save(q21AnswerFour);

        Question questionTwentyTwo = new Question("Which UK country features a dragon on their flag?", Difficulty.TWO);
        questionRepository.save(questionTwentyTwo);

        Answer q22AnswerOne = new Answer("Wales", questionTwentyTwo, true);
        answerRepository.save(q22AnswerOne);

        Answer q22AnswerTwo = new Answer("England", questionTwentyTwo, false);
        answerRepository.save(q22AnswerTwo);

        Answer q22AnswerThree = new Answer("North Ireland", questionTwentyTwo, false);
        answerRepository.save(q22AnswerThree);

        Answer q22AnswerFour = new Answer("Scotland", questionTwentyTwo, false);
        answerRepository.save(q22AnswerFour);

        Question questionTwentyThree = new Question("Which city is the capital of the United States of America?", Difficulty.TWO);
        questionRepository.save(questionTwentyThree);

        Answer q23AnswerOne = new Answer("Washington D.C", questionTwentyThree, true);
        answerRepository.save(q23AnswerOne);

        Answer q23AnswerTwo = new Answer("Seattle", questionTwentyThree, false);
        answerRepository.save(q23AnswerTwo);

        Answer q23AnswerThree = new Answer("Albany", questionTwentyThree, false);
        answerRepository.save(q23AnswerThree);

        Answer q23AnswerFour = new Answer("Los Angeles", questionTwentyThree, false);
        answerRepository.save(q23AnswerFour);

        Question questionTwentyFour = new Question("What is the capital of India?", Difficulty.TWO);
        questionRepository.save(questionTwentyFour);

        Answer q24AnswerOne = new Answer("New Delhi", questionTwentyFour, true);
        answerRepository.save(q24AnswerOne);

        Answer q24AnswerTwo = new Answer("Bejing", questionTwentyFour, false);
        answerRepository.save(q24AnswerTwo);

        Answer q24AnswerThree = new Answer("Montreal", questionTwentyFour, false);
        answerRepository.save(q24AnswerThree);

        Answer q24AnswerFour = new Answer("Tithi", questionTwentyFour, false);
        answerRepository.save(q24AnswerFour);

        Question questionTwentyFive = new Question("Which actor portrays 'Walter White' in the series 'Breaking Bad&quot'?", Difficulty.TWO);
        questionRepository.save(questionTwentyFive);

        Answer q25AnswerOne = new Answer("Bryan Cranston", questionTwentyFive, true);
        answerRepository.save(q25AnswerOne);

        Answer q25AnswerTwo = new Answer("Andrew Lincoln", questionTwentyFive, false);
        answerRepository.save(q25AnswerTwo);

        Answer q25AnswerThree = new Answer("Aaron Paul", questionTwentyFive, false);
        answerRepository.save(q25AnswerThree);

        Answer q25AnswerFour = new Answer("RJ Mitte", questionTwentyFive, false);
        answerRepository.save(q25AnswerFour);

        Question questionTwentySix = new Question("The Kiwi is a flightless bird native to which country?", Difficulty.TWO);
        questionRepository.save(questionTwentySix);

        Answer q26AnswerOne = new Answer("New Zealand", questionTwentySix, true);
        answerRepository.save(q26AnswerOne);

        Answer q26AnswerTwo = new Answer("South Africa", questionTwentySix, false);
        answerRepository.save(q26AnswerTwo);

        Answer q26AnswerThree = new Answer("Australia", questionTwentySix, false);
        answerRepository.save(q26AnswerThree);

        Answer q26AnswerFour = new Answer("Madagascar", questionTwentySix, false);
        answerRepository.save(q26AnswerFour);

        Question questionTwentySeven = new Question("What is the name of Finnish DJ Darude's hit single released in October 1999?", Difficulty.TWO);
        questionRepository.save(questionTwentySeven);

        Answer q27AnswerOne = new Answer("Sandstorm", questionTwentySeven, true);
        answerRepository.save(q27AnswerOne);

        Answer q27AnswerTwo = new Answer("Dust Devil", questionTwentySeven, false);
        answerRepository.save(q27AnswerTwo);

        Answer q27AnswerThree = new Answer("Sirocco", questionTwentySeven, false);
        answerRepository.save(q27AnswerThree);

        Answer q27AnswerFour = new Answer("Khamsin", questionTwentySeven, false);
        answerRepository.save(q27AnswerFour);

        Question questionTwentyEight = new Question("Who is the lead singer of Foo Fighters?", Difficulty.TWO);
        questionRepository.save(questionTwentyEight);

        Answer q28AnswerOne = new Answer("Dave Grohl", questionTwentyEight, true);
        answerRepository.save(q28AnswerOne);

        Answer q28AnswerTwo = new Answer("Dave Mustaine", questionTwentyEight, false);
        answerRepository.save(q28AnswerTwo);

        Answer q28AnswerThree = new Answer("James Hetfield", questionTwentyEight, false);
        answerRepository.save(q28AnswerThree);

        Answer q28AnswerFour = new Answer("Little Red Riding Hood", questionTwentyEight, false);
        answerRepository.save(q28AnswerFour);

        Question questionTwentyNine = new Question("George Orwell wrote this book, which is often considered a statement on government oversight.", Difficulty.TWO);
        questionRepository.save(questionTwentyNine);

        Answer q29AnswerOne = new Answer("1984", questionTwentyNine, true);
        answerRepository.save(q29AnswerOne);

        Answer q29AnswerTwo = new Answer("The Old Man and the Sea", questionTwentyNine, false);
        answerRepository.save(q29AnswerTwo);

        Answer q29AnswerThree = new Answer("Catcher and the Rye", questionTwentyNine, false);
        answerRepository.save(q29AnswerThree);

        Answer q29AnswerFour = new Answer("To Kill a Mockingbird", questionTwentyNine, false);
        answerRepository.save(q29AnswerFour);

        Question questionThirty = new Question("What is the capital of South Korea?", Difficulty.TWO);
        questionRepository.save(questionThirty);

        Answer q30AnswerOne = new Answer("Seoul", questionThirty, true);
        answerRepository.save(q30AnswerOne);

        Answer q30AnswerTwo = new Answer("Pyongyang", questionThirty, false);
        answerRepository.save(q30AnswerTwo);

        Answer q30AnswerThree = new Answer("Taegu", questionThirty, false);
        answerRepository.save(q30AnswerThree);

        Answer q30AnswerFour = new Answer("Kitakyushu", questionThirty, false);
        answerRepository.save(q30AnswerFour);

        Question questionThirtyOne = new Question("The film 28 Day's Later is mainly set in which European country?", Difficulty.TWO);
        questionRepository.save(questionThirtyOne);

        Answer q31AnswerOne = new Answer("United Kingdom", questionThirtyOne, true);
        answerRepository.save(q31AnswerOne);

        Answer q31AnswerTwo = new Answer("France", questionThirtyOne, false);
        answerRepository.save(q31AnswerTwo);

        Answer q31AnswerThree = new Answer("Italy", questionThirtyOne, false);
        answerRepository.save(q31AnswerThree);

        Answer q31AnswerFour = new Answer("Germany", questionThirtyOne, false);
        answerRepository.save(q31AnswerFour);

        Question questionThirtyTwo = new Question("What is not a wind instrument?", Difficulty.TWO);
        questionRepository.save(questionThirtyTwo);

        Answer q32AnswerOne = new Answer("Violin", questionThirtyTwo, true);
        answerRepository.save(q32AnswerOne);

        Answer q32AnswerTwo = new Answer("Oboe", questionThirtyTwo, false);
        answerRepository.save(q32AnswerTwo);

        Answer q32AnswerThree = new Answer("Trombone", questionThirtyTwo, false);
        answerRepository.save(q32AnswerThree);

        Answer q32AnswerFour = new Answer("Tuba", questionThirtyTwo, false);
        answerRepository.save(q32AnswerFour);

        Question questionThirtyThree = new Question("The first rule is: 'you don't talk about it' is a reference to which movie?", Difficulty.TWO);
        questionRepository.save(questionThirtyThree);

        Answer q33AnswerOne = new Answer("Fight Club", questionThirtyThree, true);
        answerRepository.save(q33AnswerOne);

        Answer q33AnswerTwo = new Answer("The Island", questionThirtyThree, false);
        answerRepository.save(q33AnswerTwo);

        Answer q33AnswerThree = new Answer("Unthinkable", questionThirtyThree, false);
        answerRepository.save(q33AnswerThree);

        Answer q33AnswerFour = new Answer("American Pie", questionThirtyThree, false);
        answerRepository.save(q33AnswerFour);

        Question questionThirtyFour = new Question("What is the chemical makeup of water?", Difficulty.TWO);
        questionRepository.save(questionThirtyFour);

        Answer q34AnswerOne = new Answer("H20", questionThirtyFour, true);
        answerRepository.save(q34AnswerOne);

        Answer q34AnswerTwo = new Answer("C12H6O2", questionThirtyFour, false);
        answerRepository.save(q34AnswerTwo);

        Answer q34AnswerThree = new Answer("CO2", questionThirtyFour, false);
        answerRepository.save(q34AnswerThree);

        Answer q34AnswerFour = new Answer("H", questionThirtyFour, false);
        answerRepository.save(q34AnswerFour);

        Question questionThirtyFive = new Question("What was the name of the sea witch in the 1989 Disney film 'The Little Mermaid'?", Difficulty.TWO);
        questionRepository.save(questionThirtyFive);

        Answer q35AnswerOne = new Answer("Ursula", questionThirtyFive, true);
        answerRepository.save(q35AnswerOne);

        Answer q35AnswerTwo = new Answer("Madam Mim", questionThirtyFive, false);
        answerRepository.save(q35AnswerTwo);

        Answer q35AnswerThree = new Answer("Maleficent", questionThirtyFive, false);
        answerRepository.save(q35AnswerThree);

        Answer q35AnswerFour = new Answer("Lady Tremaine", questionThirtyFive, false);
        answerRepository.save(q35AnswerFour);

        Question questionThirtySix = new Question("Who is the lead vocalist of the band 'The Police", Difficulty.TWO);
        questionRepository.save(questionThirtySix);

        Answer q36AnswerOne = new Answer("Sting", questionThirtySix, true);
        answerRepository.save(q36AnswerOne);

        Answer q36AnswerTwo = new Answer("Bono", questionThirtySix, false);
        answerRepository.save(q36AnswerTwo);

        Answer q36AnswerThree = new Answer("Robert Plant", questionThirtySix, false);
        answerRepository.save(q36AnswerThree);

        Answer q36AnswerFour = new Answer("Axl Rose", questionThirtySix, false);
        answerRepository.save(q36AnswerFour);

        Question questionThirtySeven = new Question("Who performed the song 'I Took A Pill In Ibiza'?", Difficulty.TWO);
        questionRepository.save(questionThirtySeven);

        Answer q37AnswerOne = new Answer("Mike Posner", questionThirtySeven, true);
        answerRepository.save(q37AnswerOne);

        Answer q37AnswerTwo = new Answer("Robbie Williams", questionThirtySeven, false);
        answerRepository.save(q37AnswerTwo);

        Answer q37AnswerThree = new Answer("Harry Styles", questionThirtySeven, false);
        answerRepository.save(q37AnswerThree);

        Answer q37AnswerFour = new Answer("Avicii", questionThirtySeven, false);
        answerRepository.save(q37AnswerFour);

        Question questionThirtyEight = new Question("Which programming language shares its name with an island in Indonesia?", Difficulty.TWO);
        questionRepository.save(questionThirtyEight);

        Answer q38AnswerOne = new Answer("Java", questionThirtyEight, true);
        answerRepository.save(q38AnswerOne);

        Answer q38AnswerTwo = new Answer("Python", questionThirtyEight, false);
        answerRepository.save(q38AnswerTwo);

        Answer q38AnswerThree = new Answer("C", questionThirtyEight, false);
        answerRepository.save(q38AnswerThree);

        Answer q38AnswerFour = new Answer("C#", questionThirtyEight, false);
        answerRepository.save(q38AnswerFour);

        Question questionThirtyNine = new Question("Earth is located in which galaxy?", Difficulty.TWO);
        questionRepository.save(questionThirtyNine);

        Answer q39AnswerOne = new Answer("The Milky Way Galaxy", questionThirtyNine, true);
        answerRepository.save(q39AnswerOne);

        Answer q39AnswerTwo = new Answer("The Mars Galaxy", questionThirtyNine, false);
        answerRepository.save(q39AnswerTwo);

        Answer q39AnswerThree = new Answer("The Galaxy Note", questionThirtyNine, false);
        answerRepository.save(q39AnswerThree);

        Answer q39AnswerFour = new Answer("The Black Hole", questionThirtyNine, false);
        answerRepository.save(q39AnswerFour);

        Question questionForty = new Question("Which of the following is NOT a Nintendo game console?", Difficulty.TWO);
        questionRepository.save(questionForty);

        Answer q40AnswerOne = new Answer("Dreamcast", questionForty, true);
        answerRepository.save(q40AnswerOne);

        Answer q40AnswerTwo = new Answer("SNES", questionForty, false);
        answerRepository.save(q40AnswerTwo);

        Answer q40AnswerThree = new Answer("Wii", questionForty, false);
        answerRepository.save(q40AnswerThree);

        Answer q40AnswerFour = new Answer("Switch", questionForty, false);
        answerRepository.save(q40AnswerFour);

        Question questionFortyOne = new Question("What does the letter 'S' stand for in 'NASA'?", Difficulty.THREE);
        questionRepository.save(questionFortyOne);

        Answer q41AnswerOne = new Answer("Space", questionFortyOne, true);
        answerRepository.save(q41AnswerOne);

        Answer q41AnswerTwo = new Answer("Science", questionFortyOne, false);
        answerRepository.save(q41AnswerTwo);

        Answer q41AnswerThree = new Answer("Society", questionFortyOne, false);
        answerRepository.save(q41AnswerThree);

        Answer q41AnswerFour = new Answer("Star", questionFortyOne, false);
        answerRepository.save(q41AnswerFour);

        Question questionFortyTwo = new Question("The body of the Egyptian Sphinx was based on which animal?", Difficulty.THREE);
        questionRepository.save(questionFortyTwo);

        Answer q42AnswerOne = new Answer("Lion", questionFortyTwo, true);
        answerRepository.save(q42AnswerOne);

        Answer q42AnswerTwo = new Answer("Bull", questionFortyTwo, false);
        answerRepository.save(q42AnswerTwo);

        Answer q42AnswerThree = new Answer("Horse", questionFortyTwo, false);
        answerRepository.save(q42AnswerThree);

        Answer q42AnswerFour = new Answer("Dog", questionFortyTwo, false);
        answerRepository.save(q42AnswerFour);

        Question questionFortyThree = new Question("Ringo Starr of The Beatles mainly played what instrument?", Difficulty.THREE);
        questionRepository.save(questionFortyThree);

        Answer q43AnswerOne = new Answer("Drums", questionFortyThree, true);
        answerRepository.save(q43AnswerOne);

        Answer q43AnswerTwo = new Answer("Bass", questionFortyThree, false);
        answerRepository.save(q43AnswerTwo);

        Answer q43AnswerThree = new Answer("Guitar", questionFortyThree, false);
        answerRepository.save(q43AnswerThree);

        Answer q43AnswerFour = new Answer("Piano", questionFortyThree, false);
        answerRepository.save(q43AnswerFour);

        Question questionFortyFour = new Question("Which singer was featured in Jack-U (Skrillex & Diplo)'s 2015 song 'Where Are U Now'?", Difficulty.THREE);
        questionRepository.save(questionFortyFour);

        Answer q44AnswerOne = new Answer("Justin Bieber", questionFortyFour, true);
        answerRepository.save(q44AnswerOne);

        Answer q44AnswerTwo = new Answer("Selena Gomez", questionFortyFour, false);
        answerRepository.save(q44AnswerTwo);

        Answer q44AnswerThree = new Answer("Ellie Goulding", questionFortyFour, false);
        answerRepository.save(q44AnswerThree);

        Answer q44AnswerFour = new Answer("The Weeknd", questionFortyFour, false);
        answerRepository.save(q44AnswerFour);

        Question questionFortyFive = new Question("Which movie contains the quote, 'Say hello to my little friend!'?", Difficulty.THREE);
        questionRepository.save(questionFortyFive);

        Answer q45AnswerOne = new Answer("Scarface", questionFortyFive, true);
        answerRepository.save(q45AnswerOne);

        Answer q45AnswerTwo = new Answer("Reservoir Dogs", questionFortyFive, false);
        answerRepository.save(q45AnswerTwo);

        Answer q45AnswerThree = new Answer("Heat", questionFortyFive, false);
        answerRepository.save(q45AnswerThree);

        Answer q45AnswerFour = new Answer("Goodfellas", questionFortyFive, false);
        answerRepository.save(q45AnswerFour);

        Question questionFortySix = new Question("Which movie contains the quote, 'Houston, we have a problem'?", Difficulty.THREE);
        questionRepository.save(questionFortySix);

        Answer q46AnswerOne = new Answer("Apollo 13", questionFortySix, true);
        answerRepository.save(q46AnswerOne);

        Answer q46AnswerTwo = new Answer("The Right Stuff", questionFortySix, false);
        answerRepository.save(q46AnswerTwo);

        Answer q46AnswerThree = new Answer("Capricorn One", questionFortySix, false);
        answerRepository.save(q46AnswerThree);

        Answer q46AnswerFour = new Answer("Marooned", questionFortySix, false);
        answerRepository.save(q46AnswerFour);

        Question questionFortySeven = new Question("What is the official language of Costa Rica?", Difficulty.THREE);
        questionRepository.save(questionFortySeven);

        Answer q47AnswerOne = new Answer("Spanish", questionFortySeven, true);
        answerRepository.save(q47AnswerOne);

        Answer q47AnswerTwo = new Answer("English", questionFortySeven, false);
        answerRepository.save(q47AnswerTwo);

        Answer q47AnswerThree = new Answer("Portuguese", questionFortySeven, false);
        answerRepository.save(q47AnswerThree);

        Answer q47AnswerFour = new Answer("Creole", questionFortySeven, false);
        answerRepository.save(q47AnswerFour);

        Question questionFortyEight = new Question("'Hallelujah' is a song written by which Canadian recording artist?", Difficulty.THREE);
        questionRepository.save(questionFortyEight);

        Answer q48AnswerOne = new Answer("Leonard Cohen", questionFortyEight, true);
        answerRepository.save(q48AnswerOne);

        Answer q48AnswerTwo = new Answer("Kory Lefkowits", questionFortyEight, false);
        answerRepository.save(q48AnswerTwo);

        Answer q48AnswerThree = new Answer("Ryan Letourneau", questionFortyEight, false);
        answerRepository.save(q48AnswerThree);

        Answer q48AnswerFour = new Answer("Justin Bieber", questionFortyEight, false);
        answerRepository.save(q48AnswerFour);

        Question questionFortyNine = new Question("What is the shape of the toy invented by Hungarian professor Ernő Rubik?", Difficulty.THREE);
        questionRepository.save(questionFortyNine);

        Answer q49AnswerOne = new Answer("Cube", questionFortyNine, true);
        answerRepository.save(q49AnswerOne);

        Answer q49AnswerTwo = new Answer("Sphere", questionFortyNine, false);
        answerRepository.save(q49AnswerTwo);

        Answer q49AnswerThree = new Answer("Cylinder", questionFortyNine, false);
        answerRepository.save(q49AnswerThree);

        Answer q49AnswerFour = new Answer("Pyramid", questionFortyNine, false);
        answerRepository.save(q49AnswerFour);

        Question questionFifty = new Question("If you were to code software in this language you'd only be able to type 0's and 1's.", Difficulty.THREE);
        questionRepository.save(questionFifty);

        Answer q50AnswerOne = new Answer("Binary", questionFifty, true);
        answerRepository.save(q50AnswerOne);

        Answer q50AnswerTwo = new Answer("JavaScript", questionFifty, false);
        answerRepository.save(q50AnswerTwo);

        Answer q50AnswerThree = new Answer("C++", questionFifty, false);
        answerRepository.save(q50AnswerThree);

        Answer q50AnswerFour = new Answer("Python", questionFifty, false);
        answerRepository.save(q50AnswerFour);

        Question questionFiftyOne = new Question("Which artist released the 2012 single 'Harlem Shake', which was used in numerous YouTube videos in 2013?", Difficulty.THREE);
        questionRepository.save(questionFiftyOne);

        Answer q51AnswerOne = new Answer("Baauer", questionFiftyOne, true);
        answerRepository.save(q51AnswerOne);

        Answer q51AnswerTwo = new Answer("RL Grime", questionFiftyOne, false);
        answerRepository.save(q51AnswerTwo);

        Answer q51AnswerThree = new Answer("NGHTMRE", questionFiftyOne, false);
        answerRepository.save(q51AnswerThree);

        Answer q51AnswerFour = new Answer("Flosstradamus", questionFiftyOne, false);
        answerRepository.save(q51AnswerFour);

        Question questionFiftyTwo = new Question("In the Pixar film, 'Toy Story', what was the name of the child who owned the toys?", Difficulty.THREE);
        questionRepository.save(questionFiftyTwo);

        Answer q52AnswerOne = new Answer("Andy", questionFiftyTwo, true);
        answerRepository.save(q52AnswerOne);

        Answer q52AnswerTwo = new Answer("Edward", questionFiftyTwo, false);
        answerRepository.save(q52AnswerTwo);

        Answer q52AnswerThree = new Answer("Danny", questionFiftyTwo, false);
        answerRepository.save(q52AnswerThree);

        Answer q52AnswerFour = new Answer("Matt", questionFiftyTwo, false);
        answerRepository.save(q52AnswerFour);

        Question questionFiftyThree = new Question("Which Nirvana album had a naked baby on the cover?", Difficulty.THREE);
        questionRepository.save(questionFiftyThree);

        Answer q53AnswerOne = new Answer("Nevermind", questionFiftyThree, true);
        answerRepository.save(q53AnswerOne);

        Answer q53AnswerTwo = new Answer("Bleach", questionFiftyThree, false);
        answerRepository.save(q53AnswerTwo);

        Answer q53AnswerThree = new Answer("In Utero", questionFiftyThree, false);
        answerRepository.save(q53AnswerThree);

        Answer q53AnswerFour = new Answer("Incesticide", questionFiftyThree, false);
        answerRepository.save(q53AnswerFour);

        Question questionFiftyFour = new Question("According to Sherlock Holmes, 'If you eliminate the impossible, whatever remains, however improbable, must be the...'", Difficulty.THREE);
        questionRepository.save(questionFiftyFour);

        Answer q54AnswerOne = new Answer("Truth", questionFiftyFour, true);
        answerRepository.save(q54AnswerOne);

        Answer q54AnswerTwo = new Answer("Answer", questionFiftyFour, false);
        answerRepository.save(q54AnswerTwo);

        Answer q54AnswerThree = new Answer("Cause", questionFiftyFour, false);
        answerRepository.save(q54AnswerThree);

        Answer q54AnswerFour = new Answer("Source", questionFiftyFour, false);
        answerRepository.save(q54AnswerFour);

        Question questionFiftyFive = new Question("In the movie 'Blade Runner', what is the term used for human-like androids ?", Difficulty.THREE);
        questionRepository.save(questionFiftyFive);

        Answer q55AnswerOne = new Answer("Replicants", questionFiftyFive, true);
        answerRepository.save(q55AnswerOne);

        Answer q55AnswerTwo = new Answer("Cylons", questionFiftyFive, false);
        answerRepository.save(q55AnswerTwo);

        Answer q55AnswerThree = new Answer("Synthetics", questionFiftyFive, false);
        answerRepository.save(q55AnswerThree);

        Answer q55AnswerFour = new Answer("Skinjobs", questionFiftyFive, false);
        answerRepository.save(q55AnswerFour);

        Question questionFiftySix = new Question("What is the official name of the star located closest to the North Celestial Pole?", Difficulty.THREE);
        questionRepository.save(questionFiftySix);

        Answer q56AnswerOne = new Answer("Polaris", questionFiftySix, true);
        answerRepository.save(q56AnswerOne);

        Answer q56AnswerTwo = new Answer("Eridanus", questionFiftySix, false);
        answerRepository.save(q56AnswerTwo);

        Answer q56AnswerThree = new Answer("Gamma Cephei", questionFiftySix, false);
        answerRepository.save(q56AnswerThree);

        Answer q56AnswerFour = new Answer("Iota Cephei", questionFiftySix, false);
        answerRepository.save(q56AnswerFour);

        Question questionFiftySeven = new Question("Who created the digital distribution platform Steam?", Difficulty.THREE);
        questionRepository.save(questionFiftySeven);

        Answer q57AnswerOne = new Answer("Valve", questionFiftySeven, true);
        answerRepository.save(q57AnswerOne);

        Answer q57AnswerTwo = new Answer("Pixeltail Games", questionFiftySeven, false);
        answerRepository.save(q57AnswerTwo);

        Answer q57AnswerThree = new Answer("Ubisoft", questionFiftySeven, false);
        answerRepository.save(q57AnswerThree);

        Answer q57AnswerFour = new Answer("Electronic Arts", questionFiftySeven, false);
        answerRepository.save(q57AnswerFour);

        Question questionFiftyEight = new Question("Who directed the movies 'Pulp Fiction', 'Reservoir Dogs'; and 'Django Unchained'?", Difficulty.THREE);
        questionRepository.save(questionFiftyEight);

        Answer q58AnswerOne = new Answer("Quentin Tarantino", questionFiftyEight, true);
        answerRepository.save(q58AnswerOne);

        Answer q58AnswerTwo = new Answer("Martin Scorcese", questionFiftyEight, false);
        answerRepository.save(q58AnswerTwo);

        Answer q58AnswerThree = new Answer("Steven Spielberg", questionFiftyEight, false);
        answerRepository.save(q58AnswerThree);

        Answer q58AnswerFour = new Answer("James Cameron", questionFiftyEight, false);
        answerRepository.save(q58AnswerFour);

        Question questionFiftyNine = new Question("Who is the frontman of the band 30 Seconds to Mars?", Difficulty.THREE);
        questionRepository.save(questionFiftyNine);

        Answer q59AnswerOne = new Answer("Jared Leto", questionFiftyNine, true);
        answerRepository.save(q59AnswerOne);

        Answer q59AnswerTwo = new Answer("Gerard Way", questionFiftyNine, false);
        answerRepository.save(q59AnswerTwo);

        Answer q59AnswerThree = new Answer("Matthew Bellamy", questionFiftyNine, false);
        answerRepository.save(q59AnswerThree);

        Answer q59AnswerFour = new Answer("Mike Shinoda", questionFiftyNine, false);
        answerRepository.save(q59AnswerFour);

        Question questionSixty = new Question("How many members are there in the band Nirvana?", Difficulty.THREE);
        questionRepository.save(questionSixty);

        Answer q60AnswerOne = new Answer("Three", questionSixty, true);
        answerRepository.save(q60AnswerOne);

        Answer q60AnswerTwo = new Answer("Two", questionSixty, false);
        answerRepository.save(q60AnswerTwo);

        Answer q60AnswerThree = new Answer("Four", questionSixty, false);
        answerRepository.save(q60AnswerThree);

        Answer q60AnswerFour = new Answer("Five", questionSixty, false);
        answerRepository.save(q60AnswerFour);

        Question questionSixtyOne = new Question("Which American president appears on a one dollar bill?", Difficulty.FOUR);
        questionRepository.save(questionSixtyOne);

        Answer q61AnswerOne = new Answer("George Washington", questionSixtyOne, true);
        answerRepository.save(q61AnswerOne);

        Answer q61AnswerTwo = new Answer("Thomas Jefferson", questionSixtyOne, false);
        answerRepository.save(q61AnswerTwo);

        Answer q61AnswerThree = new Answer("Abraham Lincoln", questionSixtyOne, false);
        answerRepository.save(q61AnswerThree);

        Answer q61AnswerFour = new Answer("Benjamin Franklin", questionSixtyOne, false);
        answerRepository.save(q61AnswerFour);

        Question questionSixtyTwo = new Question("Human cells typically have how many copies of each gene?", Difficulty.FOUR);
        questionRepository.save(questionSixtyTwo);

        Answer q62AnswerOne = new Answer("2", questionSixtyTwo, true);
        answerRepository.save(q62AnswerOne);

        Answer q62AnswerTwo = new Answer("1", questionSixtyTwo, false);
        answerRepository.save(q62AnswerTwo);

        Answer q62AnswerThree = new Answer("4", questionSixtyTwo, false);
        answerRepository.save(q62AnswerThree);

        Answer q62AnswerFour = new Answer("3", questionSixtyTwo, false);
        answerRepository.save(q62AnswerFour);

        Question questionSixtyThree = new Question("What are the cylinder-like parts that pump up and down within the engine?", Difficulty.FOUR);
        questionRepository.save(questionSixtyThree);

        Answer q63AnswerOne = new Answer("Pistons", questionSixtyThree, true);
        answerRepository.save(q63AnswerOne);

        Answer q63AnswerTwo = new Answer("Leaf Springs", questionSixtyThree, false);
        answerRepository.save(q63AnswerTwo);

        Answer q63AnswerThree = new Answer("Radiators", questionSixtyThree, false);
        answerRepository.save(q63AnswerThree);

        Answer q63AnswerFour = new Answer("ABS", questionSixtyThree, false);
        answerRepository.save(q63AnswerFour);

        Question questionSixtyFour = new Question("What are the cylinder-like parts that pump up and down within the engine?", Difficulty.FOUR);
        questionRepository.save(questionSixtyFour);

        Answer q64AnswerOne = new Answer("Pistons", questionSixtyFour, true);
        answerRepository.save(q64AnswerOne);

        Answer q64AnswerTwo = new Answer("Leaf Springs", questionSixtyFour, false);
        answerRepository.save(q64AnswerTwo);

        Answer q64AnswerThree = new Answer("Radiators", questionSixtyFour, false);
        answerRepository.save(q64AnswerThree);

        Answer q64AnswerFour = new Answer("ABS", questionSixtyFour, false);
        answerRepository.save(q64AnswerFour);

        Question questionSixtyFive = new Question("What is the capital of Indonesia?", Difficulty.FOUR);
        questionRepository.save(questionSixtyFive);

        Answer q65AnswerOne = new Answer("Jakarta", questionSixtyFive, true);
        answerRepository.save(q65AnswerOne);

        Answer q65AnswerTwo = new Answer("Bandung", questionSixtyFive, false);
        answerRepository.save(q65AnswerTwo);

        Answer q65AnswerThree = new Answer("Palembang", questionSixtyFive, false);
        answerRepository.save(q65AnswerThree);

        Answer q65AnswerFour = new Answer("Medan", questionSixtyFive, false);
        answerRepository.save(q65AnswerFour);

        Question questionSixtySix = new Question("During WWII, in 1945, the United States dropped atomic bombs on the two Japanese cities of Hiroshima and what other city?", Difficulty.FOUR);
        questionRepository.save(questionSixtySix);

        Answer q66AnswerOne = new Answer("Jakarta", questionSixtySix, true);
        answerRepository.save(q66AnswerOne);

        Answer q66AnswerTwo = new Answer("Bandung", questionSixtySix, false);
        answerRepository.save(q66AnswerTwo);

        Answer q66AnswerThree = new Answer("Palembang", questionSixtySix, false);
        answerRepository.save(q66AnswerThree);

        Answer q66AnswerFour = new Answer("Medan", questionSixtySix, false);
        answerRepository.save(q66AnswerFour);

        Question questionSixtySeven = new Question("Who wrote the novel 'Fear And Loathing In Las Vegas'?", Difficulty.FOUR);
        questionRepository.save(questionSixtySeven);

        Answer q67AnswerOne = new Answer("Hunter S. Thompson", questionSixtySeven, true);
        answerRepository.save(q67AnswerOne);

        Answer q67AnswerTwo = new Answer("F. Scott Fitzgerald", questionSixtySeven, false);
        answerRepository.save(q67AnswerTwo);

        Answer q67AnswerThree = new Answer("Henry Miller", questionSixtySeven, false);
        answerRepository.save(q67AnswerThree);

        Answer q67AnswerFour = new Answer("William S. Burroughs", questionSixtySeven, false);
        answerRepository.save(q67AnswerFour);

        Question questionSixtyEight = new Question("Which of these video game engines was made by the company Epic Games?", Difficulty.FOUR);
        questionRepository.save(questionSixtyEight);

        Answer q68AnswerOne = new Answer("Unreal", questionSixtyEight, true);
        answerRepository.save(q68AnswerOne);

        Answer q68AnswerTwo = new Answer("Unity", questionSixtyEight, false);
        answerRepository.save(q68AnswerTwo);

        Answer q68AnswerThree = new Answer("Game Maker: Studio", questionSixtyEight, false);
        answerRepository.save(q68AnswerThree);

        Answer q68AnswerFour = new Answer("Cry Engine", questionSixtyEight, false);
        answerRepository.save(q68AnswerFour);

        Question questionSixtyNine = new Question("Finish these lyrics from the 2016 song &quot;Panda&quot; by Desiigner: 'I got broads in....'", Difficulty.FOUR);
        questionRepository.save(questionSixtyNine);

        Answer q69AnswerOne = new Answer("Atlanta", questionSixtyNine, true);
        answerRepository.save(q69AnswerOne);

        Answer q69AnswerTwo = new Answer("Savannah", questionSixtyNine, false);
        answerRepository.save(q69AnswerTwo);

        Answer q69AnswerThree = new Answer("Augusta", questionSixtyNine, false);
        answerRepository.save(q69AnswerThree);

        Answer q69AnswerFour = new Answer("Marietta", questionSixtyNine, false);
        answerRepository.save(q69AnswerFour);

        Question questionSeventy = new Question("In web design, what does CSS stand for?", Difficulty.FOUR);
        questionRepository.save(questionSeventy);

        Answer q70AnswerOne = new Answer("Cascading Style Sheet", questionSeventy, true);
        answerRepository.save(q70AnswerOne);

        Answer q70AnswerTwo = new Answer("Complementary Style Sheet", questionSeventy, false);
        answerRepository.save(q70AnswerTwo);

        Answer q70AnswerThree = new Answer("Corrective Style Sheet", questionSeventy, false);
        answerRepository.save(q70AnswerThree);

        Answer q70AnswerFour = new Answer("Computer Style Sheet", questionSeventy, false);
        answerRepository.save(q70AnswerFour);

        Question questionSeventyOne = new Question("How many colors are there in a rainbow?", Difficulty.FOUR);
        questionRepository.save(questionSeventyOne);

        Answer q71AnswerOne = new Answer("7", questionSeventyOne, true);
        answerRepository.save(q71AnswerOne);

        Answer q71AnswerTwo = new Answer("8", questionSeventyOne, false);
        answerRepository.save(q71AnswerTwo);

        Answer q71AnswerThree = new Answer("6", questionSeventyOne, false);
        answerRepository.save(q71AnswerThree);

        Answer q71AnswerFour = new Answer("9", questionSeventyOne, false);
        answerRepository.save(q71AnswerFour);

        Question questionSeventyTwo = new Question("Which movie includes a giant bunny-like spirit who has magic powers including growing trees?", Difficulty.FOUR);
        questionRepository.save(questionSeventyTwo);

        Answer q72AnswerOne = new Answer("My Neighbor Totoro", questionSeventyTwo, true);
        answerRepository.save(q72AnswerOne);

        Answer q72AnswerTwo = new Answer("Hop", questionSeventyTwo, false);
        answerRepository.save(q72AnswerTwo);

        Answer q72AnswerThree = new Answer("Rise of the Guardians", questionSeventyTwo, false);
        answerRepository.save(q72AnswerThree);

        Answer q72AnswerFour = new Answer("Alice in Wonderland", questionSeventyTwo, false);
        answerRepository.save(q72AnswerFour);

        Question questionSeventyThree = new Question("How many faces does a dodecahedron have?", Difficulty.FOUR);
        questionRepository.save(questionSeventyThree);

        Answer q73AnswerOne = new Answer("12", questionSeventyThree, true);
        answerRepository.save(q73AnswerOne);

        Answer q73AnswerTwo = new Answer("10", questionSeventyThree, false);
        answerRepository.save(q73AnswerTwo);

        Answer q73AnswerThree = new Answer("14", questionSeventyThree, false);
        answerRepository.save(q73AnswerThree);

        Answer q73AnswerFour = new Answer("8", questionSeventyThree, false);
        answerRepository.save(q73AnswerFour);

        Question questionSeventyFour = new Question("What do you call a baby bat?", Difficulty.FOUR);
        questionRepository.save(questionSeventyFour);

        Answer q74AnswerOne = new Answer("Pup", questionSeventyFour, true);
        answerRepository.save(q74AnswerOne);

        Answer q74AnswerTwo = new Answer("Cub", questionSeventyFour, false);
        answerRepository.save(q74AnswerTwo);

        Answer q74AnswerThree = new Answer("Chick", questionSeventyFour, false);
        answerRepository.save(q74AnswerThree);

        Answer q74AnswerFour = new Answer("Kid", questionSeventyFour, false);
        answerRepository.save(q74AnswerFour);

        Question questionSeventyFive = new Question("In the show Stranger Things, what is Eleven's favorite breakfast food?", Difficulty.FOUR);
        questionRepository.save(questionSeventyFive);

        Answer q75AnswerOne = new Answer("Eggo Waffles", questionSeventyFive, true);
        answerRepository.save(q75AnswerOne);

        Answer q75AnswerTwo = new Answer("Toast", questionSeventyFive, false);
        answerRepository.save(q75AnswerTwo);

        Answer q75AnswerThree = new Answer("Captain Crunch", questionSeventyFive, false);
        answerRepository.save(q75AnswerThree);

        Answer q75AnswerFour = new Answer("Bacon and Eggs", questionSeventyFive, false);
        answerRepository.save(q75AnswerFour);

        Question questionSeventySix = new Question("Which of these African countries list Spanish as an official language?", Difficulty.FOUR);
        questionRepository.save(questionSeventySix);

        Answer q76AnswerOne = new Answer("Equatorial Guinea", questionSeventySix, true);
        answerRepository.save(q76AnswerOne);

        Answer q76AnswerTwo = new Answer("Guinea", questionSeventySix, false);
        answerRepository.save(q76AnswerTwo);

        Answer q76AnswerThree = new Answer("Cameroon", questionSeventySix, false);
        answerRepository.save(q76AnswerThree);

        Answer q76AnswerFour = new Answer("Angola", questionSeventySix, false);
        answerRepository.save(q76AnswerFour);

        Question questionSeventySeven = new Question("Which buzzword did Apple Inc. use to describe their removal of the headphone jack?", Difficulty.FOUR);
        questionRepository.save(questionSeventySeven);

        Answer q77AnswerOne = new Answer("Courage", questionSeventySeven, true);
        answerRepository.save(q77AnswerOne);

        Answer q77AnswerTwo = new Answer("Innovation", questionSeventySeven, false);
        answerRepository.save(q77AnswerTwo);

        Answer q77AnswerThree = new Answer("Revolution", questionSeventySeven, false);
        answerRepository.save(q77AnswerThree);

        Answer q77AnswerFour = new Answer("Bravery", questionSeventySeven, false);
        answerRepository.save(q77AnswerFour);

        Question questionSeventyEight = new Question("Which one of these is not a real game in the Dungeons & Dragons series?", Difficulty.FOUR);
        questionRepository.save(questionSeventyEight);

        Answer q78AnswerOne = new Answer("Extreme Dungeons & Dragons", questionSeventyEight, true);
        answerRepository.save(q78AnswerOne);

        Answer q78AnswerTwo = new Answer("Advanced Dungeons & Dragons", questionSeventyEight, false);
        answerRepository.save(q78AnswerTwo);

        Answer q78AnswerThree = new Answer("Dungeons & Dragons 3.5th edition", questionSeventyEight, false);
        answerRepository.save(q78AnswerThree);

        Answer q78AnswerFour = new Answer("Advanced Dungeons & Dragons 2nd edition", questionSeventyEight, false);
        answerRepository.save(q78AnswerFour);

        Question questionSeventyNine = new Question("What was the name of the the first episode of Doctor Who to air in 1963?", Difficulty.FOUR);
        questionRepository.save(questionSeventyNine);

        Answer q79AnswerOne = new Answer("An Unearthly Child", questionSeventyNine, true);
        answerRepository.save(q79AnswerOne);

        Answer q79AnswerTwo = new Answer("The Daleks", questionSeventyNine, false);
        answerRepository.save(q79AnswerTwo);

        Answer q79AnswerThree = new Answer("The Aztecs", questionSeventyNine, false);
        answerRepository.save(q79AnswerThree);

        Answer q79AnswerFour = new Answer("The Edge of Destruction", questionSeventyNine, false);
        answerRepository.save(q79AnswerFour);

        Question questionEighty = new Question("On what street did the 1666 Great Fire of London start?", Difficulty.FOUR);
        questionRepository.save(questionEighty);

        Answer q80AnswerOne = new Answer("Pudding Lane", questionEighty, true);
        answerRepository.save(q80AnswerOne);

        Answer q80AnswerTwo = new Answer("Baker Street", questionEighty, false);
        answerRepository.save(q80AnswerTwo);

        Answer q80AnswerThree = new Answer("Bread Lane", questionEighty, false);
        answerRepository.save(q80AnswerThree);

        Answer q80AnswerFour = new Answer("Baker Avenue", questionEighty, false);
        answerRepository.save(q80AnswerFour);

        Question questionEightyOne = new Question("What year did the television company BBC officially launch the channel BBC One?", Difficulty.FIVE);
        questionRepository.save(questionEightyOne);

        Answer q81AnswerOne = new Answer("1936", questionEightyOne, true);
        answerRepository.save(q81AnswerOne);

        Answer q81AnswerTwo = new Answer("1948", questionEightyOne, false);
        answerRepository.save(q81AnswerTwo);

        Answer q81AnswerThree = new Answer("1932", questionEightyOne, false);
        answerRepository.save(q81AnswerThree);

        Answer q81AnswerFour = new Answer("1955", questionEightyOne, false);
        answerRepository.save(q81AnswerFour);

        Question questionEightyTwo = new Question("The 'Tibia' is found in which part of the body?", Difficulty.FIVE);
        questionRepository.save(questionEightyTwo);

        Answer q82AnswerOne = new Answer("Leg", questionEightyTwo, true);
        answerRepository.save(q82AnswerOne);

        Answer q82AnswerTwo = new Answer("Arm", questionEightyTwo, false);
        answerRepository.save(q82AnswerTwo);

        Answer q82AnswerThree = new Answer("Hand", questionEightyTwo, false);
        answerRepository.save(q82AnswerThree);

        Answer q82AnswerFour = new Answer("Head", questionEightyTwo, false);
        answerRepository.save(q82AnswerFour);

        Question questionEightyThree = new Question("Which part of the body does glaucoma affect?", Difficulty.FIVE);
        questionRepository.save(questionEightyThree);

        Answer q83AnswerOne = new Answer("Eyes", questionEightyThree, true);
        answerRepository.save(q83AnswerOne);

        Answer q83AnswerTwo = new Answer("Throat", questionEightyThree, false);
        answerRepository.save(q83AnswerTwo);

        Answer q83AnswerThree = new Answer("Stomach", questionEightyThree, false);
        answerRepository.save(q83AnswerThree);

        Answer q83AnswerFour = new Answer("Blood", questionEightyThree, false);
        answerRepository.save(q83AnswerFour);

        Question questionEightyFour = new Question("What was the name of Ross's pet monkey on 'Friends'", Difficulty.FIVE);
        questionRepository.save(questionEightyFour);

        Answer q84AnswerOne = new Answer("Marcel", questionEightyFour, true);
        answerRepository.save(q84AnswerOne);

        Answer q84AnswerTwo = new Answer("Jojo", questionEightyFour, false);
        answerRepository.save(q84AnswerTwo);

        Answer q84AnswerThree = new Answer("George", questionEightyFour, false);
        answerRepository.save(q84AnswerThree);

        Answer q84AnswerFour = new Answer("Champ", questionEightyFour, false);
        answerRepository.save(q84AnswerFour);

        Question questionEightyFive = new Question("The novel 'Of Mice And Men' was written by what author?", Difficulty.FIVE);
        questionRepository.save(questionEightyFive);

        Answer q85AnswerOne = new Answer("John Steinbeck", questionEightyFive, true);
        answerRepository.save(q85AnswerOne);

        Answer q85AnswerTwo = new Answer("George Orwell", questionEightyFive, false);
        answerRepository.save(q85AnswerTwo);

        Answer q85AnswerThree = new Answer("Mark Twain", questionEightyFive, false);
        answerRepository.save(q85AnswerThree);

        Answer q85AnswerFour = new Answer("Harper Lee", questionEightyFive, false);
        answerRepository.save(q85AnswerFour);

        Question questionEightySix = new Question("Which of these is NOT a name of an album released by American rapper Pitbull?", Difficulty.FIVE);
        questionRepository.save(questionEightySix);

        Answer q86AnswerOne = new Answer("Welcome to Miami", questionEightySix, true);
        answerRepository.save(q86AnswerOne);

        Answer q86AnswerTwo = new Answer("Dale", questionEightySix, false);
        answerRepository.save(q86AnswerTwo);

        Answer q86AnswerThree = new Answer("Global Warming", questionEightySix, false);
        answerRepository.save(q86AnswerThree);

        Answer q86AnswerFour = new Answer("Armando", questionEightySix, false);
        answerRepository.save(q86AnswerFour);

        Question questionEightySeven = new Question("What is the designation given to the Marvel Cinematic Universe?", Difficulty.FIVE);
        questionRepository.save(questionEightySeven);

        Answer q87AnswerOne = new Answer("Earth-199999", questionEightySeven, true);
        answerRepository.save(q87AnswerOne);

        Answer q87AnswerTwo = new Answer("Earth-616", questionEightySeven, false);
        answerRepository.save(q87AnswerTwo);

        Answer q87AnswerThree = new Answer("Earth-10005", questionEightySeven, false);
        answerRepository.save(q87AnswerThree);

        Answer q87AnswerFour = new Answer("Earth-2008", questionEightySeven, false);
        answerRepository.save(q87AnswerFour);

        Question questionEightyEight = new Question("Where did the pineapple plant originate?", Difficulty.FIVE);
        questionRepository.save(questionEightyEight);

        Answer q88AnswerOne = new Answer("South America", questionEightyEight, true);
        answerRepository.save(q88AnswerOne);

        Answer q88AnswerTwo = new Answer("Hawaii", questionEightyEight, false);
        answerRepository.save(q88AnswerTwo);

        Answer q88AnswerThree = new Answer("Europe", questionEightyEight, false);
        answerRepository.save(q88AnswerThree);

        Answer q88AnswerFour = new Answer("Asia", questionEightyEight, false);
        answerRepository.save(q88AnswerFour);

        Question questionEightyNine = new Question("At which bridge does the annual Oxford and Cambridge boat race start?", Difficulty.FIVE);
        questionRepository.save(questionEightyNine);

        Answer q89AnswerOne = new Answer("Putney", questionEightyNine, true);
        answerRepository.save(q89AnswerOne);

        Answer q89AnswerTwo = new Answer("Hammersmith", questionEightyNine, false);
        answerRepository.save(q89AnswerTwo);

        Answer q89AnswerThree = new Answer("Vauxhall", questionEightyNine, false);
        answerRepository.save(q89AnswerThree);

        Answer q89AnswerFour = new Answer("Battersea", questionEightyNine, false);
        answerRepository.save(q89AnswerFour);

        Question questionNinety = new Question("One of the deadliest pandemics, the 'Spanish Flu', killed off what percentage of the human world population at the time?", Difficulty.FIVE);
        questionRepository.save(questionNinety);

        Answer q90AnswerOne = new Answer("3 to 6 percent", questionNinety, true);
        answerRepository.save(q90AnswerOne);

        Answer q90AnswerTwo = new Answer("6 to 10 percent", questionNinety, false);
        answerRepository.save(q90AnswerTwo);

        Answer q90AnswerThree = new Answer("1 to 3 percent", questionNinety, false);
        answerRepository.save(q90AnswerThree);

        Answer q90AnswerFour = new Answer("less than 1 percent", questionNinety, false);
        answerRepository.save(q90AnswerFour);

        Question questionNinetyOne = new Question("On average, Americans consume 100 pounds of what per second?", Difficulty.FIVE);
        questionRepository.save(questionNinetyOne);

        Answer q91AnswerOne = new Answer("Chocolate", questionNinetyOne, true);
        answerRepository.save(q91AnswerOne);

        Answer q91AnswerTwo = new Answer("Potatoes", questionNinetyOne, false);
        answerRepository.save(q91AnswerTwo);

        Answer q91AnswerThree = new Answer("Donuts", questionNinetyOne, false);
        answerRepository.save(q91AnswerThree);

        Answer q91AnswerFour = new Answer("Cocaine", questionNinetyOne, false);
        answerRepository.save(q91AnswerFour);

        Question questionNinetyTwo = new Question("The now extinct species 'Thylacine' was native to where?", Difficulty.FIVE);
        questionRepository.save(questionNinetyTwo);

        Answer q92AnswerOne = new Answer("Tasmania, Australia", questionNinetyTwo, true);
        answerRepository.save(q92AnswerOne);

        Answer q92AnswerTwo = new Answer("Baluchistan, Pakistan", questionNinetyTwo, false);
        answerRepository.save(q92AnswerTwo);

        Answer q92AnswerThree = new Answer("Wallachia, Romania", questionNinetyTwo, false);
        answerRepository.save(q92AnswerThree);

        Answer q92AnswerFour = new Answer("Oregon, United States", questionNinetyTwo, false);
        answerRepository.save(q92AnswerFour);

        Question questionNinetyThree = new Question("What was the first PlayStation game to require the use of the DualShock controller?", Difficulty.FIVE);
        questionRepository.save(questionNinetyThree);

        Answer q93AnswerOne = new Answer("Ape Escape", questionNinetyThree, true);
        answerRepository.save(q93AnswerOne);

        Answer q93AnswerTwo = new Answer("Metal Gear", questionNinetyThree, false);
        answerRepository.save(q93AnswerTwo);

        Answer q93AnswerThree = new Answer("Tekken", questionNinetyThree, false);
        answerRepository.save(q93AnswerThree);

        Answer q93AnswerFour = new Answer("Tomba 2!", questionNinetyThree, false);
        answerRepository.save(q93AnswerFour);

        Question questionNinetyFour = new Question("Myopia is the scientific term for which condition?", Difficulty.FIVE);
        questionRepository.save(questionNinetyFour);

        Answer q94AnswerOne = new Answer("Shortsightedness", questionNinetyFour, true);
        answerRepository.save(q94AnswerOne);

        Answer q94AnswerTwo = new Answer("Farsightedness", questionNinetyFour, false);
        answerRepository.save(q94AnswerTwo);

        Answer q94AnswerThree = new Answer("Double Vision", questionNinetyFour, false);
        answerRepository.save(q94AnswerThree);

        Answer q94AnswerFour = new Answer("Clouded Vision", questionNinetyFour, false);
        answerRepository.save(q94AnswerFour);

        Question questionNinetyFive = new Question("Which of the following was not developed by Bethesda?", Difficulty.FIVE);
        questionRepository.save(questionNinetyFive);

        Answer q95AnswerOne = new Answer("Fallout: New Vegas", questionNinetyFive, true);
        answerRepository.save(q95AnswerOne);

        Answer q95AnswerTwo = new Answer("Fallout 3", questionNinetyFive, false);
        answerRepository.save(q95AnswerTwo);

        Answer q95AnswerThree = new Answer("The Elder Scrolls V: Skyrim", questionNinetyFive, false);
        answerRepository.save(q95AnswerThree);

        Answer q95AnswerFour = new Answer("Fallout 4", questionNinetyFive, false);
        answerRepository.save(q95AnswerFour);

        Question questionNinetySix = new Question("Which new top 100 rapper, who featured in 'Computers' and 'Body Dance', was arrested in a NYPD sting for murder.", Difficulty.FIVE);
        questionRepository.save(questionNinetySix);

        Answer q96AnswerOne = new Answer("Bobby Shmurda", questionNinetySix, true);
        answerRepository.save(q96AnswerOne);

        Answer q96AnswerTwo = new Answer("DJ Snake", questionNinetySix, false);
        answerRepository.save(q96AnswerTwo);

        Answer q96AnswerThree = new Answer("Swae Lee", questionNinetySix, false);
        answerRepository.save(q96AnswerThree);

        Answer q96AnswerFour = new Answer("Young Thug", questionNinetySix, false);
        answerRepository.save(q96AnswerFour);

        Question questionNinetySeven = new Question("Which greek mathematician ran through the streets of Syracuse naked while shouting &quot;Eureka&quot; after discovering the principle of displacement?", Difficulty.FIVE);
        questionRepository.save(questionNinetySeven);

        Answer q97AnswerOne = new Answer("Archimedes", questionNinetySeven, true);
        answerRepository.save(q97AnswerOne);

        Answer q97AnswerTwo = new Answer("Euclid", questionNinetySeven, false);
        answerRepository.save(q97AnswerTwo);

        Answer q97AnswerThree = new Answer("Homer", questionNinetySeven, false);
        answerRepository.save(q97AnswerThree);

        Answer q97AnswerFour = new Answer("Eratosthenes", questionNinetySeven, false);
        answerRepository.save(q97AnswerFour);

        Question questionNinetyEight = new Question("What was the African nation of Zimbabwe formerly known as?", Difficulty.FIVE);
        questionRepository.save(questionNinetyEight);

        Answer q98AnswerOne = new Answer("Rhodesia", questionNinetyEight, true);
        answerRepository.save(q98AnswerOne);

        Answer q98AnswerTwo = new Answer("Zambia", questionNinetyEight, false);
        answerRepository.save(q98AnswerTwo);

        Answer q98AnswerThree = new Answer("Mozambique", questionNinetyEight, false);
        answerRepository.save(q98AnswerThree);

        Answer q98AnswerFour = new Answer("Bulawayo", questionNinetyEight, false);
        answerRepository.save(q98AnswerFour);

        Question questionNinetyNine = new Question("According to the BBPA, what is the most common pub name in the UK?", Difficulty.FIVE);
        questionRepository.save(questionNinetyNine);

        Answer q99AnswerOne = new Answer("Red Lion", questionNinetyNine, true);
        answerRepository.save(q99AnswerOne);

        Answer q99AnswerTwo = new Answer("Royal Oak", questionNinetyNine, false);
        answerRepository.save(q99AnswerTwo);

        Answer q99AnswerThree = new Answer("White Hart", questionNinetyNine, false);
        answerRepository.save(q99AnswerThree);

        Answer q99AnswerFour = new Answer("King's Head", questionNinetyNine, false);
        answerRepository.save(q99AnswerFour);

        Question questionOneHundred = new Question("What is the capital of Peru?", Difficulty.FIVE);
        questionRepository.save(questionOneHundred);

        Answer q100AnswerOne = new Answer("Lima", questionOneHundred, true);
        answerRepository.save(q100AnswerOne);

        Answer q100AnswerTwo = new Answer("Santiago", questionOneHundred, false);
        answerRepository.save(q100AnswerTwo);

        Answer q100AnswerThree = new Answer("Montevideo", questionOneHundred, false);
        answerRepository.save(q100AnswerThree);

        Answer q100AnswerFour = new Answer("Buenos Aires", questionOneHundred, false);
        answerRepository.save(q100AnswerFour);










    }
}
