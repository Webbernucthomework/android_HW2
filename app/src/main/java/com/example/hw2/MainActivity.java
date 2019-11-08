package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bmi = findViewById(R.id.button2);
        bmi.setOnClickListener(calcBMI);
}

    private View.OnClickListener calcBMI = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0.00");
            EditText height = findViewById(R.id.editText);
            EditText weight = findViewById(R.id.editText2);

            //身高
            double height_1 = Double.parseDouble(height.getText().toString())/100;
            //體重
            double weight_1 = Double.parseDouble(weight.getText().toString());
            //計算BMI
            double BMI = weight_1 / (height_1*height_1);
            TextView result = findViewById(R.id.textView6);
            result.setText(nf.format(BMI));
        }
    };
}
