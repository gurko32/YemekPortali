package com.portali.yemek.yemekportali;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void loginAttempt(View view) {
        EditText username2= (EditText)findViewById(R.id.user_name);
        EditText password2= (EditText)findViewById(R.id.user_password);
        TextView error_box= (TextView)findViewById(R.id.error_box);

        String username=username2.getText().toString();
        String password=password2.getText().toString();


        String type="login";

        OnlineConnection onlineConnection=new OnlineConnection(this);
        onlineConnection.execute(type,username,password);

    }

    public void register(View view) {
        Intent intent =new Intent(this,RegisterActivity.class);
        startActivity(intent);

    }
}