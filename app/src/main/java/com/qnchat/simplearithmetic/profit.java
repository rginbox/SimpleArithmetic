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

public class profit extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    TextView t1,t2;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
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
                if ((e1.getText().toString().equals("")||(e2.getText().toString().equals(""))) ){

                }else {
                    String n1 = e1.getText().toString();
                    float num1 = Float.parseFloat(n1);
                    String n2 = e2.getText().toString();
                    float num2 = Float.parseFloat(n2);
                    float su = (num1 - num2) / num2;
                    t1.setText(Float.toString(su));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((e1.getText().toString().equals("") || (e2.getText().toString().equals("")))) {
                    Toast.makeText(profit.this, "please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    String n1 = e1.getText().toString();
                    float num1 = Float.parseFloat(n1);
                    String n2 = e2.getText().toString();
                    float num2 = Float.parseFloat(n2);
                    float sum = (num1 + num2) / num2;
                    t2.setText(Float.toString(sum));

                }
            }
        });
    }
}
