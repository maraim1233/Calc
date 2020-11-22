package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView tvRez = findViewById(R.id.tv_rez);

        final EditText ed_number_1 = findViewById(R.id.ed_number_1);
        final EditText ed_number_2 = findViewById(R.id.ed_number_2);

        Button btn_add = findViewById(R.id.btn_add);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_mult = findViewById(R.id.btn_mult);
        Button btn_div = findViewById(R.id.btn_div);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(ed_number_1.getText().toString());

                int num2 = Integer.parseInt(ed_number_2.getText().toString());

                int rez = num1 + num2;

                tvRez.setText(String.valueOf(rez));

            }

        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(ed_number_1.getText().toString());

                int num2 = Integer.parseInt(ed_number_2.getText().toString());

                int rez = num1 - num2;

                tvRez.setText(String.valueOf(rez));


            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(ed_number_1.getText().toString());

                int num2 = Integer.parseInt(ed_number_2.getText().toString());

                int rez = num1 * num2;

                tvRez.setText(String.valueOf(rez));


            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(ed_number_1.getText().toString());

                    int num2 = Integer.parseInt(ed_number_2.getText().toString());

                    int rez = num1 / num2;

                    tvRez.setText(String.valueOf(rez));

                } catch (Exception ex) {

                    Toast.makeText(MainActivity.this, "divide by zero", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}