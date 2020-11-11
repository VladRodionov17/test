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
// что будет если не будет написан номер телефона
       if (numberInput.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Номер телефона не зеполнен!", Toast.LENGTH_SHORT).show();
        }
// что будет если не будет написан пароль
        if (passwordInput.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Пароль не зеполнен!", Toast.LENGTH_SHORT).show();
//    что будет, если не будут написаны номер и пароль
        }
        if (passwordInput.getText().toString().equals("") && numberInput.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Номер телефона и пароль не заполнены!", Toast.LENGTH_SHORT).show();
//    делаем переход на другую стр. при нажатии на кнопку, которая будет задана
        }
        else {
            Intent intent = new Intent(MainActivity.this, vhod.class);
            startActivity(intent);
        }
    }
    public void OnClick (View view){
        Intent intent = new Intent(MainActivity.this, reg.class);
        startActivity(intent);
    }
}
