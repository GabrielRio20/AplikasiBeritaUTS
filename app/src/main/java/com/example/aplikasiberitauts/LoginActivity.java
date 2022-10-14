package com.example.aplikasiberitauts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText username;
    EditText var_password;
    Button var_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        username = findViewById(R.id.email);
        var_password = findViewById(R.id.password);
        var_login = findViewById(R.id.btn_login);

//        var_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showAlertDialog();
//            }
//        });

        var_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(username.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Isikan Username terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty((var_password.getText().toString()))){
                    Toast.makeText(getApplicationContext(), "Isikan Password terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }

                else if (username.getText().toString().equals("pakjoko") && var_password.getText().toString().equals("yangpentingcuan")){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), DetailDataActivity.class);
                    startActivity(intent);
                }

                else{
                    showAlertDialog();
                }
            }
        });
    }

    public void showAlertDialog(){
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(LoginActivity.this);
        alertBuilder.setTitle("Warning");
        alertBuilder.setMessage("Username/Password salah! Silahkan isi kembali");

        alertBuilder.setNeutralButton("Oke", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Oke", Toast.LENGTH_SHORT).show();
            }
        });

        alertBuilder.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}