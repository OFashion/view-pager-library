package com.viewpagerindicator.sample;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.viewpagerindicator.UnderlinePageIndicator;
import com.viewpagerindicator.sample.R;

public class SampleUnderlinesStyledLayout extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.themed_underlines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (UnderlinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }
}