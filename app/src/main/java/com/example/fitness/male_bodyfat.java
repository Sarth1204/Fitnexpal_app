package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class male_bodyfat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_bodyfat);


    }

    public void bodyfat(View v){
        EditText et1 = (EditText) findViewById(R.id.age);
        EditText et2 = (EditText) findViewById(R.id.weight_bfc);
        EditText et3 = (EditText) findViewById(R.id.height_bfc);
        EditText et4 = (EditText) findViewById(R.id.result_bfc);

        double n1 =Integer.parseInt(et1.getText().toString());
        double n2 = Integer.parseInt(et2.getText().toString());
        double n3 = Integer.parseInt(et3.getText().toString());

        //Calculating BMI
        double n4 = n3/100;
        //Height in Meters
        double n5 = n4*n4;
        double n6 = n2/n5;
        //Calculating BodyFat
        //n6==BMI
        double n7 = 1.20*n6;
        double n8 = 0.23*n1;
        double n9 = 16.2;

        //Body Fat Percentage

        double result = (n7+n8)-n9;







//
//        if (result<18.5){
//            Toast.makeText(bmi_calculator.this,"Under Weight", Toast.LENGTH_LONG).show();
//        }else if (result>=18.5 && result<25) {
//            Toast.makeText(bmi_calculator.this, "Normal", Toast.LENGTH_LONG).show();
//        }else if (result>=25 && result<30){
//            Toast.makeText(bmi_calculator.this,"Over Weight", Toast.LENGTH_LONG).show();
//        }else Toast.makeText(bmi_calculator.this,"Error",Toast.LENGTH_SHORT).show();
//

        et4.setText(" "+result);
    }
}