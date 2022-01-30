package com.example.thecapsapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Game game;
    private String question;
    private String answer;
    private int score;
    private int qNum;
    private String log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = "";
        answer = "";
        score = 0;
        qNum = 1;
        log = "";
        ((TextView) findViewById(R.id.score)).setText("SCORE = " + score);
        ((TextView) findViewById(R.id.qNum)).setText("Q# " + qNum);
        ask();

    }

            private void ask() {
            Game game = new Game();
            String retrievedQuestion = game.qa();
            String[] q = retrievedQuestion.split("\n");
            this.question = q[0];
            this.answer = q[1];
            TextView ques = ((TextView) findViewById(R.id.question));
            ques.setText(this.question);
        }

        public void onDone(View view) {
            if (qNum == 10)
                finish();

            TextView qNumber = (TextView) findViewById(R.id.qNum);
            TextView result = (TextView) findViewById(R.id.log);
            TextView finalScore = (TextView) findViewById(R.id.score);

            String retrievedAnswer = "";
            String finalResult = "";

            retrievedAnswer = ((EditText) findViewById(R.id.answer)).getText().toString();
            finalResult += "\nQ# " + qNum + ":" + question + "\n Your Answer: " + "\n Correct Answer : " + answer + "\n";

            log += finalResult;
            qNum++;
            qNumber.setText("Q#" + qNum);
            result.setText(log);

            if(retrievedAnswer.equalsIgnoreCase(answer)){
                score++;
                finalScore.setText("SCORE= " + score);
                }
            ask();

            if (qNum == 10){
                qNumber.setText("Game Over!");
                Button doneButton = (Button) findViewById(R.id.done);
                doneButton.setEnabled(false);
                doneButton.setClickable(false);
            }
        }
    }
