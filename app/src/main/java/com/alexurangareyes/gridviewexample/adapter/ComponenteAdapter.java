package com.alexurangareyes.gridviewexample.adapter;

/**
 * Created by alexurangareyes on 5/6/17.
 */

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alexurangareyes.gridviewexample.MyApplication;
import com.alexurangareyes.gridviewexample.R;

public class ComponenteAdapter extends BaseAdapter {
    private Context mContext;
    private Resources res;
    private String[] mTitulosIds;
    public MyApplication mApp;

    // Constructor
    public ComponenteAdapter(Context context,MyApplication app){
        this.mContext = context;
        //res = mContext.getResources();
        this.mApp = app;
        mTitulosIds = mApp.getNamesIds();
        //mApp = ((MyApplication)mContext);

    }

    public int getCount() {
        return mApp.getThumbIds().length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.componente_item, null);
        }

        RelativeLayout rl = (RelativeLayout) convertView.findViewById(R.id.circleBack);
        rl.setBackground(ContextCompat.getDrawable(mContext,mApp.getCircleIds()[position]));

        ImageView imageView = (ImageView) convertView.findViewById(R.id.Image_Componente);

        //imageView.setImageResource(mThumbIds[position]);
        imageView.setImageResource(mApp.getThumbIds()[position]);


        TextView textNom = (TextView) convertView.findViewById(R.id.TextView_Com);
        textNom.setText(mTitulosIds[position]);

        return convertView;
    }





}
