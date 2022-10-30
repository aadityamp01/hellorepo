package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText e1;
    private EditText e2;
    private TextView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        e1 = findViewById(R.id.number1);
        e2 = findViewById(R.id.number2);
        t1 = findViewById(R.id.add);
        t2 = findViewById(R.id.subtract);
        t3 = findViewById(R.id.multiply);
        t4 = findViewById(R.id.divide);
    }

//    b1.setOnClickListener(new View.OnClickListener){
//
//    }



    public void math(View view){
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        double n1, n2;
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);

        double add = n1 + n2;
        double subtract = n1 - n2;
        double multiply = n1 * n2;
        double divide = n1 / n2;

        t1.setText("Addition = " +add);
        t2.setText("Subtraction = " +subtract);
        t3.setText("Multiplication = " +multiply);
        t4.setText("Division = " +divide);

    }
}