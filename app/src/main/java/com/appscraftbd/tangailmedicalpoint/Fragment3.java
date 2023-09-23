package com.appscraftbd.tangailmedicalpoint;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment3 extends Fragment {

    CardView contect;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View bloodview = inflater.inflate(R.layout.fragment_3, container, false);

        contect = bloodview.findViewById(R.id.contect);
        contect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent dial = new Intent();
                dial.setAction("android.intent.action.DIAL");
                try {
                    dial.setData(Uri.parse("tel:9951037343"));
                    startActivity(dial);
                } catch (Exception e) {
                    Log.e("Calling", "" + e.getMessage());
                }


            }
        });

        // Inflate the layout for this fragment
        return bloodview ;
    }
}