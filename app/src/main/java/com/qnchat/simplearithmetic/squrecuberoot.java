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

public class squrecuberoot extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    TextView t1,t2;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squrecuberoot);
        e1=(EditText) findViewById(R.id.e1);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("")){
                    Toast.makeText(squrecuberoot.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    String n = e1.getText().toString();
                    double num1 = Double.parseDouble(n);
                    double surt = Math.sqrt(num1);
                    t1.setText(Double.toString(surt));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("")){
                    Toast.makeText(squrecuberoot.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    String n = e1.getText().toString();
                    double num1 = Double.parseDouble(n);
                    Double surt = Math.cbrt(num1);
                    t2.setText(Double.toString(surt));
                }
            }
        });
    }
}
