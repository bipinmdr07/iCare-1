package com.example.icare;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by developer on 1/5/16.
 */
public class BodyFragment extends Fragment {

    public static final String ARG_BODY_NUMBER = "body_number";

    public BodyFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_body, container, false);
    }
}
