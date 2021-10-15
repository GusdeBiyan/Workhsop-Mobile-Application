package com.gusde.intenimplicitexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    private Button btn_move,btn_share ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //insialisasi
        btn_move = findViewById(R.id.btn_move);
        btn_share = findViewById(R.id.btn_share);


        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(a);
            }
        });

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent();
                b.setAction(Intent.ACTION_SEND);
                b.putExtra(Intent.EXTRA_TEXT,"https://youtu.be/yriKZJUYQmg");
                b.setType("text/plain");
                startActivity(b);
            }
        });




    }
}