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
public class Page3 extends AppCompatActivity {

        Button _notify;
    ImageView _back;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.page3);

            _notify = (Button) findViewById(R.id.notify);
            _back = (ImageView) findViewById(R.id.back);

            _back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k  = new Intent(getBaseContext(),Page5.class);
                    startActivity(k);
                }
            });

            _notify.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k  = new Intent(getBaseContext(),Page4.class);
                    startActivity(k);
                }
            });


        }


}

