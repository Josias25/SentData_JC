package com.example.sentdata_jc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nm_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nm_1 = (EditText) findViewById(R.id.nm_1);
    }

    public void Sent(View view){
        Intent j =new Intent(this, MainActivity2.class);
        j.putExtra("fact", nm_1.getText().toString());
        startActivity(j);
    }

}