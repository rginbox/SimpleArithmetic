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

public class Simplein extends AppCompatActivity {
EditText e1,e2,e3;
Button b;
TextView t;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplein);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);
        b=(Button)findViewById(R.id.B4);
        t=(TextView)findViewById(R.id.T5);

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("")||e2.getText().toString().equals("")||e3.getText().toString().equals(""))
                {
                    Toast.makeText(Simplein.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
else {
                    String n1 = e1.getText().toString();
                    float num1 = Float.parseFloat(n1);
                    String n2 = e2.getText().toString();
                    float num2 = Float.parseFloat(n2);
                    String n3 = e3.getText().toString();
                    float num3 = Float.parseFloat(n3);
                    float su = (num1 * num2 * num3) / 100;
                    t.setText(Float.toString(su));
                }
       }
        });

    }
}
