package com.example.joseph.decimaltobinary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class solution extends AppCompatActivity implements View.OnClickListener{

    private TextView solution = findViewById(R.id.solution_text);
    private Button another = findViewById(R.id.another_problem);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        solution = findViewById(R.id.solution_text);
        another = findViewById(R.id.another_problem);


        another.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view == another)
        {
            Intent intent = new Intent(solution.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }

    private void convertNumber()
    {
        String number = number_input.getText().toString().trim();
        String method = conversionMethod.getSelectedItem().toString();

        if(method.equals("Binary to Decimal"))
        {
            binaryToDecimal(number);
        }
        else if(method.equals("Decimal to Binary"))
        {
            decimalToBinary(number);
        }
    }

    private void binaryToDecimal(String number)
    {

        int decimalNum = Integer.parseInt(number, 2);
        solution.setText(Integer.toString(decimalNum));
    }

    private void decimalToBinary(String number)
    {
        int decimal = Integer.parseInt(number);
        String binary = Integer.toBinaryString(decimal);
        solution.setText(binary);
    }
}
