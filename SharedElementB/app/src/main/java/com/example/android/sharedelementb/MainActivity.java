package com.example.android.sharedelementb;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(Integer i=0;i<10000000;i++){}
        setContentView(R.layout.activity_main);
        final View fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.android.sharedelementa.SHARED_ELEMENT");
                Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        fab, fab.getTransitionName()).toBundle();
                startActivity(intent, bundle);
            }
        });
    }
}
