package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.button);
        User myUser = new User();
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (follow == true){
                    myButton.setText("Follow");
                }
                else{
                    myButton.setText("Unfollow");
                }
            }
        });
        MyText.OnClick( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(myIntent);
            }
        });
    }
}