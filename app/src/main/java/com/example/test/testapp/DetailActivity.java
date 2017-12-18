package com.example.test.testapp;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.testapp.objects.Actor;

import static com.example.test.testapp.MyBackend.actorMap;
import static com.example.test.testapp.Utils.getBitmapFromAsset;

/**
 * Created by c-kasgus on 2017-12-18.
 */

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String actorId = getIntent().getStringExtra(MainActivity.ACTOR_ID);
        Actor actor = actorMap.get(actorId);

        TextView nameText = (TextView) findViewById(R.id.nameText);
        nameText.setText(actor.getName());

        TextView movieText = (TextView) findViewById(R.id.movieText);
        movieText.setText(actor.getMovies().toString());

        TextView descriptionText = (TextView) findViewById(R.id.descriptionText);
        descriptionText.setText(actor.getDescription());

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        AssetManager assetManager = getAssets();
        Bitmap bitmap = getBitmapFromAsset(actor.getId(), assetManager);
        iv.setImageBitmap(bitmap);
    }
}
