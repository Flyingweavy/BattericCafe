package com.movehack.battericcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Users extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        Button viewShoppingCart = (Button) findViewById(R.id.evcs);
        viewShoppingCart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent viewShoppingCartIntent = new Intent(getBaseContext(),MapsActivity.class);
                startActivity(viewShoppingCartIntent);
            }
        });
        Button vo = (Button) findViewById(R.id.vo);
        vo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent viewShoppingCartIntent = new Intent(getBaseContext(), HomeActivity.class);
                startActivity(viewShoppingCartIntent);
            }
        });

    }
}
