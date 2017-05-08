package com.alexurangareyes.gridviewexample.activity;

/**
 * Created by alexurangareyes on 5/6/17.
 */

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.alexurangareyes.gridviewexample.MyApplication;
import com.alexurangareyes.gridviewexample.R;
import com.alexurangareyes.gridviewexample.adapter.ComponenteAdapter;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private MyApplication mApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mApp = ((MyApplication) getApplicationContext());

        intent = new Intent(MainActivity.this, DetailActivity.class);

        GridView gridview = (GridView) findViewById(R.id.GridView_Componentes);
        gridview.setAdapter(new ComponenteAdapter(this,mApp));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {

                DetailComponente(v, position);

            }
        });
    }

    public void DetailComponente(View v, int pos) {

        View relativeLayout = v.findViewById(R.id.circleBack);
        View imageView = v.findViewById(R.id.Image_Componente);

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                Pair.create(relativeLayout, relativeLayout.getTransitionName()),
                Pair.create(imageView, imageView.getTransitionName()));

        /*ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                Pair.create(relativeLayout, relativeLayout.getTransitionName()));*/


        intent.putExtra("numComp", pos);

        startActivity(intent, options.toBundle());

    }
}
