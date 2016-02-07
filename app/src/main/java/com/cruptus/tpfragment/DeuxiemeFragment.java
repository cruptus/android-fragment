package com.cruptus.tpfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class DeuxiemeFragment extends Fragment {
    private ImageView imgView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.fragment_deuxieme, container, false);
        imgView=(ImageView)view.findViewById(R.id.imageView);
        return view;
    }

    public void changeData(String data)
    {
        int resId = getResources().getIdentifier(data.toLowerCase(), "drawable", getContext().getPackageName());
        imgView.setImageResource(resId);
    }
}
