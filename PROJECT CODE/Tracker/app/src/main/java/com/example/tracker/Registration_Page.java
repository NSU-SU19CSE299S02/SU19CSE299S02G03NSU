package com.example.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration_Page extends AppCompatActivity {
    private Button LoginPage_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__page);

        LoginPage_Button = (Button) findViewById(R.id.LoginPage_Button);
        LoginPage_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin_Page();
            }
        });
    }
    public void openLogin_Page(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
