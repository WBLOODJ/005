package com.jin.wang.a005;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Toast;



/**
 * Created by 11327 on 2017/12/22.
 */

public class TabLayoutOnlyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabLayout tabLayout = new TabLayout(this);
        tabLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabTextColors(Color.BLACK, Color.BLUE);
        tabLayout.setSelectedTabIndicatorColor(Color.GREEN);
        for (int i = 0; i < 40; i++) {
            tabLayout.addTab(tabLayout.newTab().setText("第"+i+"页面" ));
        }
        final Toast toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                toast.setText(tab.getPosition() + ":" + tab.getText());
                toast.show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setContentView(tabLayout);
    }
}


