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

public class ci extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b,b2;
    TextView t,t2;
double pri,tem3;

AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ci);
        e1=(EditText) findViewById(R.id.edit3);
        e2=(EditText) findViewById(R.id.edit4);
        e3=(EditText) findViewById(R.id.edit5);
        b=(Button) findViewById(R.id.button2);
        b2=(Button) findViewById(R.id.button3);
        t=(TextView) findViewById(R.id.text2);
        t2=(TextView) findViewById(R.id.text3) ;

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
      b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (e1.getText().toString().equals("")||e2.getText().toString().equals("")||e3.getText().toString().equals(""))
              {
                  Toast.makeText(ci.this, "Please enter a number", Toast.LENGTH_SHORT).show();
              }
              else {
                  String n1 = e1.getText().toString();
                  pri = Double.parseDouble(n1);
                  String n2 = e2.getText().toString();
                  double rate = Double.parseDouble(n2);
                  String n3 = e3.getText().toString();
                  double time = Double.parseDouble(n3);
                  double tem = 1 + (rate / 100);
                  double tem2 = Math.pow(tem, time);
                  tem3 = pri * tem2;
                  t.setText(Double.toString(tem3));
              }
          }
      });
      b2.setOnClickListener(new View.OnClickListener() {
          @Override

          public void onClick(View view) {
              if (e1.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("")) {
                  Toast.makeText(ci.this, "Please enter a number", Toast.LENGTH_SHORT).show();
              } else {
                  double tem4 = tem3 + pri;
                  t2.setText(Double.toString(tem4));
              }
          }
      });

    }
}
