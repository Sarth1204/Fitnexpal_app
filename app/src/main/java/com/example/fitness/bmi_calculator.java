package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class bmi_calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);


        Button btn10= (Button) findViewById(R.id.back_page1);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,MainActivity.class));
            }
        });

        TextView btn11= (TextView) findViewById(R.id.obesity_1);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,obesity_info.class));
            }
        });

        TextView btn12= (TextView) findViewById(R.id.overweight_1);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,overweight_info.class));
            }
        });


        TextView btn13= (TextView) findViewById(R.id.underweight);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bmi_calculator.this,underweight_info.class));
            }
        });


    }

    public void bmi(View v){
        EditText et1 = (EditText) findViewById(R.id.height);
        EditText et2 = (EditText) findViewById(R.id.weight);
        EditText et3 = (EditText) findViewById(R.id.result);

        float n1 =Integer.parseInt(et1.getText().toString());
        float n2 = Integer.parseInt(et2.getText().toString());
        float n3 = n1/100;
        float n4 = n3*n3;
        float result = n2/n4;

        if (result<18.5){
            Toast.makeText(bmi_calculator.this,"Under Weight", Toast.LENGTH_LONG).show();
        }else if (result>=18.5 && result<25) {
            Toast.makeText(bmi_calculator.this, "Normal", Toast.LENGTH_LONG).show();
        }else if (result>=25 && result<30){
            Toast.makeText(bmi_calculator.this,"Over Weight", Toast.LENGTH_LONG).show();
        }else Toast.makeText(bmi_calculator.this,"Obesity",Toast.LENGTH_SHORT).show();


        et3.setText("BMI = "+result);
    }

}