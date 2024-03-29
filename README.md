# TheCapsApp
This app is a Jeopardy like game that asks the user questions about countries (the capital of a given country and the country of a given capital). It also keeps track of the achieved score.
# UI and Behaviour
The visible UI consists of six visible widgets
The game's log contains history of the user's interaction with the app in this session. It lists all the posed questions along with the user's answers and the correct answers.
The app converts entered answers in to uppercase, evalutes the answers to be correct or incorrect, increment the score, display the new score, append the game's log, increment the question number, and pose the next question or end the game depending on the question number. Once "DONE" is tapped for Q#9 the game will evaluate and append the log as before but the game will end. The maximum score is 9. When the game ends the sentence "Game Over!" appears in the question number label and the "DONE" button becomes disabled.
# Design
The app relies on many APIs created by Professor Hamzeh Roumani that provide data from which the app can derive questions and answers. Furthermore I wrote my own API to communicate between Professor Roumani's APIs. The Game API would speak to the Country API and the CountryDB API. It's constructor created an instance of CountryDB so that the Game instance would have access to the CountryDB database. It had a qa() method to pick a random country from the database and pose questions about it. Two possible questions could be formulated: find the capital given the country, or find the country given the capital, and it randomly chooses between them.
# Summary
Mobile game for android devices that evaluates the users geographic knowledge by asking a series of questions about countries (the capital of a given country and the country of a given capital).
Implemented using Android Studio IDE
Developed a Java based backend to that consumes two different APIs: Country & CountryDB
The backend queries the CountryDB database and generates a series of questions based on the countries selected at random. 
