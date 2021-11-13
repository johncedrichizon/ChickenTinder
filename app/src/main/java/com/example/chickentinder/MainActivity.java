package com.example.chickentinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMainHost = (Button) findViewById(R.id.btnMainHost);
        Button btnMainJoin = (Button) findViewById(R.id.btnMainJoin);

        btnMainHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, HostRoom.class);
                startActivity(a);
            }
        });

        btnMainJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, join_page.class);
                startActivity(b);
            }
        });

    }
}