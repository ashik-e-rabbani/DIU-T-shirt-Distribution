package com.ashiksplanet.asheqerabbani.t_shirtdistribution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity {



    TextView c ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String id = getIntent().getStringExtra("message_key");
        c = findViewById(R.id.textViewInfo);
      c.setText(id);
    }

}
