package com.example.a403.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    Switch switch1;
    RadioGroup group;
    RadioButton button1,button2,button3;
    Button quit,return1;
    ImageView image;
    LinearLayout l1;
    Image dog,cat,bunny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.textView);
        text2=(TextView)findViewById(R.id.textView2);
        switch1=(Switch)findViewById(R.id.switch1);
        group=(RadioGroup)findViewById(R.id.radioGroup1);
        button1=(RadioButton)findViewById(R.id.radioButton);
        button2=(RadioButton)findViewById(R.id.radioButton2);
        button3=(RadioButton)findViewById(R.id.radioButton3);
        quit=(Button)findViewById(R.id.button);
        return1=(Button)findViewById(R.id.button2);
        image=(ImageView)findViewById(R.id.imageView);
        l1=(LinearLayout)findViewById(R.id.linear);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b) {
                    l1.setVisibility(View.VISIBLE);
                }
                else{
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });
        button1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                image.setImageResource(R.drawable.dog);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.cat);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.bunny);
            }
        });



        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch1.setChecked(false);
            }
        });
    }
}
