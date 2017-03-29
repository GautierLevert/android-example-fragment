package com.example.levertg.fragmentapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ACTIVITY";

    private boolean black = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchFragment();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment logicFragment = getSupportFragmentManager().findFragmentByTag("logic");

                if (logicFragment == null) {
                    Log.d(TAG, "create logic fragment");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(LogicFragment.newInstance(), "logic")
                            .commit();
                } else {
                    Log.d(TAG, "destroy logic fragment");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .remove(logicFragment)
                            .commit();
                }
            }
        });
    }

    private void switchFragment() {
        if (black) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentHolder, WhiteFragment.newInstance())
                    .commit();

            black = false;
        } else {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentHolder, BlackFragment.newInstance())
                    .commit();

            black = true;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragmentHolder);

        if (fragment == null) {
            Log.d(TAG, "create frament");
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentHolder, WhiteFragment.newInstance())
                    .commit();
        }
    }
}
