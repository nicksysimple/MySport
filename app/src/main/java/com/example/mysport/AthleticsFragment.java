package com.example.mysport;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AthleticsFragment extends Fragment implements View.OnClickListener {

    private View mView;
    private  Button Btn1,Btn2;
    private ImageView img;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        mView = inflater.inflate(R.layout.fragament_athletics,container,false);

        Btn1 = (Button)mView.findViewById(R.id.Event);
        Btn2 = (Button)mView.findViewById(R.id.race);
        img  = (ImageView) mView.findViewById(R.id.back);

        Btn1.setOnClickListener(this);
        Btn2.setOnClickListener(this);
        img.setOnClickListener(this);

        return mView;
    }

    @Override
    public void onClick(View v) {

        if (v == Btn1){

            Toast.makeText(getActivity(),"Confirmation Email Have been sent to Your Email",Toast.LENGTH_LONG).show();
            homeFragment nextFrag= new homeFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                    .addToBackStack(null)
                    .commit();

        }
        if (v == Btn2){


            Toast.makeText(getActivity(),"Confirmation Email Have been sent to Your Email",Toast.LENGTH_LONG).show();
            homeFragment nextFrag= new homeFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                    .addToBackStack(null)
                    .commit();

        }
        if (v == img ){
            homeFragment nextFrag= new homeFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, nextFrag, "findThisFragment")
                    .addToBackStack(null)
                    .commit();

        }

    }
}
