package com.example.test.testapp;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.testapp.objects.Actor;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.example.test.testapp.Utils.getBitmapFromAsset;

/**
 * Created by c-kasgus on 2017-12-15.
 */

public class ActorListAdapter extends ArrayAdapter<Actor> {

    private List<Actor> actors;

    public ActorListAdapter(Context context, int resource, List<Actor> actors){
        super(context, resource, actors);
        this.actors = actors;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.actor_list_item, parent, false);
        }
        Actor actor = actors.get(position);

        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView);
        AssetManager assetManager = getContext().getAssets();
        Bitmap bitmap = getBitmapFromAsset(actor.getId(), assetManager);
        iv.setImageBitmap(bitmap);

        TextView nameText = (TextView) convertView.findViewById(R.id.nameText);
        nameText.setText(actor.getName());

        TextView movieText = (TextView) convertView.findViewById(R.id.movieText);
        movieText.setText(actor.getMovies().toString());

        return convertView;
    }
}
