package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {


        private ListView listView;
        private Button backButton;
        private Button exitButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);

            listView = findViewById(R.id.listView);
            backButton = findViewById(R.id.backButton);
            exitButton = findViewById(R.id.exitButton);

            String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
            listView.setAdapter(adapter);

            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finishAffinity();
                }
            });
        }
    }
