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

public class herons extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    TextView t1;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herons);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);
        b1=(Button) findViewById(R.id.b1);
        t1=(TextView) findViewById(R.id.t1);

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((e1.getText().toString().equals("")||(e2.getText().toString().equals(""))||(e3.getText().toString().equals("")))) {
                    Toast.makeText(herons.this, "please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    String n1 = e1.getText().toString();
                    double num1 = Double.parseDouble(n1);
                    String n2 = e2.getText().toString();
                    double num2 = Double.parseDouble(n2);
                    String n3 = e3.getText().toString();
                    double num3 = Double.parseDouble(n3);
                    double su = (num1 + num2 + num3) / 2;
                    double ar = su * (su - num1) * (su - num2) * (su - num3);
                    double area = Math.sqrt(ar);
                    t1.setText(Double.toString(area));

                }


            }
        });
    }
}
