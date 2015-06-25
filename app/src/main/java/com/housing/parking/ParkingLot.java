package com.housing.parking;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.LinearLayout;

/**
 * Created by ankitjain on 25/06/15.
 */
public class ParkingLot extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.parking_lot);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));

        Bitmap bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bg);
        int h = canvas.getHeight();
        int w = canvas.getWidth();
        canvas.drawRect(0, 0, w-50, h-50, paint);
        LinearLayout ll = (LinearLayout) findViewById(R.id.rect);
        ll.setBackgroundDrawable(new BitmapDrawable(bg));
    }

}
