package com.example.mysport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.my) TextView  mMy;
    @BindView(R.id.sports) TextView mSports;
    @BindView(R.id.football) ImageView mBall;
    @BindView(R.id.sighn) TextView  mSighn;
    @BindView(R.id.Userin) EditText mUser;
    @BindView(R.id.Passin) EditText mPass;
    @BindView(R.id.Btn2) Button mBtn;
    @BindView(R.id.Forgot) TextView  mForgot;
    @BindView(R.id.Register) TextView  mRegister;
    @BindView(R.id.facebook) ImageView mFacebook;
    @BindView(R.id.twitter) ImageView mTwitter;
    @BindView(R.id.google)  ImageView mGoogle;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mBtn.setOnClickListener(this);
        mForgot.setOnClickListener(this);
        mRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == mRegister){
            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(intent);

        }
        if (v == mBtn){
            Intent intent = new Intent(LoginActivity.this,HomeActivity.class);

            Toast.makeText(LoginActivity.this,"Login succesfull",Toast.LENGTH_LONG).show();

            startActivity(intent);


        }
        if (v == mForgot){

            Intent intent = new Intent(LoginActivity.this ,ForgotActivity.class);
            startActivity(intent);
            finish();


        }


    }
}
