package com.example.mysport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.android.material.snackbar.Snackbar;

import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.Reg)
    TextView mReg;
    @BindView(R.id.User)
    EditText mUser;
    @BindView(R.id.Email)  EditText mEmail;
    @BindView(R.id.Pass)  EditText mPass;
    @BindView(R.id.Pass2)  EditText mPass2;
    @BindView(R.id.btn)
    Button mBtn;
    @BindView(R.id.Already)  TextView mAlready;
    @BindView(R.id.Login)  TextView mLOgin;
    @BindView(R.id.facebook)
    ImageView mFacebook;
    @BindView(R.id.twitter) ImageView mTwitter;
    @BindView(R.id.google) ImageView mGoodle;
    private AwesomeValidation awesomeValidation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        mBtn.setOnClickListener(this);
        mLOgin.setOnClickListener(this);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        awesomeValidation.addValidation(this,R.id.User,"^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",R.string.invalid_name);
        String regexPassword = ".{8,}";
        awesomeValidation.addValidation(this, R.id.Pass, regexPassword, R.string.invalid_password);
        awesomeValidation.addValidation(this, R.id.Pass2, regexPassword, R.string.invalid_confirm_password);
        awesomeValidation.addValidation(this, R.id.Pass, R.id.Pass2, R.string.invalid_confirm_password);
        awesomeValidation.addValidation(this,R.id.Email, Patterns.EMAIL_ADDRESS,R.string.invalid_email);





    }

    @Override
    public void onClick(View v) {

        if ( v == mLOgin){

            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);

            startActivity(intent);

        }
        if (v == mBtn){



            submitForm();
        }


    }

    private void submitForm() {

        if (awesomeValidation.validate()){
            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
            Toast.makeText(RegisterActivity.this,"Account Created Successfully",Toast.LENGTH_LONG).show();

            startActivity(intent);

        }
    }

}
