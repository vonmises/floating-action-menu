package com.getbase.floatingactionbutton.sample;

import com.andrew.test.ChartActivity;
import com.andrew.test.DataActivity;
import com.andrew.test.R;
import com.andrew.test.SummaryActivity;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FloatingActionsMenu floating_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floating_menu = (FloatingActionsMenu) findViewById(R.id.multiple_actions);

        findViewById(R.id.data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
                floating_menu.toggle();
            }
        });

        findViewById(R.id.chart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChartActivity.class);
                startActivity(intent);
                floating_menu.toggle();
            }
        });

        findViewById(R.id.summary).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
                startActivity(intent);
                floating_menu.toggle();
            }
        });

    }
}