package com.alexurangareyes.gridviewexample;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/**
 * Created by alexurangareyes on 5/6/17.
 */

public class MyApplication extends Application {

    private static Context mContext;
    private Resources res;

    private Integer[] mCircleIds = {
            R.drawable.circle_enc_1, R.drawable.circle_enc_2,
            R.drawable.circle_enc_3, R.drawable.circle_enc_4,
            R.drawable.circle_enc_5, R.drawable.circle_enc_6,
            R.drawable.circle_enc_7, R.drawable.circle_enc_8
    };

    private Integer[] mThumbIds = {
            R.drawable.encuesta_1, R.drawable.encuesta_2,
            R.drawable.encuesta_3, R.drawable.encuesta_4,
            R.drawable.encuesta_5, R.drawable.encuesta_6,
            R.drawable.encuesta_7, R.drawable.encuesta_8
    };

    private String[] mTitulosIds;

    private Integer[] colorsPrimary = {
            R.color.enc_1, R.color.enc_2,
            R.color.enc_3, R.color.enc_4,
            R.color.enc_5, R.color.enc_6,
            R.color.enc_7, R.color.enc_8
    };

    private Integer[] colorsDark = {
            R.color.enc_1_1, R.color.enc_2_2,
            R.color.enc_3_3, R.color.enc_4_4,
            R.color.enc_5_5, R.color.enc_6_6,
            R.color.enc_7_7, R.color.enc_8_8
    };


    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.mContext = getApplicationContext();
        res = mContext.getResources();
        mTitulosIds = res.getStringArray(R.array.componentes_array);
    }


    public Integer[] getCircleIds() {
        return mCircleIds;
    }

    public Integer[] getThumbIds() {
        return mThumbIds;
    }

    public String[] getNamesIds() {
        return mTitulosIds;
    }

    public Integer[] getColorsPrimary() {
        return colorsPrimary;
    }

    public Integer[] getColorsDark() {
        return colorsDark;
    }

}
