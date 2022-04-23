package com.example.colorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button blackButton;
Button orangeButton;
Button yellowButton;
Button greenButton;
Button nextButton;
Button previousButton;
TextView textView;

private int currentIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackButton=findViewById(R.id.button_black);
        orangeButton=findViewById(R.id.button_orange);
        yellowButton=findViewById(R.id.button_yellow);
        greenButton=findViewById(R.id.button_green);
        nextButton=findViewById(R.id.button_next);
        previousButton=findViewById(R.id.button_previous);
        textView=findViewById(R.id.answer_text_view);
        textView.setText(questions[currentIndex]);


        blackButton.setOnClickListener(this);
        orangeButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        previousButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

    }
private String[] questions={"which one is black color","which one is green color",
        "which one is yellow color","which one is orange color"};
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button_black:
                if(currentIndex==0){
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_green:
                if(currentIndex==1){
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_yellow:
                if(currentIndex==2){
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_orange:
                if(currentIndex==3){
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.button_next:

                currentIndex = (currentIndex + 1) % questions.length;
                textView.setText(questions[currentIndex]);
                break;
            case R.id.button_previous:
                if(currentIndex>0) {
                    currentIndex = (currentIndex - 1) % questions.length;
                    textView.setText(questions[currentIndex]);
                }
                break;


        }

    }
}