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
import android.widget.Toolbar;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

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
    private AwesomeValidation awesomeValidation;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        mBtn.setOnClickListener(this);
        mForgot.setOnClickListener(this);
        mRegister.setOnClickListener(this);
        awesomeValidation.addValidation(this,R.id.Userin,"^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",R.string.invalid_name);
        String regexPassword = ".{8,}";
        awesomeValidation.addValidation(this, R.id.Passin, regexPassword, R.string.invalid_password);

    }

    @Override
    public void onClick(View v) {

        if (v == mRegister){
            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(intent);

        }
        if (v == mBtn){

            submitForm();


        }
        if (v == mForgot){

            Intent intent = new Intent(LoginActivity.this ,ForgotActivity.class);
            startActivity(intent);
            finish();


        }


    }

    private void submitForm() {
        if (awesomeValidation.validate()){
            Toast.makeText(this,"validation successful",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(intent);



        }
        else{
            Toast.makeText(this,"validation is not successful",Toast.LENGTH_SHORT).show();

        }
    }
}
