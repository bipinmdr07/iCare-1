package com.example.icare;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by developer on 1/6/16.
 */
public class Tab1FoodFragment extends Fragment {

    public static final String ARG_TAB1_NUMBER = "Carb_number";
    void Tab1FoodFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab1_food, container, false);
    }
}
