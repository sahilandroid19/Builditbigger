package com.example.android.displayjokes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class DisplayActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView textView = (TextView) findViewById(R.id.display_text);
        assert textView != null;
        textView.setText(getIntent().getStringExtra("joke"));
    }
}
