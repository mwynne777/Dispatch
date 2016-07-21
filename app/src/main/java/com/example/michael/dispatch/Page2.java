package com.example.michael.dispatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Michael on 4/2/16.
 */
public class Page2 extends AppCompatActivity {

    //Button _next;
    ImageView _nxt, _back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        //_next = (Button) findViewById(R.id.next);
        _nxt = (ImageView) findViewById(R.id.nxt);
        _back = (ImageView) findViewById(R.id.back);

        _nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),Page5.class);
                startActivity(k);
            }
        });

        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),MainActivity.class);
                startActivity(k);
            }
        });


    }


}
