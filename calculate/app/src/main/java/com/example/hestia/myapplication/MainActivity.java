package com.example.hestia.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,start.class);
                startActivity(intent);
            }
        });
    }
}
