package com.example.joseph.decimaltobinary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private TextView display_conversion;
    private TextView solution;

    private EditText number_input;

    private Spinner conversionMethod;

    private Button convert_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display_conversion = findViewById(R.id.display_conversion);
        solution = findViewById(R.id.solution);

        number_input = findViewById(R.id.number_input);

        conversionMethod = findViewById(R.id.conversionMethod);

        convert_button = findViewById(R.id.convert_button);



        convert_button.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view == convert_button)
        {
            convertNumber();
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
