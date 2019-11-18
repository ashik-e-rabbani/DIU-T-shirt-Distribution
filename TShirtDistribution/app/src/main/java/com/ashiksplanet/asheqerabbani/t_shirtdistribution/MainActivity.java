package com.ashiksplanet.asheqerabbani.t_shirtdistribution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void checkIn(View view)
    {
        Intent Intent = new Intent(this, Main2Activity.class);
        startActivity(Intent);
    }

    public void checkOut(View view)
    {
        Intent Intent = new Intent(this, Main3Activity.class);
        startActivity(Intent);
    }


}
