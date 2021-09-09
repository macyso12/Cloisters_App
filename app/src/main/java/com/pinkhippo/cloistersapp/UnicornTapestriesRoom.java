package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UnicornTapestriesRoom extends AppCompatActivity {

    ImageView Podcast;
    TextView GalleryName;
    Boolean Selected = false;
    Button ChangeMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unicorn_tapestries_room);

        Podcast = findViewById(R.id.Podcast);
        GalleryName = findViewById(R.id.GalleryName);
        ChangeMedia = findViewById(R.id.ChangeMedia);

        Button UnicornBtn = (Button) findViewById(R.id.unicorn_defend);

        TextView tv=(TextView)findViewById(R.id.GalleryName);
        tv.setSelected(true);
    }

    public void UnicornDefend (View v){
        Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Unicorn_Tapestries_Room);
        Selected = !Selected;

        // Changing Gallery, adding new activity [active when button is clicked]
        ChangeMedia.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                startActivity(new Intent(UnicornTapestriesRoom.this, UnicornMedia.class));
            }
        });
    }

    // Zoom out function, going back to main floor [main activity]
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }

}