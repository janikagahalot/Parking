package com.housing.qrcodetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by janikagahalot on 30/06/15.
 */
public class floor_plan extends Activity {

    @Override
public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_activity);
        TextView tv1=(TextView)findViewById(R.id.textView);

    }
}
