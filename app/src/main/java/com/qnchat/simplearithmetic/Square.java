package com.qnchat.simplearithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Square extends AppCompatActivity {
Button b;
EditText e;
TextView t;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        b=(Button)findViewById(R.id.button);
        e=(EditText) findViewById(R.id.Edit1);
        t=(TextView)  findViewById(R.id.textview);

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e.getText().toString().equals("")) {
                    Toast.makeText(Square.this, "please enter some number", Toast.LENGTH_SHORT).show();
                } else {
                    String n = e.getText().toString();
                    int num = Integer.parseInt(n);
                    int s = num * num;
                    t.setText(Integer.toString(s));
                    Toast.makeText(Square.this, "square is " + Integer.toString(s), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
