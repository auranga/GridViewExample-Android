package com.alexurangareyes.gridviewexample.activity;

/**
 * Created by alexurangareyes on 5/6/17.
 */

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.alexurangareyes.gridviewexample.MyApplication;
import com.alexurangareyes.gridviewexample.R;


public class DetailActivity extends AppCompatActivity {

    private ActionBar actionBar;
    private MyApplication mApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mApp = ((MyApplication) getApplicationContext());

        actionBar = getSupportActionBar();

        Bundle bundle = getIntent().getExtras();

        int position = bundle.getInt("numComp");

        setTitle(mApp.getNamesIds()[position]);


        RelativeLayout rl =  (RelativeLayout) findViewById(R.id.circleBackDetail);

        rl.setBackground(ContextCompat.getDrawable(this,mApp.getCircleIds()[position]));

        ImageView imageViewCom = (ImageView) findViewById(R.id.imageViewComDetail);

        imageViewCom.setImageResource(mApp.getThumbIds()[position]);

        /*Colores*/
        getWindow().setStatusBarColor(ContextCompat.getColor(this,mApp.getColorsDark()[position]));

        actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this,mApp.getColorsPrimary()[position])));

    }
}