package com.eomsbd.ismaprotection.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eomsbd.ismaprotection.MainActivity;
import com.eomsbd.ismaprotection.OnBackPressed;
import com.eomsbd.ismaprotection.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sura17 extends Fragment implements OnBackPressed {

    LinearLayout button1;

    public Sura17() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sura17, container, false);
        button1= view.findViewById(R.id.backButton17);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return view;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getActivity(), MainActivity.class);
        startActivity(i);
    }
}
