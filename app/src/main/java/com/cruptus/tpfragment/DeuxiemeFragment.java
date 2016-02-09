package com.cruptus.tpfragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class DeuxiemeFragment extends Fragment {
    private ImageView imgView;
    private Vibrator mVibrator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.fragment_deuxieme, container, false);
        imgView=(ImageView)view.findViewById(R.id.imageView);
        mVibrator = (Vibrator) getContext().getSystemService(Activity.VIBRATOR_SERVICE);
        return view;
    }

    public void changeData(String data)
    {
        int resId = getResources().getIdentifier(data.toLowerCase(), "drawable", getContext().getPackageName());
        mVibrator.vibrate(100);
        imgView.setImageResource(resId);
    }
}
