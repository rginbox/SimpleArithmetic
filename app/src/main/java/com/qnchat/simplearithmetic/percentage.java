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

public class percentage extends AppCompatActivity {
    EditText E1,E2;
    Button B;
    TextView T1;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
        E1=(EditText) findViewById(R.id.E1);
        E2=(EditText) findViewById(R.id.E2);
        B=(Button) findViewById(R.id.B);
        T1=(TextView) findViewById(R.id.T);

        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((E1.getText().toString().equals(""))||(E2.getText().toString().equals(""))){
                    Toast.makeText(percentage.this, "Please enter some number", Toast.LENGTH_SHORT).show();

                }else {
                    String n1=E1.getText().toString();
                    float num1=Float.parseFloat(n1);
                    String n2=E2.getText().toString();
                    float num2=Float.parseFloat(n2);
                    float su=(num1*num2)/100;
                    T1.setText(Float.toString(su));
                    Toast.makeText(percentage.this, "percentage is", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
