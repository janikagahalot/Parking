package com.housing.parking;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by ankitjain on 25/06/15.
 */
public class ParkingLot extends ActionBarActivity implements View.OnTouchListener {
    int i,j;
    int count = 10;
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
        
        canvas.drawRect(0, 0, w, h, paint);
        for (j = 0 ; j < 2 ; j++) {

            for (i = 0; i < count; i = i + 2) {

                paint.setColor(Color.parseColor("#FFFFFF"));
                canvas.drawRect(j*100+50*j, 50 * i, (j+1)*100, 50 * (i + 1), paint);

                paint.setColor(Color.parseColor("#000000"));
                canvas.drawRect(j*100+50*j, 50 * (i + 1), (j+1)*100, 50 * (i + 2), paint);
            }
        }

        LinearLayout ll = (LinearLayout) findViewById(R.id.rect);
        ll.setOnTouchListener(this);
        ll.setBackgroundDrawable(new BitmapDrawable(bg));
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        Toast.makeText(this,"X = " + x + "Y = " + y,Toast.LENGTH_SHORT).show();

        return true;
    }
}
