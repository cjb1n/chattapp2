package com.example.chattapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText etid, etpassword;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etid = (EditText) findViewById(R.id.etid);
        etpassword = (EditText)findViewById(R.id.etpassword);
        String stpassword = etpassword.getText().toString();

        Button btnlogin = (Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(MainActivity.this, chattactivity.class);
                startActivity(in);

            }
        });
        Button btnregister = (Button)findViewById(R.id.btnregister);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stemail = etid.getText().toString();
                String stpassword = etpassword.getText().toString();
                if (stemail.isEmpty()){
                    Toast.makeText(MainActivity.this, "please insert email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (stpassword.isEmpty()){
                    Toast.makeText(MainActivity.this, "please insert password", Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(MainActivity.this, "Email:"+stemail+",password:"+stpassword,Toast.LENGTH_LONG).show();

            }
        });
    }
}