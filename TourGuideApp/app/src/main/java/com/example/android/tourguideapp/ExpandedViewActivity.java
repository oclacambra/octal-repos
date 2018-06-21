package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class ExpandedViewActivity extends AppCompatActivity {

    private ImageView closeButton, expandedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandedview_layout);

        getSupportActionBar().hide();

        closeButton = (ImageView) findViewById(R.id.close_button);
        expandedView = (ImageView) findViewById(R.id.expanded_imageView);

        Intent intent = getIntent();
        int receivedResourceId = intent.getIntExtra("mSelectedResourceId", 0);

        expandedView.setImageResource(receivedResourceId);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
