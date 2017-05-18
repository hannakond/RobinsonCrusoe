package com.example.android.robinsoncrusoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void checkQuestion1() {
        RadioButton radioButtonCorrect = (RadioButton) findViewById(R.id.Q1correctAnswer);
        boolean goodAnswer = radioButtonCorrect.isChecked();
        if (goodAnswer) {
            correctAnswers += 1;
        }
    }

    private String getQuestion2UserInput() {
        EditText userInputFriendName = (EditText) findViewById(R.id.Q2input);
        return userInputFriendName.getText().toString();
    }

    private void checkQuestion2() {
        String name = getQuestion2UserInput();
        if (name.trim().equalsIgnoreCase("Friday")) {
            correctAnswers += 1;
        }
    }

    private void checkQuestion3() {
        RadioButton radioButtonCorrect = (RadioButton) findViewById(R.id.Q3correctAnswer);
        boolean goodAnswer = radioButtonCorrect.isChecked();
        if (goodAnswer) {
            correctAnswers += 1;
        }
    }

    private void checkQuestion4() {
        CheckBox answer1 = (CheckBox) findViewById(R.id.Q4correctAnswer1);
        CheckBox answer2 = (CheckBox) findViewById(R.id.Q4correctAnswer2);
        CheckBox answer3 = (CheckBox) findViewById(R.id.Q4badAnswer1);
        CheckBox answer4 = (CheckBox) findViewById(R.id.Q4badAnswer2);
        CheckBox answer5 = (CheckBox) findViewById(R.id.Q4correctAnswer3);
        boolean goodAnswer1 = answer1.isChecked();
        boolean goodAnswer2 = answer2.isChecked();
        boolean badAnswer1 = answer3.isChecked();
        boolean badAnswer2 = answer4.isChecked();
        boolean goodAnswer3 = answer5.isChecked();

        if (goodAnswer1 && goodAnswer2 && goodAnswer3 && !badAnswer1 && !badAnswer2) {
            correctAnswers += 1;
        }
    }

    private void checkQuestion5() {
        RadioButton radioButtonCorrect = (RadioButton) findViewById(R.id.Q5correctAnswer);
        boolean goodAnswer = radioButtonCorrect.isChecked();
        if (goodAnswer) {
            correctAnswers += 1;
        }
    }

    private void checkQuestion6() {
        CheckBox answer1 = (CheckBox) findViewById(R.id.Q6correctAnswer1);
        CheckBox answer2 = (CheckBox) findViewById(R.id.Q6correctAnswer2);
        CheckBox answer3 = (CheckBox) findViewById(R.id.Q6correctAnswer3);
        CheckBox answer4 = (CheckBox) findViewById(R.id.Q6badAnswer1);
        CheckBox answer5 = (CheckBox) findViewById(R.id.Q6badAnswer2);
        boolean goodAnswer1 = answer1.isChecked();
        boolean goodAnswer2 = answer2.isChecked();
        boolean goodAnswer3 = answer3.isChecked();
        boolean badAnswer1 = answer4.isChecked();
        boolean badAnswer2 = answer5.isChecked();

        if (goodAnswer1 && goodAnswer2 && goodAnswer3 && !badAnswer1 && !badAnswer2) {
            correctAnswers += 1;
        }
    }

    private void checkAllQuestions() {
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
    }

    public void submitFunction(View v) {
        checkAllQuestions();
        Toast finalToast = Toast.makeText(MainActivity.this, "Well done! The number of questions answered correctly: " + correctAnswers + "/6", Toast.LENGTH_SHORT);
        finalToast.show();
        correctAnswers = 0;
    }
}