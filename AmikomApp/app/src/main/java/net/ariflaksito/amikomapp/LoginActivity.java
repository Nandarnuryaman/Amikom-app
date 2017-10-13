package net.ariflaksito.amikomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usr = (EditText)findViewById(R.id.usr);
        final EditText pwd = (EditText)findViewById(R.id.pwd);
        Button login = (Button)findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.util.Log.d("--AmikomApp--", usr.getText().toString());
                android.util.Log.d("--AmikomApp--", pwd.getText().toString());

                if (isUserExists(usr.getText().toString(), pwd.getText().toString()))   {
                    Toast.makeText(getApplicationContext(),usr.getText().toString()+"Login Berhasil",
                            Toast.LENGTH_SHORT).show();
finish();
                } else Toast.makeText(getApplicationContext(),"Password salah",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }

    private boolean isUserExists(String username, String password) {
        return username.equals("Nandar") && password.equals("admin");
    }

}
