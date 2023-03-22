package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));



        Button btn = (Button) findViewById(R.id.bmi_calx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bmi_calculator.class));

            }
        });

        Button btn1 = (Button) findViewById(R.id.calories_calx);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,calories_calx.class));

            }
        });

        Button btn2 = (Button) findViewById(R.id.bodyfat_calx);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bodyfat_calx.class));

            }
        });


        Button btn3 = (Button) findViewById(R.id.bmr_calx);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,bmr_calx.class));

            }
        });

        Button btn4 = (Button) findViewById(R.id.excercies_info);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Exercies_info.class));

            }
        });




//        Button btn5 = (Button) findViewById(R.id.idealweight_calx);
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,idealweight_calx.class));
//
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu_ex,menu);
       return super.onCreateOptionsMenu(menu);



    }

    //MENU
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        switch (item.getItemId()) {

                case R.id.dev_page:
                    Intent intent = new Intent(MainActivity.this,dev_menu.class);
                    startActivity(intent);
                    Toast.makeText(this,"Developers",Toast.LENGTH_LONG).show();
                    return true;


            case R.id.info_menu:
                Intent intent1 = new Intent(MainActivity.this,info_menu.class);
                startActivity(intent1);
                Toast.makeText(this,"About",Toast.LENGTH_LONG).show();
                return true;



            }
            return super.onOptionsItemSelected(item);

        }



}