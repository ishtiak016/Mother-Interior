package com.example.motherinterior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p1 extends AppCompatActivity {
Button Comilla;
    String url;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        Comilla=(Button)findViewById(R.id.barura);
    }
    public void onClick(View v){

        if(v.getId()==R.id.barura){
           // url="project_details.php";
            Intent mainIntent=new Intent(p1.this,P2.class);
            //mainIntent.putExtra("message", url);
            startActivity(mainIntent);
        }
    }
}
