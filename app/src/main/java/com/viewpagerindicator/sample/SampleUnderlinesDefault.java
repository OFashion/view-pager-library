package com.viewpagerindicator.sample;

import android.os.Bundle;

import com.viewpagerindicator.UnderlinePageIndicator;

public class SampleUnderlinesDefault extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_underlines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (UnderlinePageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }
}