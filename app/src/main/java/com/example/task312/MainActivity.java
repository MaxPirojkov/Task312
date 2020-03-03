package com.example.task312;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView screen = findViewById(R.id.textViewNumb);
        Button n0 = findViewById(R.id.btn_zero);
        Button n1 = findViewById(R.id.btn_one);
        Button n2 = findViewById(R.id.btn_two);
        Button n3 = findViewById(R.id.btn_three);
        Button n4 = findViewById(R.id.btn_four);
        Button n5 = findViewById(R.id.btn_five);
        Button n6 = findViewById(R.id.btn_six);
        Button n7 = findViewById(R.id.btn_seven);
        Button n8 = findViewById(R.id.btn_eight);
        Button n9 = findViewById(R.id.btn_nine);
        Button dot = findViewById(R.id.btn_dot);
        Button equals = findViewById(R.id.btn_equally);
        Button addit = findViewById(R.id.btnPlus);
        Button minus = findViewById(R.id.btnMinus);
        Button multip = findViewById(R.id.btnMultip);
        Button division = findViewById(R.id.btn_division);
        Button plusMinus = findViewById(R.id.btn_plus_minus);
        Button percent = findViewById(R.id.btn_persent);
        Button clear = findViewById(R.id.btn_reset);

        View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id){
                    case R.id.btn_zero:
                    screen.append("0");
                        break;
                    case R.id.btn_one:
                        screen.append("1");
                        break;
                    case R.id.btn_two:
                        screen.append("2");
                        break;
                    case R.id.btn_three:
                        screen.append("3");
                        break;
                    case R.id.btn_four:
                        screen.append("4");
                        break;
                    case R.id.btn_five:
                        screen.append("5");
                        break;
                    case R.id.btn_six:
                        screen.append("6");
                        break;
                    case R.id.btn_seven:
                        screen.append("7");
                        break;
                    case R.id.btn_eight:
                        screen.append("8");
                        break;
                    case R.id.btn_nine:
                        screen.append("9");
                        break;
                    case R.id.btn_dot:

                        break;
                    case R.id.btnPlus:
                        screen.append(".");
                        break;
                    case R.id.btnMinus:

                        break;
                    case R.id.btn_equally:

                        break;

                    case R.id.btnMultip:

                        break;
                    case R.id.btn_division:

                        break;
                    case R.id.btn_plus_minus:

                        break;
                    case R.id.btn_persent:

                        break;


                }
            }
        };

        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        addit.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        multip.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        plusMinus.setOnClickListener(calculatorListener);
        percent.setOnClickListener(calculatorListener);
        clear.setOnClickListener(calculatorListener);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
                }
            
        });

    }
}