package com.example.test.testapp;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by c-kasgus on 2017-12-18.
 */

public class Utils {
    public static Bitmap getBitmapFromAsset(String actorId, AssetManager assetManager) {
        InputStream stream = null;
        try {
            stream = assetManager.open(actorId + ".jpg");
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
