package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {


        private RadioGroup radioGroup;

        private RadioButton radioButton1;
        private RadioButton radioButton2;
        private Button backButton;
        private Button nextButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            radioGroup = findViewById(R.id.radioGroup);
            radioButton1 = findViewById(R.id.radioButton1);
            radioButton2 = findViewById(R.id.radioButton2);
            backButton = findViewById(R.id.backButton);
            nextButton = findViewById(R.id.nextButton);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    if (selectedId == R.id.radioButton1) {
                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(intent);
                    } else if (selectedId == R.id.radioButton2) {
                        // Do something else
                    }
                }
            });
        }
    }
