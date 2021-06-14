package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;
    ImageView image;
    int num = 1;
    int score = 0;
    TextView text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        image = findViewById(R.id.imageView);
        image.setImageResource(R.drawable.habana);
        text = (TextView)findViewById(R.id.mytext);


    }

    public void btn1(View view) {

        if (num == 1){
            image.setImageResource(R.drawable.jeff);
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            num = num+1;
            score = score + 10;

        }
        else if (num == 2) {
            image.setImageResource(R.drawable.kante);
            Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show();
            num = num+1;
        }

         else if(num == 3){
            // image.setImageResource(R.drawable.kante);
             Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show();
            num = num+1;
            text.setText("YOU HAVE "+score+" POINTS" );
            }


        }



    public void btn2(View view) {
        if (num == 1) {
            image.setImageResource(R.drawable.jeff);
            Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show();
            num = num+1;
        }

         else if (num == 2) {
            image.setImageResource(R.drawable.kante);
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            num = num+1;
            score = score + 10;
         }

         else if (num == 3){
        //    image.setImageResource(R.drawable.jeff);
            Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show();
            num = num+1;
            score = score + 10;
            text.setText("YOU HAVE "+score+" POINTS" );

        }
    }

    public void btn3(View view) {
        if (num == 1){
            image.setImageResource(R.drawable.jeff);
            Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show();
            num = num+1;
        }
        else if(num == 2)
        {
            image.setImageResource(R.drawable.kante);
            Toast.makeText(this, "incorrect", Toast.LENGTH_SHORT).show();
            num = num+1;
        }
        else if (num == 3) {
            Toast.makeText(this, "corrrect", Toast.LENGTH_SHORT).show();
            num = num+1;
            text.setText("YOU HAVE "+score+" POINTS" );


        }
        }
    }
