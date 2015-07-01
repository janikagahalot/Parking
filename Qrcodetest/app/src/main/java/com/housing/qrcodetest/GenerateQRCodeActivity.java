package com.housing.qrcodetest;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GenerateQRCodeActivity extends Activity {

    private String LOG_TAG = "GenerateQRCode";
    String name="Janika";
    String email="gahalotjanika@gmail.com";
    String parking_slot="Ls123";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int width = point.x;
        int height = point.y;
        int smallerDimension = width < height ? width : height;
        smallerDimension = smallerDimension * 3/4;

        QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(name,
                null,
                Contents.Type.TEXT,
                BarcodeFormat.QR_CODE.toString(),
                smallerDimension);
        try {
            Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();
            ImageView myImage = (ImageView) findViewById(R.id.imageView1);
            myImage.setImageBitmap(bitmap);

        } catch (WriterException e) {
            e.printStackTrace();
        }
        TextView parking_id =(TextView) findViewById(R.id.parkingId);
        parking_id.setText("Parking Slot: " + parking_slot);
     Button yes_im_in=(Button) findViewById(R.id.amIn);
        yes_im_in.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i= new Intent(getApplicationContext(),floor_plan.class);

                startActivity(i);

            }
        });

        Button exit=(Button)findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent exitActivity=new Intent(getApplicationContext(), exit_activity.class);
                startActivity(exitActivity);
            }
        });
        Button report=(Button) findViewById(R.id.report);
        report.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent reportActivity= new Intent(getApplicationContext(), report_file.class);
                startActivity(reportActivity);
            }
        });


    }



}