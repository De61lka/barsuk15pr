package com.example.barsukpr15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tv3 extends AppCompatActivity {

    public class tv2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tv3);
         @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnGoToSecAct = (Button) findViewById(R.id.button);

            View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(tv3.this,tv4.class);
                    startActivity(intent);
                }
            };
            btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct);
        }
    }}