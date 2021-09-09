package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Carousell extends AppCompatActivity {

    //private ViewPager2 viewPager2;
    //private Handler sliderHandler = new Handler();

    ImageView Podcast;
    TextView GalleryName;
    Boolean Selected = false;
    Button ChangeMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousell);

        Podcast = findViewById(R.id.Podcast);
        GalleryName = findViewById(R.id.GalleryName);
        ChangeMedia = findViewById(R.id.ChangeMedia);

        Button DevotoinalBtn = (Button) findViewById(R.id.Devotional);

        TextView tv = (TextView) findViewById(R.id.GalleryName);
        tv.setSelected(true);

        //viewPager2 = findViewById(R.id.viewPagerImageSlider);

        //here, i'm preparing list of images from drawable
        // You can get it from API as well

        //List<SliderItem> sliderItems = new ArrayList<>();
        // add in more photos here
        //sliderItems.add(new SliderItem(R.drawable.devotionalshrine_2020));
        //sliderItems.add(new SliderItem(R.drawable.devotionalshrine_2020));

        /*viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));

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
    }*/
    }

    public void Devotional (View v){
        Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Saint_Christopher);
        Selected = !Selected;

        // Changing Gallery, adding new activity [active when button is clicked]
        ChangeMedia.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                startActivity(new Intent(Carousell.this, Devotional.class));
            }
        });
    }
/*
    public void backtoView (View v) {
        Intent i = new Intent(this,TheGlassGallery.class );
        startActivity(i);*/
    }
