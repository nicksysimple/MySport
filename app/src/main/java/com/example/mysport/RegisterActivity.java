package com.example.mysport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        mBtn.setOnClickListener(this);
        mLOgin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if ( v == mLOgin){

            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);

            startActivity(intent);

        }
        if (v == mBtn){


            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
            Toast.makeText(RegisterActivity.this,"Account Created Successfully",Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish();
        }

    }
}
