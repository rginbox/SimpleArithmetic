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

public class boat extends AppCompatActivity {
    EditText E1,E2,E3;
    Button B1,B2;
    TextView T1,T2;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat);
        E1=(EditText) findViewById(R.id.E1);
        E2=(EditText) findViewById(R.id.E2);
        E3=(EditText) findViewById(R.id.E3);
        B1=(Button) findViewById(R.id.B1);
        B2=(Button) findViewById(R.id.B2);
        T1=(TextView) findViewById(R.id.T1);
        T2=(TextView) findViewById(R.id.T2);
        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals("")||(E3.getText().toString().equals(""))||(E3.getText().toString().equals("")))) {
                    Toast.makeText(boat.this, "please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    String n1 = E1.getText().toString();
                    float num1 = Float.parseFloat(n1);
                    String n2 = E2.getText().toString();
                    float num2 = Float.parseFloat(n2);
                    String n3 = E3.getText().toString();
                    float num3 = Float.parseFloat(n3);
                    float su = num1 / (num2 + num3);
                    T1.setText(Float.toString(su));
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals("") || (E3.getText().toString().equals("")) || (E3.getText().toString().equals("")))) {
                    Toast.makeText(boat.this, "please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    String n1 = E1.getText().toString();
                    float num1 = Float.parseFloat(n1);
                    String n2 = E2.getText().toString();
                    float num2 = Float.parseFloat(n2);
                    String n3 = E3.getText().toString();
                    float num3 = Float.parseFloat(n3);
                    float su = num1 / (num2 - num3);
                    T2.setText(Float.toString(su));
                }
            }
        });

    }
}
