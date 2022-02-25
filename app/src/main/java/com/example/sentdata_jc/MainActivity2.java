package com.example.sentdata_jc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView nm_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nm_2 = (TextView) findViewById(R.id.nm_2);

        String fact = getIntent().getStringExtra("fact");
        nm_2.setText("Hello " + fact);

    }

    public void Back(View view){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }

}