package com.example.chickentinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button jr_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jr_main = (Button) findViewById(R.id.jr_main);

        jr_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent a = new Intent(getApplicationContext(),join_page.class);
            startActivity(a);


            }
        });
    }
}