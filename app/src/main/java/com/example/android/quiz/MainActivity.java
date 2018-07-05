package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;



    public void onSubmit(View view) {

        RadioButton rB = ((RadioButton) findViewById(R.id.right));

        if (rB.isChecked() == true) {
            score+=1;
            TextView ans1 = (TextView) findViewById(R.id.ans1);
            ans1.setText("You got it right :)");
        }
        else {
            TextView ans1 = (TextView) findViewById(R.id.ans1);
            ans1.setText("You got it wrong");
            //donothing
        }

        RadioButton rB2 = ((RadioButton) findViewById(R.id.right2));

        if (rB2.isChecked() == true) {
            score+=1;
            TextView ans2 = (TextView) findViewById(R.id.ans2);
            ans2.setText("You got it right :)");
        }
        else {
            TextView ans2 = (TextView) findViewById(R.id.ans2);
            ans2.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB3 = ((RadioButton) findViewById(R.id.right3));

        if (rB3.isChecked() == true) {
            score+=1;
            TextView ans3 = (TextView) findViewById(R.id.ans3);
            ans3.setText("You got it right :)");
        }
        else {
            TextView ans3 = (TextView) findViewById(R.id.ans3);
            ans3.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB4 = ((RadioButton) findViewById(R.id.right4));

        if (rB4.isChecked() == true) {
            score+=1;
            TextView ans4 = (TextView) findViewById(R.id.ans4);
            ans4.setText("You got it right :)");
        }
        else {
            TextView ans4 = (TextView) findViewById(R.id.ans4);
            ans4.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB5 = ((RadioButton) findViewById(R.id.right5));

        if (rB5.isChecked() == true) {
            score+=1;
            TextView ans5 = (TextView) findViewById(R.id.ans5);
            ans5.setText("You got it right :)");
        }
        else {
            TextView ans5 = (TextView) findViewById(R.id.ans5);
            ans5.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB6 = ((RadioButton) findViewById(R.id.right6));

        if (rB6.isChecked() == true) {
            score+=1;
            TextView ans6 = (TextView) findViewById(R.id.ans6);
            ans6.setText("You got it right :)");
        }
        else {
            TextView ans6 = (TextView) findViewById(R.id.ans6);
            ans6.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB7 = ((RadioButton) findViewById(R.id.right7));

        if (rB7.isChecked() == true) {
            score+=1;
            TextView ans7 = (TextView) findViewById(R.id.ans7);
            ans7.setText("You got it right :)");
        }
        else {
            TextView ans7 = (TextView) findViewById(R.id.ans7);
            ans7.setText("You got it wrong :(");
            //donothing
        }


        RadioButton rB8 = ((RadioButton) findViewById(R.id.right8));

        if (rB8.isChecked() == true) {
            score+=1;
            TextView ans8 = (TextView) findViewById(R.id.ans8);
            ans8.setText("You got it right :)");

        }
        else {
            TextView ans8 = (TextView) findViewById(R.id.ans8);
            ans8.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB9 = ((RadioButton) findViewById(R.id.right9));

        if (rB9.isChecked() == true) {
            score+=1;
            TextView ans9 = (TextView) findViewById(R.id.ans9);
            ans9.setText("You got it right :)");
        }
        else {
            TextView ans9 = (TextView) findViewById(R.id.ans9);
            ans9.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB10 = ((RadioButton) findViewById(R.id.right10));

        if (rB10.isChecked() == true) {
            score+=1;
            TextView ans10 = (TextView) findViewById(R.id.ans10);
            ans10.setText("You got it right :)");

        }
        else {
            TextView ans10 = (TextView) findViewById(R.id.ans10);
            ans10.setText("You got it wrong :(");
            //donothing
        }



        RadioButton rB11 = ((RadioButton) findViewById(R.id.right11));

        if (rB11.isChecked() == true) {
            score+=1;
            TextView ans11 = (TextView) findViewById(R.id.ans11);
            ans11.setText("You got it right :)");
        }
        else {
            TextView ans11 = (TextView) findViewById(R.id.ans11);
            ans11.setText("You got it wrong :(");
            //donothing
        }

        RadioButton rB12 = ((RadioButton) findViewById(R.id.right12));

        if (rB12.isChecked() == true) {
            score+=1;
            TextView ans12 = (TextView) findViewById(R.id.ans12);
            ans12.setText("You got it right:)");
        }
        else {
            TextView ans12 = (TextView) findViewById(R.id.ans12);
            ans12.setText("You got it wrong :(");
            //donothing
        }



        RadioButton rB13 = ((RadioButton) findViewById(R.id.right13));

        if (rB13.isChecked() == true) {
            score+=1;
            TextView ans13 = (TextView) findViewById(R.id.ans13);
            ans13.setText("You got it right :)");
        }
        else {
            TextView ans13 = (TextView) findViewById(R.id.ans13);
            ans13.setText("You got it wrong :(");
            //donothing
        }






        if (score == 0) {
            TextView numView = (TextView) findViewById(R.id.scoreNum);
            numView.setText(String.valueOf(score));

            TextView scoreView = (TextView) findViewById(R.id.scoreText);
            scoreView.setText("Looks like someone's been excluded from this narrative a little too long...");


        } else if (score >= 1 && score <= 3) {
            TextView numView = (TextView) findViewById(R.id.scoreNum);
            numView.setText(String.valueOf(score));

            TextView scoreView = (TextView) findViewById(R.id.scoreText);
            scoreView.setText("Stop acting like you're an actual Swifty, you are SO fake!");

        } else if (score >= 4 && score <= 6) {
            TextView numView = (TextView) findViewById(R.id.scoreNum);
            numView.setText(String.valueOf(score));

            TextView scoreView = (TextView) findViewById(R.id.scoreText);
            scoreView.setText("You might wanna get some receipts so you can edit this later...");
        } else if (score >= 7 && score <= 9) {
            TextView numView = (TextView) findViewById(R.id.scoreNum);
            numView.setText(String.valueOf(score));

            TextView scoreView = (TextView) findViewById(R.id.scoreText);
            scoreView.setText("There she goes... getting an average score again");
        } else if (score >= 10 && score <= 12) {
            TextView numView = (TextView) findViewById(R.id.scoreNum);
            numView.setText(String.valueOf(score));

            TextView scoreView = (TextView) findViewById(R.id.scoreText);
            scoreView.setText("Hssss y'all!\n(only true Swifties like you can understand that)");
        } else if (score == 13) {
            TextView numView = (TextView) findViewById(R.id.scoreNum);
            numView.setText(String.valueOf(score));

            TextView scoreView = (TextView) findViewById(R.id.scoreText);
            scoreView.setText("Stop making that surprised face, it's SO annoying!");
        } else {
            //do nothing
        }
    }

    public void reset(View view) {
        score = 0;

        TextView numView = (TextView) findViewById(R.id.scoreNum);
        numView.setText("--");

        TextView scoreView = (TextView) findViewById(R.id.scoreText);
        scoreView.setText("");


        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.r1);
        radioGroup.clearCheck();

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.r2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.r3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.r4);
        radioGroup4.clearCheck();

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.r5);
        radioGroup5.clearCheck();

        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.r6);
        radioGroup6.clearCheck();

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.r7);
        radioGroup7.clearCheck();

        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.r8);
        radioGroup8.clearCheck();

        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.r9);
        radioGroup9.clearCheck();

        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.r10);
        radioGroup10.clearCheck();

        RadioGroup radioGroup11 = (RadioGroup) findViewById(R.id.r11);
        radioGroup11.clearCheck();

        RadioGroup radioGroup12 = (RadioGroup) findViewById(R.id.r12);
        radioGroup12.clearCheck();

        RadioGroup radioGroup13 = (RadioGroup) findViewById(R.id.r13);
        radioGroup13.clearCheck();



        TextView ans1 = (TextView) findViewById(R.id.ans1);
        ans1.setText("");

        TextView ans2 = (TextView) findViewById(R.id.ans2);
        ans2.setText("");

        TextView ans3 = (TextView) findViewById(R.id.ans3);
        ans3.setText("");

        TextView ans4 = (TextView) findViewById(R.id.ans4);
        ans4.setText("");

        TextView ans5 = (TextView) findViewById(R.id.ans5);
        ans5.setText("");


        TextView ans6 = (TextView) findViewById(R.id.ans6);
        ans6.setText("");

        TextView ans7 = (TextView) findViewById(R.id.ans7);
        ans7.setText("");


        TextView ans8 = (TextView) findViewById(R.id.ans8);
        ans8.setText("");


        TextView ans9 = (TextView) findViewById(R.id.ans9);
        ans9.setText("");


        TextView ans10 = (TextView) findViewById(R.id.ans10);
        ans10.setText("");

        TextView ans11 = (TextView) findViewById(R.id.ans11);
        ans11.setText("");



        TextView ans12 = (TextView) findViewById(R.id.ans12);
        ans12.setText("");


        TextView ans13 = (TextView) findViewById(R.id.ans13);
        ans13.setText("");


    }


}
