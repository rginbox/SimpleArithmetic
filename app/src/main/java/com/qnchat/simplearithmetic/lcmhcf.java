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

public class lcmhcf extends AppCompatActivity {
Button B;
EditText E1,E2;
TextView T3,T4;
    int a,b,t,hcf,lcm;
    AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcmhcf);
        B=(Button) findViewById(R.id.B3);
        E1=(EditText) findViewById(R.id.E1);
        E2=(EditText) findViewById(R.id.E2);
        T3=(TextView) findViewById(R.id.T4);
        T4=(TextView) findViewById(R.id.T5);

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals(""))||(E2.getText().toString().equals("")))
                {
                    Toast.makeText(lcmhcf.this, "Please enter some number", Toast.LENGTH_SHORT).show();
                }else {

                    String n=E1.getText().toString();
                    int num1=Integer.parseInt(n);
                    String n2=E2.getText().toString();
                    int num2=Integer.parseInt(n2);

                    a=num1;
                    b=num2;
                    while(b!=0)
                    {
                        t = b;
                        b = a%b;
                        a = t;
                    }
                    hcf=a;
                    lcm=(num1*num2)/hcf;
                   T3.setText(Integer.toString(hcf));
                   T4.setText(Integer.toString(lcm));

                }
            }
        });
    }
}
