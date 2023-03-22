package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dev_menu extends AppCompatActivity {

    TextView OPENLINK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_menu);

        //Youtube Link Added to button in crunches.
        OPENLINK= findViewById(R.id.moreinfo_dev);
        OPENLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                golink1("https://fitnexpal.my.canva.site/");
            }
        });
    }
    private void golink1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}