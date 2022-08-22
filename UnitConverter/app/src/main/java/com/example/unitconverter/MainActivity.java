package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
//AppCompatActivity = AppCompatActivity methods inherited by MainActivity
//AppCompatActivity already exists
    private Button button;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {    //onCreate =
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
    }
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //to see if the button is working we use toast
//                //Toast.makeText(MainActivity.this, "Hi, Click listener worked!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int d = Integer.parseInt(s);
//                double r = d * 77.65;
//
//                textView.setText("INR = " + r + " ₹");
//            }
//        });
//    }
// Alternate method to calculate the value without using onClickListener
    public void calculate(View view){
        String s = editText.getText().toString();
        int d = Integer.parseInt(s);
        double r = d * 77.65;

        textView.setText("INR = " + r + " ₹");

        Toast.makeText(this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
    }
}