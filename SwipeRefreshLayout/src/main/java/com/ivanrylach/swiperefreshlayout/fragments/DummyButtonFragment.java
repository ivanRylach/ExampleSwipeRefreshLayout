package com.ivanrylach.swiperefreshlayout.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ivanrylach.swiperefreshlayout.R;

/**
 * <p/>
 * Created by Ivan Rylach,
 * ivan.rylach@gmail.com
 */

public class DummyButtonFragment extends SwipableFragment {

    public static DummyButtonFragment newInstance() {
        DummyButtonFragment fragment = new DummyButtonFragment();
        return fragment;
    }
    public DummyButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_button;
    }

    @Override
    void initializeViews(View rootView) {

    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        Toast.makeText(getActivity(), getString(R.string.on_refresh_text), Toast.LENGTH_SHORT).show();

    }
}
