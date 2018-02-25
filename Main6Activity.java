package com.example.roadieinder.inder7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    private demo d=new demo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button b1=(Button)findViewById(R.id.button2);
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.setText("Your Final Score is "+ demo.mscore+"/5");

b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Main6Activity.this,MainActivity.class);
        startActivity(i);
        d.mscore=0;
    }
});
    }
}
