package com.example.icare;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dhakal on 1/5/16.
 */
public class DrinkFragment extends Fragment {

    public static final String ARG_DRINKS_NUMBER = "drinks_number";

    void DrinkFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drinks, container, false);
    }
}
