package com.ashiksplanet.asheqerabbani.t_shirtdistribution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Main3Activity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    public  ZXingScannerView scannerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void scanCode(View view)
    {
        scannerView = new ZXingScannerView(getApplicationContext());


        setContentView(scannerView);
        scannerView.setResultHandler(this);
        scannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();

        scannerView.stopCamera();
    }


    @Override
    public void handleResult(com.google.zxing.Result result) {
        Toast.makeText(getApplicationContext(),result.getText(),Toast.LENGTH_LONG).show();
        scannerView.resumeCameraPreview(this);
    }
}
