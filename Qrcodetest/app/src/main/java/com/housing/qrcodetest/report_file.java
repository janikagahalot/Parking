package com.housing.qrcodetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by janikagahalot on 01/07/15.
 */
public class report_file extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.report_activity);

        Button submit=(Button)findViewById(R.id.submit_button);

    }

}
