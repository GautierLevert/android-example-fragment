package com.example.levertg.fragmentapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlackFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlackFragment extends Fragment {

    private static final String TAG = "OTHER_FRAGMENT";

    public BlackFragment() {
        // Required empty public constructor
        Log.d(TAG, "construction");
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlackFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlackFragment newInstance() {
        BlackFragment fragment = new BlackFragment();
        Bundle args = new Bundle();
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
        return inflater.inflate(R.layout.fragment_black, container, false);
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
