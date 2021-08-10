package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class Carousell extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousell);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //here, i'm preparing list of images from drawable
        // You can get it from API as well

        List<SliderItem> sliderItems = new ArrayList<>();
        // add in more photos here
        sliderItems.add(new SliderItem(R.drawable.devotionalshrine_2020));
        sliderItems.add(new SliderItem(R.drawable.devotionalshrine_2020));

        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer(){
            @Override
            public void transformPage(@NonNull View page, float position){
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(slideRunnable);
                sliderHandler.postDelayed(slideRunnable, 3000);
            }
        });

    }

    private Runnable slideRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onPause(){
        super.onPause();
        sliderHandler.removeCallbacks(slideRunnable);
    }

    @Override
    protected void onResume(){
        super.onResume();
        sliderHandler.postDelayed(slideRunnable, 3000);
    }

    public void backtoView (View v) {
        Intent i = new Intent(this,TheGlassGallery.class );
        startActivity(i);
    }
}