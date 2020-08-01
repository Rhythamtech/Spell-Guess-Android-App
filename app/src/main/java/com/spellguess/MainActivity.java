package com.spellguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(TextView)findViewById(R.id.category1);
        c2=(TextView)findViewById(R.id.category2);
        c3=(TextView)findViewById(R.id.category3);
        c4=(TextView)findViewById(R.id.category4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   passiton(0);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passiton(1);

            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passiton(2);

            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passiton(3);

            }
        });

    }

    public void passiton(int i)
    {
        Intent intent =new Intent(this,QuizScr.class);
        intent.putExtra("index",i);
        startActivity(intent);

    }
}