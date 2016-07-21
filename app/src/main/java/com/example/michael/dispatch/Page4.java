package com.example.michael.dispatch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Michael on 4/2/16.
 */
public class Page4 extends AppCompatActivity {

    Button _back;

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);

        _back = (Button) findViewById(R.id.back);

        _back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //goToUrl ( "https://www.google.com/maps/dir/41.47393,+-72.5292/41.677,-72.5084722/am=t/data=!3m1!4b1!4m7!4m6!1m3!2m2!1d-72.5292!2d41.63847!1m0!3e2");
                Intent k  = new Intent(getBaseContext(),MainActivity.class);
                startActivity(k);
            }
        });



    }


}


