package com.example.roadieinder.inder7;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class Start extends AppCompatActivity {

    void toastmsg(String msg){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
}
 static String s ;
    EditText e;
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        e=(EditText)findViewById(R.id.name);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button3);
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i= new Intent(getApplicationContext(),Main7Activity.class);
                 startActivity(i);

             }
         });

        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                s=e.getText().toString();
             if(s.isEmpty()) {
                 toastmsg("Enter Name First");
             }
             else{
                 Intent i = new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(i);

             }
            }

        });
    }
}

