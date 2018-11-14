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
    private EditText number_input;

    private Spinner conversionMethod;

    private Button convert_button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_input = findViewById(R.id.number_input);

        conversionMethod = findViewById(R.id.conversionMethod);

        convert_button = findViewById(R.id.convert_button);


        convert_button.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view == convert_button)
        {
            String conversion = conversionMethod.getSelectedItem().toString();
            String number = number_input.getText().toString().trim();

            Intent intent = new Intent(MainActivity.this, solution.class);

            intent.putExtra("conversion", conversion);
            intent.putExtra("number", number);

            startActivity(intent);
            finish();
        }
    }
}
