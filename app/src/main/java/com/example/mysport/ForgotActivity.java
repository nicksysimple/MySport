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

public class ForgotActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.emailText)
    TextView mTextEmail;

    @BindView(R.id.emailBtn)
    Button mButton;

    @BindView(R.id.emailEdit) EditText mEmailEdit;


    @BindView(R.id.my) TextView  mMy;
    @BindView(R.id.sports) TextView mSports;
    @BindView(R.id.football)
    ImageView mBall;

    @BindView(R.id.facebook) ImageView mFacebook;
    @BindView(R.id.twitter) ImageView mTwitter;
    @BindView(R.id.google)  ImageView mGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
        ButterKnife.bind(this);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mButton){

            Intent intent = new Intent(ForgotActivity.this,LoginActivity.class);
            Toast.makeText(ForgotActivity.this,"Recovery Details Have been sent to your Email",Toast.LENGTH_LONG).show();
             startActivity(intent);
        }

    }
}
