package com.omrobbie.androidversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static String SCREENSHOT = "SCREENSHOT";
    public static String DESCRIPTION = "DESCRIPTION";
    public static String RILIS = "RILIS";
    public static String PENGEMBANG = "PENGEMBANG";

    ImageView ivScreenshot;
    TextView description;
    TextView rilis;
    TextView pengembang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setupEnv();
    }

    private void setupEnv() {
        String imgPath = getIntent().getStringExtra(SCREENSHOT);
        String desc = getIntent().getStringExtra(DESCRIPTION);
        String ril = getIntent().getStringExtra(RILIS);
        String peng = getIntent().getStringExtra(PENGEMBANG);


        ivScreenshot = (ImageView) findViewById(R.id.iv_screenshot);
        description = (TextView) findViewById(R.id.tv_description);
        rilis = (TextView) findViewById(R.id.tv_initial_release);
        pengembang = (TextView) findViewById(R.id.tv_version);

        if (imgPath.isEmpty()) {
            ivScreenshot.setVisibility(View.GONE);
        } else {
            Glide.with(this)
                    .load(imgPath)
                    .into(ivScreenshot);
        }

        description.setText(desc);
        rilis.setText(ril);
        pengembang.setText(peng);

    }
}
