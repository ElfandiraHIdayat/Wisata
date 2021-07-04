package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText edusername, edpass;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        edusername=findViewById(R.id.edusername);
        edpass=findViewById(R.id.edpass);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                nama = edusername.getText().toString();
                password = edpass.getText().toString();

                String email = "elfandirahidayat123";
                String password = "456123789";

                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext()
                            , "Email dan Password wajib diisi", Toast.LENGTH_LONG);
                    t.show();

                } else {
                    if (nama.equals(email) && password.equals(password)) {
                        Toast t = Toast.makeText(getApplicationContext()
                                , "WAS SUCCESSFUL", Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), MenuUtama.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Failed", Toast.LENGTH_LONG);
                    }
                }
            }
        });
    }
}