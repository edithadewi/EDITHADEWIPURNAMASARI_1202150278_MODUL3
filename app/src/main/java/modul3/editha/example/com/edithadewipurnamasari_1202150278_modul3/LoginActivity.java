package modul3.editha.example.com.edithadewipurnamasari_1202150278_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.txt_pwd);
        btnLogin = findViewById(R.id.signin);
    }

    public void showLogin(View view) {
        if (username.getText().toString().equalsIgnoreCase("ead") && password.getText().toString().equalsIgnoreCase("mobile")){
            Toast.makeText(this, "Selamat Datang", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username atau Password Anda Salah, Coba Lagi", Toast.LENGTH_LONG).show();
        }
    }
}


