package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {

        // Find first menu item TextView and print the text to the logs

        TextView firstMenuItem = (TextView) findViewById(R.id.menu_item_1);
        String firstItem = firstMenuItem.getText().toString();
        Log.v("MainActivity", firstItem);

        // Find second menu item TextView and print the text to the logs

        TextView secondMenuItem = (TextView) findViewById(R.id.menu_item_2);
        String secondItem = secondMenuItem.getText().toString();
        Log.v("MainActivity", secondItem);

        // Find third menu item TextView and print the text to the logs

        TextView thirdMenuItem = (TextView) findViewById(R.id.menu_item_3);
        String thirdtem = thirdMenuItem.getText().toString();
        Log.v("MainActivity", thirdtem);
    }
}