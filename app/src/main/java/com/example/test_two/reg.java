package com.example.test_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class reg extends AppCompatActivity {

    public EditText emailInput;
    public EditText nameInput;
    public EditText numberInput;
    public EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        emailInput = (EditText) findViewById(R.id.email);
        nameInput = (EditText) findViewById(R.id.name);
        numberInput = (EditText) findViewById(R.id.number);
        passwordInput = (EditText) findViewById(R.id.password);
    }
    public void onClick(View view ) {


        if (emailInput.getText().toString().equals("") && nameInput.getText().toString().equals("") &&
                numberInput.getText().toString().equals("") && passwordInput.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Какая-то из строк не заполнена", Toast.LENGTH_SHORT).show();

        else{
            Intent intent = new Intent(reg.this, vhod.class);
            startActivity(intent);
        }

    }
    public void OnClick(View view){
        Intent intent = new Intent(reg.this, MainActivity.class);
        startActivity(intent);
    }
}