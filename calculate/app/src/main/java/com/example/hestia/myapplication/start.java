package com.example.hestia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by hestia on 2017-07-01.
 */

public class start extends Activity {
    Button menuinit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        menuinit=(Button)findViewById(R.id.input);
        menuinit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent=new Intent(start.this,menuinit.class);
                startActivity(intent);
            }
        });
    }
}

