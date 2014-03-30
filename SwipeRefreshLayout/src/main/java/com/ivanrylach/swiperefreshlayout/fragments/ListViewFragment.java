package com.ivanrylach.swiperefreshlayout.fragments;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ivanrylach.swiperefreshlayout.R;
import com.ivanrylach.swiperefreshlayout.fragments.dummy.DummyContent;

/**
 * <p/>
 * Created by Ivan Rylach,
 * ivan.rylach@gmail.com
 */

public class ListViewFragment extends SwipableFragment{

    private ListView listView;

    public static ListViewFragment newInstance() {
        ListViewFragment fragment = new ListViewFragment();
        return fragment;
    }

    public ListViewFragment() {
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_list;
    }

    @Override
    void initializeViews(View rootView) {
        listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<DummyContent.DummyItem>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, DummyContent.ITEMS));

    }

    @Override
    public void onRefresh() {
        super.onRefresh();
        Toast.makeText(getActivity(), getString(R.string.on_refresh_text), Toast.LENGTH_SHORT).show();
    }
}
