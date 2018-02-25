package com.example.roadieinder.inder7;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private demo d=new demo();
CountDownTimer timer;

public  void test()
{
    Intent i=new Intent(MainActivity.this,Main2Activity.class);
    startActivity(i);
}
    public void test1(){
        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
    }

    public void test2(){
        Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1 = (Button) findViewById(R.id.choice1);
        final Button b2 = (Button) findViewById(R.id.choice2);
        final Button b3 = (Button) findViewById(R.id.choice3);
        final Button b4= (Button)findViewById(R.id.choice4);
        final TextView t1 = (TextView) findViewById(R.id.score);

        final TextView t2=(TextView)findViewById(R.id.time);
        t1.setText(""+d.mscore+"/5");
        timer=new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millis) {
                t2.setText("seconds:"+(millis/1000));
            }

            @Override
            public void onFinish() {
              Intent i=new Intent(MainActivity.this,Main2Activity.class);
              startActivity(i);
            }
        }.start();


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                t1.setText("" + d.mscore + "/5");
                        test1();
                        test();
                        timer.cancel();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                d.mscore=d.mscore+1;
                   t1.setText(""+d.mscore+"/5");
                   test2();
                    test();
                    timer.cancel();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                t1.setText(""+d.mscore+"/5");
                    test1();
              test();
              timer.cancel();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                t1.setText(""+d.mscore+"/5");
                test1();
                test();
                timer.cancel();

            }
        });

    }
}
