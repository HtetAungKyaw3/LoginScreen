package com.example.loginscreen;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("htetaungkyaw@gmail.com") &&  password.getText().toString().equals("12345")){
                    Toast.makeText(MainActivity.this, "Login Successful!",Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio?gclid=CjwKCAjw-IWkBhBTEiwA2exyOyX4m9WXpHw2Bs2hElz7GOm47MFWt2maurlG2r252f4MUQFKSAxhuhoCaeUQAvD_BwE&gclsrc=aw.ds"));
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}