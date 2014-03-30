package com.ivanrylach.swiperefreshlayout.fragments;

import android.view.View;
import android.widget.Toast;

import com.ivanrylach.swiperefreshlayout.R;

/**
 * <p/>
 * Created by Ivan Rylach,
 * ivan.rylach@gmail.com
 */
public class TextViewFragment extends SwipableFragment{

    private static final String TAG = TextViewFragment.class.getSimpleName();


    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TextViewFragment newInstance() {
        TextViewFragment fragment = new TextViewFragment();
        return fragment;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_text_view;
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
