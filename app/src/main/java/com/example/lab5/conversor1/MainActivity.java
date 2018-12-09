package com.example.lab5.conversor1;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button temperatura=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperatura=(Button)findViewById(R.id.btn1);

        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cambiar=new Intent(getApplicationContext(),temperatura.class);
            }
        });
    }
}
