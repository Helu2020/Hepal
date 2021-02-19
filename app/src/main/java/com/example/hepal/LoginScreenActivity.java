package com.example.hepal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginScreenActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText email;
    private EditText pass;
   /* private Button loginButton;
    private Button registerButton;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        email = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextTextPassword);
      /*   loginButton = findViewById(R.id.loginButton);
       loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickLogin(v);
            }
        });
        registerButton = findViewById(R.id.button2);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickRegistrar(v);
            }
        });

        */
        mAuth = FirebaseAuth.getInstance();

    }


    public void clickLogin(View view) {
        try{
            mAuth.signInWithEmailAndPassword(email.getText().toString(), pass.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d(TAG, "signInWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Toast.makeText(LoginScreenActivity.this, "-Me he comprado 100 palomas -¿Mensajeras? - No te exajero (acento andaluz)", Toast.LENGTH_SHORT).show();
                                //updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                //Log.w(TAG, "signInWithEmail:failure", task.getException());
                                Toast.makeText(LoginScreenActivity.this, "Autenticación fallida",
                                        Toast.LENGTH_SHORT).show();
                                //updateUI(null);
                            }

                            // ...
                        }
                    });
        } catch( Exception e){
            Log.getStackTraceString(e);
            e.printStackTrace();
        }

    }

    public void clickRegistrar(View view){
        if(email.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){

            mAuth.createUserWithEmailAndPassword(email.getText().toString(), pass.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Toast.makeText(LoginScreenActivity.this, "-Me he comprado 100 palomas -¿Mensajeras? - No te exajero (acento andaluz)", Toast.LENGTH_SHORT).show();

                            } else {
                                // If sign in fails, display a message to the user.
                                //Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(LoginScreenActivity.this, "Registro fallido.",
                                        Toast.LENGTH_SHORT).show();

                            }

                            // ...
                        }
                    });



        } else {
            // TODO: agregar dialogo
            Toast.makeText(this, "Rellena los campos, vago de mierda", Toast.LENGTH_SHORT).show();
        }
    }
}