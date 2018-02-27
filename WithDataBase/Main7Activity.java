package com.example.roadieinder.inder7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    ListView list;
    ArrayList<String> inder;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        list=(ListView)findViewById(R.id.list);
        scoreList();


    }
    void scoreList(){
        inder=new ArrayList<>();
        try{
            SQLiteDatabase db=this.openOrCreateDatabase("inder",MODE_PRIVATE,null);
            Cursor c=db.rawQuery("SELECT * from Scores",null);
            c.moveToFirst();
            int a=c.getColumnIndex("name");
            int b=c.getColumnIndex("correct_ans");
            int f=c.getColumnIndex("in_ans");
            int d=c.getColumnIndex("Score");
            int e=c.getColumnIndex("Percentage");
            int g=c.getColumnIndex("Total");
             while (c!=null){
                 inder.add("\n\n" +c.getString(a));
                 inder.add("\nCorrect:          "+c.getString(b)+"\nIncorrect:       "+c.getString(f)+"\nScore:             "+c.getString(d)+"\nPercentage:   "+c.getString(e)+"%"+"\nTotal ques:     "+c.getString(g));
                 c.moveToNext();


             }


        }
        catch (Exception z){
            z.printStackTrace();
        }
        finally {
            adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,inder);
            list.setAdapter((ListAdapter) adapter);
        }


    }

}
