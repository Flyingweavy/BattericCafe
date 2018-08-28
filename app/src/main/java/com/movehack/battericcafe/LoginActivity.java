package com.movehack.battericcafe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.movehack.battericcafe.R;

public class LoginActivity extends Activity {
    // User name
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Message
    private TextView tv_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialization
        et_Username = (EditText) findViewById(R.id.email);
        et_Password = (EditText) findViewById(R.id.password);
        Button bt_SignIn = (Button) findViewById(R.id.email_sign_in_button);


        bt_SignIn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());

                // Validates the User name and Password for admin, admin
                if (username.equals("admin") && password.equals("admin")) {
                    tv_Message.setText("Login Successful!");
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                }
            }
        });
    }


}