package com.e.uts_aplikasi_krs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText Usertxt,Passtxt;
    Button btnLogin;
    Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Usertxt = (EditText) findViewById(R.id.Usertxt);
        Passtxt = (EditText) findViewById(R.id.Passtxt);


        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener()

      



        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Admin.class);
                startActivity(intent);

                String usernamekey = Usertxt.getText().toString();
                String passwordkey = Passtxt.getText().toString();

                if (usernamekey.equals("admin/dosen") && passwordkey.equals("123"))

                {
                    Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                   //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password salah")
                            .setNegativeButton("Retry",null).create().show();




                }
            }
        });




    }
}