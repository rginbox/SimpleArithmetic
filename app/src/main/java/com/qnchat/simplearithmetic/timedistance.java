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

public class timedistance extends AppCompatActivity {
    EditText E1,E2;
    Button B1,B2,B3;
    TextView T1,T2,T3;
    float su;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timedistance);
        E1=(EditText) findViewById(R.id.E1);
        E2=(EditText) findViewById(R.id.E2);
        B1=(Button) findViewById(R.id.B1);
        B2=(Button) findViewById(R.id.B2);
        B3=(Button) findViewById(R.id.B3);
        T1=(TextView) findViewById(R.id.T1);
        T2=(TextView) findViewById(R.id.T2);
        T3=(TextView) findViewById(R.id.T3);
        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals(""))||(E2.getText().toString().equals(""))){
                    Toast.makeText(timedistance.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                String n=E1.getText().toString();
                float num1=Float.parseFloat(n);
                String n1=E2.getText().toString();
                float num2=Float.parseFloat(n1);
                 su=(num1*num2);
                 T1.setText(Float.toString(su));

            }}
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals(""))||(E2.getText().toString().equals(""))){
                    Toast.makeText(timedistance.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                String n=E1.getText().toString();
                float num1=Float.parseFloat(n);
                String n1=E2.getText().toString();
                float num2=Float.parseFloat(n1);
                float speed=su/num2;
                T2.setText(Float.toString(speed));

            }}
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals(""))||(E2.getText().toString().equals(""))){
                    Toast.makeText(timedistance.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    String n = E1.getText().toString();
                    float num1 = Float.parseFloat(n);
                    String n1 = E2.getText().toString();
                    float num2 = Float.parseFloat(n1);
                    float time = su / num1;
                    T3.setText(Float.toString(time));

                }


            }
        });
    }
}
