package com.example.studentshub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Ensure this layout exists and is properly defined

        // Find the views after setting the content view
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbutton = findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check credentials
                if (username.getText().toString().equals("user") && password.getText().toString().equals("admin")) {
                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    // Intent to start MainActivity2
                    Intent intent = new Intent(Login.this, MainActivity2.class);
                    startActivity(intent);
                   finish(); // Optional: Close Login activity
                } else {
                    Toast.makeText(Login.this, "Login Failed - Username or Password is incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
