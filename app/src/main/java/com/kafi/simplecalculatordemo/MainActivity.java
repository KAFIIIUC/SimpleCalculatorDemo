package com.kafi.simplecalculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText inputNumOne,inputNumTwo;

    Button btnPlus,btnMinus,btnMul,btnDiv,btnClear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResult = findViewById(R.id.txtViewId);
        inputNumOne = findViewById(R.id.inputOne);
        inputNumTwo = findViewById(R.id.inputTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valueOne = inputNumOne.getText().toString();
                String valueTwo = inputNumTwo.getText().toString();

                if (!valueOne.isEmpty() && !valueTwo.isEmpty()){

                    double numOne = Double.parseDouble(valueOne);
                    double numTwo = Double.parseDouble(valueTwo);
                    double result = numOne + numTwo;

                    txtResult.setText(""+result);
                }

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valueOne = inputNumOne.getText().toString();
                String valueTwo = inputNumTwo.getText().toString();

                if (!valueOne.isEmpty() && !valueTwo.isEmpty()){

                    double numOne = Double.parseDouble(valueOne);
                    double numTwo = Double.parseDouble(valueTwo);
                    double result = numOne - numTwo;

                    txtResult.setText(""+result);
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valueOne = inputNumOne.getText().toString();
                String valueTwo = inputNumTwo.getText().toString();

                if (!valueOne.isEmpty() && !valueTwo.isEmpty()){

                    double numOne = Double.parseDouble(valueOne);
                    double numTwo = Double.parseDouble(valueTwo);
                    double result = numOne * numTwo;

                    txtResult.setText(""+result);
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String valueOne = inputNumOne.getText().toString();
                String valueTwo = inputNumTwo.getText().toString();

                if (!valueOne.isEmpty() && !valueTwo.isEmpty()){

                    double numOne = Double.parseDouble(valueOne);
                    double numTwo = Double.parseDouble(valueTwo);
                    double result = numOne / numTwo;

                    txtResult.setText(""+result);
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText("0");
                inputNumOne.setText("");
                inputNumTwo.setText("");

            }
        });


    }
}
