package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView resulttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        number1 = findViewById(R.id.editTextText3);
        number2 = findViewById(R.id.editTextText4);
        resulttext = findViewById(R.id.textView3);
    }

    public void sum(View view) {
        if (number1.getText().toString().matches("") || number1.getText().toString().matches("")) {
            resulttext.setText("ENTER NUMBER!!!");
        } else {
            int number1text = Integer.parseInt(number1.getText().toString());
            int number2text = Integer.parseInt(number2.getText().toString());
            int result = number1text + number2text;
            resulttext.setText("result:" + result);
        }


    }

    public void deduct(View view) {
        if (number1.getText().toString().matches("") || number1.getText().toString().matches("")) {
            resulttext.setText("ENTER NUMBER!!!");
        } else {
            int number1text = Integer.parseInt(number1.getText().toString());
            int number2text = Integer.parseInt(number2.getText().toString());
            int result = number1text - number2text;
            resulttext.setText("result:" + result);

        }
    }

    public void divide(View view) {
        if (number1.getText().toString().matches("") || number1.getText().toString().matches("")) {
            resulttext.setText("ENTER NUMBER!!!");
        } else {
            int number1text = Integer.parseInt(number1.getText().toString());
            int number2text = Integer.parseInt(number2.getText().toString());
            int result = number1text / number2text;
            resulttext.setText("result:" + result);
        }
    }


    public void multiply(View view) {
        if (number1.getText().toString().matches("") || number1.getText().toString().matches("")) {
            resulttext.setText("ENTER NUMBER!!!");
        } else {
            int number1text = Integer.parseInt(number1.getText().toString());
            int number2text = Integer.parseInt(number2.getText().toString());
            int result = number1text * number2text;
            resulttext.setText("result:" + result);

        }

    }
}