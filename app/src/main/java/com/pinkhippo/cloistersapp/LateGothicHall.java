package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LateGothicHall extends AppCompatActivity implements LateGothicHallArticle {

    ImageView Podcast;
    TextView GalleryName;
    Boolean Selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_late_gothic_hall);

        Podcast = findViewById(R.id.Podcast);
        GalleryName = findViewById(R.id.GalleryName);

        Button SaintChristopherBtn = (Button) findViewById(R.id.Christopher);
        Button SaintMichealBtn = (Button) findViewById(R.id.Micheal);
        Button SaintAndrew = (Button) findViewById(R.id.Andrew);

        TextView tv=(TextView)findViewById(R.id.GalleryName);
        tv.setSelected(true);

    }

    public void SaintChristopher (View v){
        Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Saint_Christopher);
        Selected = !Selected;
    }

    public void SaintMicheal (View v){
        Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Saint_Micheal);
        Selected = !Selected;
    }

    public void SaintAndrew (View v){
        Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Saint_Andrew);
        Selected = !Selected;
    }

    // Zoom out function, going back to main floor [main activity]
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }

    // Because this gallery have 3 podcast, could possibly add button, set it to have color -> change color when selected -> change default
    // image on top info bar to "podcast active" -> add a scrollable article name of the piece [scrollable could consider one detail features
    // instead of a main basic function

    // Next Step: Create Buttons (Change colors) + Top Info Bar (Show Article Name + Horizontal Scrolling) + Podcast Image Active x3
    // Saint Christopher Carrying Christ (Jeremy Beresford & Morgan Cockrell) ...
    // Saint Michael (Kass D'Aniello, Greg McGuinness, Molly Schwarz) ...
    // Retable with the Life of Saint Andrew (Ryan Gleason, Sophia Mazurowski, Sophia Spyropoulos) ...
    // 1. Create Buttons
    // 2. Set Names + switch statements (set text + set podcast image)
}