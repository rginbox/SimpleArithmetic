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

public class Table extends AppCompatActivity {
    EditText e;
    Button b;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        e = (EditText) findViewById(R.id.edit6);
        b = (Button) findViewById(R.id.b1);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        t6 = (TextView) findViewById(R.id.t6);
        t7 = (TextView) findViewById(R.id.t7);
        t8 = (TextView) findViewById(R.id.t8);
        t9 = (TextView) findViewById(R.id.t9);
        t10 = (TextView) findViewById(R.id.t10);
        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e.getText().toString().equals("")) {
                    Toast.makeText(Table.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
               else {
                String num = e.getText().toString();
                int num1 = Integer.parseInt(num);

                    t1.setText(Integer.toString(num1 * 1));
                    t2.setText(Integer.toString(num1 * 2));
                    t3.setText(Integer.toString(num1 * 3));
                    t4.setText(Integer.toString(num1 * 4));
                    t5.setText(Integer.toString(num1 * 5));
                    t6.setText(Integer.toString(num1 * 6));
                    t7.setText(Integer.toString(num1 * 7));
                    t8.setText(Integer.toString(num1 * 8));
                    t9.setText(Integer.toString(num1 * 9));
                    t10.setText(Integer.toString(num1 * 10));
                }
            }
        });
    }
}
