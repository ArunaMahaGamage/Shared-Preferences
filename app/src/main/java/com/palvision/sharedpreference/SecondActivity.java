package com.palvision.sharedpreference;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // UI References
    private TextView textTxt;

    private String text;

    private SharedPreference sharedPreference;

    Activity context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreference = new SharedPreference();

        findViewsById();

        //Retrieve a value from SharedPreference
        text = sharedPreference.getValue(context);
        textTxt.setText(text);
    }

    private void findViewsById() {
        textTxt = (TextView) findViewById(R.id.txt_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
