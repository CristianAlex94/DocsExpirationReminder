package com.app_dev.criss.docsexpirationreminder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {
    private TextView textView;

    public DemoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        textView = view.findViewById(R.id.txt_display);
        textView.setText(getArguments().getString("message"));
        //basically "getArguments()..." is like a variable, you can use that syntax to substitute in strings
        return view;
    }

}
