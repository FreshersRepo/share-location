package playlagom.sharelocation.auth;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import playlagom.sharelocation.DisplayActivity;
import playlagom.sharelocation.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnSignIn;
    EditText etLoginEmail, etLoginPassword;
    TextView tvSignUp;

    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;

    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null) {
            startActivity(new Intent(this, DisplayActivity.class));
            finish();
        }
        progressDialog = new ProgressDialog(this);

        etLoginEmail = findViewById(R.id.etLoginEmail);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        tvSignUp = findViewById(R.id.tvSignUp);

        btnSignIn.setOnClickListener(this);
        tvSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnSignIn) {
            loginUser();
        }
        if (v == tvSignUp) {
            startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            finish();
        }
    }

    private void loginUser() {
        // register user
        String email = etLoginEmail.getText().toString().trim();
        String password = etLoginPassword.getText().toString().trim();

        // Form validation part: Start
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_LONG).show();
            etLoginEmail.setError("Email is required");
            etLoginEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etLoginEmail.setError("Please enter a valid Email");
            etLoginEmail.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_LONG).show();
            etLoginPassword.setError("Password is required");
            etLoginPassword.requestFocus();
            return;
        }
        if (password.length() < 6) {
            Toast.makeText(this, "Invalid password", Toast.LENGTH_LONG).show();
            return;
        } // Form validation part: End

        progressDialog.setMessage("Login...");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Registration successful and move to next page
                    finish();
                    startActivity(new Intent(LoginActivity.this, DisplayActivity.class));
                    Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                } else {
                    progressDialog.dismiss();
                    if (counter > 3) {
                        finish();
                        Toast.makeText(LoginActivity.this, "Could not login. Try again later", Toast.LENGTH_LONG).show();
                    }
                    if (counter == 3) {
                        Toast.makeText(LoginActivity.this, "Invalid email or password.  Last chance", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid email or password.  " + (3 - counter) + " chance left", Toast.LENGTH_LONG).show();
                    }
                    counter++;
                }
            }
        });
    }
}
