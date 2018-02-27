package com.example.roadieinder.inder7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    private demo d=new demo();
   int ab ,de ,score;
   float cd ;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button b1=(Button)findViewById(R.id.button2);
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.setText("Your Final Score is "+ demo.mscore+"/5");
        score=demo.mscore ;
        ab=5-score;
        cd=d.percentage;
        de=5 ;
        score(Start.s,demo.mscore,ab,score,cd,de);

b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Main6Activity.this,Start.class);
        startActivity(i);
        demo.mscore =0;
        d.percentage=0;
    }
});
    }

    void score(String name ,int a,int b,int c,float d,int e){
        try{

            SQLiteDatabase db = this.openOrCreateDatabase("inder",MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS Scores(name VARCHAR,correct_ans INT ,in_ans INT,Score INT,Percentage DECIMAL,Total INT)");
            db.execSQL("INSERT INTO Scores(name ,correct_ans,in_ans,Score,Percentage,Total)VAlUES ('"+name+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')");

        }catch (Exception n){
            n.printStackTrace();
        }
    }
}
