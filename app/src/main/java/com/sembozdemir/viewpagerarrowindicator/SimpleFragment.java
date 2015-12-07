package com.sembozdemir.viewpagerarrowindicator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {


    private static final String KEY_MESSAGE = "message";

    public SimpleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.textview_in_fragment);
        String msg = getArguments().getString(KEY_MESSAGE);
        textView.setText(msg);

        return rootView;
    }

    public static Fragment newInstance(String message) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_MESSAGE, message);
        SimpleFragment fragment = new SimpleFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

}
