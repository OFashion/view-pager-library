package com.viewpagerindicator.sample;

import android.os.Bundle;

import com.viewpagerindicator.UnderlinePageIndicator;

public class SampleUnderlinesNoFade extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_underlines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        UnderlinePageIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);
        indicator.setFades(false);
        mIndicator = indicator;
    }
}