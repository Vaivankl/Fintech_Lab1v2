package com.example.fintech_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvmain;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvmain = findViewById(R.id.tvmain);
        this. button2 = findViewById(R.id. button2);

    }

    public void OnBtnClick(View view) {
        this.tvmain.setText(R.string.Changing_text_1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setTextColor(Color.RED);
            }
        });
    }
}

