package com.example.p03thirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonClickCounter extends AppCompatActivity {
    TextView myTextView;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_counter);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(oMyButton);
    }
    View.OnClickListener oMyButton = new View.OnClickListener() {
        int counter = 0;
        @Override
        public void onClick(View v) {
            myTextView.setText(String.valueOf(++counter));
        }
    };
}