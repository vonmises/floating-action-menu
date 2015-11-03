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
    //FloatingActionsMenu floating_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //floating_menu = (FloatingActionsMenu) findViewById(R.id.multiple_actions);
    }

    public void openDataActivity(View view) {
        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }

    public void openChartActivity(View view) {
        Intent intent = new Intent(this, ChartActivity.class);
        startActivity(intent);
    }

    public void openSummaryActivity(View view){
        Intent intent = new Intent(this, SummaryActivity.class);
        startActivity(intent);
    }
}