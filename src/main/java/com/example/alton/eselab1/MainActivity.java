package com.example.alton.eselab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    Button b;
    ImageView i;
    int bigText=30;
    int smallText=20;
    int bigTextColor=0;
    int smallTextColor=0;

    public void changeFont(View v)
    {

        if(bigText==70)
        {
            bigText=30;
        }
        if(smallText==60)
        {
            smallText=20;
        }
        bigText=bigText+10;
        smallText=smallText+10;
        t1.setTextSize(bigText);
        t2.setTextSize(smallText);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        b=(Button) findViewById(R.id.button2);
        i=(ImageView) findViewById(R.id.imageView);
        t1.setTextSize(30);
        t2.setTextSize(20);
        t1.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);
        t2.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);
        t1.setTextColor(Color.BLACK);
        t2.setTextColor(Color.BLACK);
        i.setImageResource(R.drawable.download1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigTextColor=bigTextColor+1;
                smallTextColor=smallTextColor+1;
                if(bigTextColor==5)
                {
                    bigTextColor=1;
                }
                switch (bigTextColor)
                {
                    case 1:
                        t1.setTextColor(Color.YELLOW);
                        break;
                    case 2:
                        t1.setTextColor(Color.BLUE);
                        break;
                    case 3:
                        t1.setTextColor(Color.RED);
                        break;
                    case 4:
                        t1.setTextColor(Color.rgb(255,20,147));
                        break;
                }
                if(smallTextColor==5)
                {
                    smallTextColor=1;
                }
                switch (bigTextColor)
                {
                    case 1:
                        t2.setTextColor(Color.YELLOW);
                        break;
                    case 2:
                        t2.setTextColor(Color.BLUE);
                        break;
                    case 3:
                        t2.setTextColor(Color.RED);
                        break;
                    case 4:
                        t2.setTextColor(Color.rgb(255,20,147));
                        break;
                }
            }
        });
    }
}
