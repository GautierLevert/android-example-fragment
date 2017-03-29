package com.example.levertg.fragmentapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LogicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LogicFragment extends Fragment {

    private static final String TAG = "LOGIC_FRAGMENT";


    public LogicFragment() {
        // Required empty public constructor
        Log.d(TAG, "construction");
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment LogicFragment.
     */
    public static LogicFragment newInstance() {
        LogicFragment fragment = new LogicFragment();
        Bundle args = new Bundle();
        // put some arguments here
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // do something with arguments
        }
        Log.d(TAG, "creation");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "destroy");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "create view");
        // Inflate the layout for this fragment
        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "destroy view");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "attached");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "detached");
    }
}
