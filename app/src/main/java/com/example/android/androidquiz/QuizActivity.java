package com.example.android.androidquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button button = findViewById(R.id.button_done);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int score = 0;
                if (((RadioButton) findViewById(R.id.quizOneB)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.quizTwoB)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.quizThreeA)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.quizFourB)).isChecked()) {
                    score++;
                }
                if (((RadioButton) findViewById(R.id.quizFiveA)).isChecked()) {
                    score++;
                }

                displayResult(score);
            }

        });
    }

    private void displayResult(int score) {
        String message = "You scored " + score;
        message += " out of 5";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}