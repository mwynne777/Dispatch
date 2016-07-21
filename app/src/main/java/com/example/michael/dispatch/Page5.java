

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
public class Page5 extends AppCompatActivity {

    ImageView _next,_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page5);

        _next = (ImageView) findViewById(R.id.nxt);
        _back = (ImageView) findViewById(R.id.back);

        _next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),Page3.class);
                startActivity(k);
            }
        });

        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(getBaseContext(),Page2.class);
                startActivity(k);
            }
        });

    }


}