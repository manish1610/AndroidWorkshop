package com.example.androidworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText phoneNo;
    Button buSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        phoneNo=findViewById(R.id.phoneNo);
        buSubmit=findViewById(R.id.buSubmit);


        buSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile= phoneNo.getText().toString();

                Intent intent=new Intent(getApplicationContext(),VerifyPhoneActivity.class);
                intent.putExtra("phoneNo",mobile);
                startActivity(intent);
                finish();


            }
        });




    }
}