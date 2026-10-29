package com.safeshield.app;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(48, 48, 48, 48);
        root.setBackgroundColor(Color.parseColor("#0F172A"));

        TextView title = new TextView(this);
        title.setText("SafeShield");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("সুরক্ষা বন্ধ আছে");
        status.setTextSize(20);
        status.setTextColor(Color.parseColor("#F87171"));
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 32, 0, 0);

        root.addView(title);
        root.addView(status);
        setContentView(root);
    }
}
