package com.jtarnoff.bgtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent(v.getContext(), TestActivity.class)
                                .putExtra("numDice", 1);
                        v.getContext().startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(v.getContext(), TestActivity.class)
                                .putExtra("numDice", 2);
                        v.getContext().startActivity(b);
                        break;
                }
            }
        });
    }
}
