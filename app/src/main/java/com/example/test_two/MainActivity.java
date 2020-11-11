package com.example.test_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    подключаем нужные нам блоки
    public EditText numberInput;
    public EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = (EditText) findViewById(R.id.number);
        passwordInput = (EditText) findViewById(R.id.password);

    }
//    задаем конкретные действия кнопкам и полям
    public void onClick(View view) {

        if (numberInput.getText().toString().equals("") && passwordInput.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Какая-то из не заполнена!", Toast.LENGTH_SHORT).show();

    }
//    делаем переход на другую стр. при нажатии на кнопку, которая будет задана
    {
        Intent intent = new Intent(MainActivity.this, vhod.class);
        startActivity(intent);
    }
    public void OnClick(View view){
        Intent intent = new Intent(MainActivity.this, reg.class);
        startActivity(intent);
    }
}