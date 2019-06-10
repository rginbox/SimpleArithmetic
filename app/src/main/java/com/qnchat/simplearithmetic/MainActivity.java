package com.qnchat.simplearithmetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    AdView mAdView,mAdView2,mAdView3,mAdView4;
    InterstitialAd mInterstitialAd,mInterstitialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        //intestial ads

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8240010191948180/1623609379");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd2 = new InterstitialAd(this);
        mInterstitialAd2.setAdUnitId("ca-app-pub-8240010191948180/1623609379");
        mInterstitialAd2.loadAd(new AdRequest.Builder().build());



        Button button1=(Button) findViewById(R.id.table);
        Button button2=(Button) findViewById(R.id.square);
        Button button3=(Button) findViewById(R.id.simpleintrest);
        Button button4=(Button) findViewById(R.id.cube);
        Button button5=(Button)findViewById(R.id.compoundi);
        Button button6=(Button) findViewById(R.id.lcmhcf);
        Button button7=(Button) findViewById(R.id.average);
        Button button8=(Button) findViewById(R.id.percentage);
        Button button9=(Button) findViewById(R.id.timework);
        Button button10=(Button)findViewById(R.id.timedistance);
        Button button11=(Button) findViewById(R.id.boatstream);
        Button button12=(Button) findViewById(R.id.profitloss);
        Button button13=(Button)  findViewById(R.id.herons);
        Button button14=(Button) findViewById(R.id.root);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent intent=new Intent(MainActivity.this,Table.class);
                    startActivity(intent);
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Square.class);
            startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Simplein.class);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,cube.class);
                startActivity(intent);
            }
        });
button5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,ci.class);
        startActivity(intent);

    }
});
button6.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (mInterstitialAd2.isLoaded()) {
            mInterstitialAd2.show();
        } else {

            Intent intent = new Intent(MainActivity.this, lcmhcf.class);
            startActivity(intent);
        }
    }
});
button7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,ave.class);
        startActivity(intent);
    }
});
button8.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,percentage.class);
        startActivity(intent);
    }
});
button9.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,time.class);
        startActivity(intent);
    }
});
button10.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,timedistance.class);
        startActivity(intent);
    }
});
button11.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,boat.class);
        startActivity(intent);
    }
});
button12.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,profit.class);
        startActivity(intent);
    }
});
button13.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,herons.class);
        startActivity(intent);
    }
});
button14.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,squrecuberoot.class);
        startActivity(intent);
    }
});


        MobileAds.initialize(this,"ca-app-pub-8240010191948180~8539413651");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);

        mAdView3 = findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        mAdView3.loadAd(adRequest3);

        mAdView4 = findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        mAdView4.loadAd(adRequest4);

        //ad event
        mInterstitialAd.setAdListener(new AdListener() {



            @Override
            public void onAdClosed() {

                Intent intent=new Intent(MainActivity.this,Table.class);
                startActivity(intent);

            }
        });

        mInterstitialAd2.setAdListener(new AdListener() {

            @Override
            public void onAdClosed() {

                Intent intent = new Intent(MainActivity.this, lcmhcf.class);
                startActivity(intent);

            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about) {
            // Handle the camera action
            Intent intent=new Intent(MainActivity.this,view.class);
            intent.putExtra("value","file:///android_asset/about.html");
            startActivity(intent);
        } else if (id == R.id.use) {

            Intent i=new Intent(MainActivity.this,view.class);
            i.putExtra("value","file:android_asset/howto.html");
            startActivity(i);

        } else if (id == R.id.nav_share) {

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
            String shareMessage= "\ninstall this app solve simple arithemetic problem easly\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "choose one"));


        } else if (id == R.id.nav_send) {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "rg4938406@gmail.com"});
            email.putExtra(Intent.EXTRA_SUBJECT, "feedback");
            email.putExtra(Intent.EXTRA_TEXT, "send your message");

//need this to prompts email client only
            email.setType("message/rfc822");

            startActivity(Intent.createChooser(email, "Choose an Email client :"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
