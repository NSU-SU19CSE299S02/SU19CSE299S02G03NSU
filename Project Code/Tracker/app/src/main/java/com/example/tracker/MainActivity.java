package com.example.tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Registration_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registration_Button=(Button) findViewById(R.id.Registration_Button);
        Registration_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistration_Page();
            }
        });
    }
    public void openRegistration_Page(){
        Intent intent = new Intent(this, Registration_Page.class);
        startActivity(intent);
    }
}
