package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring Widgets
    EditText editText;
    TextView textView, textView2, textView3, convertedWeight;
    Button poundButton, kiloButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating the widgets

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        convertedWeight = findViewById(R.id.convertedWeight);
        editText = findViewById(R.id.editTextNumber);

        poundButton = findViewById(R.id.button);
        kiloButton = findViewById(R.id.button2);

        // Adding a Click event for button
        poundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Call convertToPound Method
                convertToPound();
            }
        });
        kiloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertToKilos();
            }
        });

    }

    private void convertToKilos() {
        String valueEntered = editText.getText().toString();

        double valueInPounds = Double.parseDouble(valueEntered);

        double kilos = valueInPounds / 2.205;

        convertedWeight.setText("" + String.format("%.3f",kilos) + " kg" );
    }

    private void convertToPound() {
        // Method to convert the value entered in editText from Kilograms to Pounds

        String valueEntered = editText.getText().toString();

        double valueInKilo = Double.parseDouble(valueEntered);

        double pounds = valueInKilo * 2.205;

        // Displaying the pound value
        convertedWeight.setText("" + String.format("%.3f",pounds) + " lbs" );
    }

}