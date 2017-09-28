package com.example.admin.dataloadintablayoutfromrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 9/28/2017.
 */

class BlankFragment extends Fragment {
    public BlankFragment()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
      super.onCreate(savedInstanceState);
    }
    @

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank,container,false);
        RecyclerView rv=(RecyclerView)view.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter=new MyAdapter(new String[]{"one","two","three","four","five"})
        return
    }
}
