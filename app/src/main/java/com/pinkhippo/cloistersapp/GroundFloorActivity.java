package com.pinkhippo.cloistersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
// Need to import from XLM error

public class GroundFloorActivity extends AppCompatActivity implements OnClickListener {

    //1st Step: Create two variable Text and Btn
    TextView NameOfGallery;
    TextView NumOfGallery;
    ImageView Magnify;
    Button ChangeGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground_floor);

        NameOfGallery = findViewById(R.id.NameOfGallery);
        NumOfGallery = findViewById(R.id.NumOfPodcast);
        Magnify = findViewById(R.id.Default);
        ChangeGallery = findViewById(R.id.Change_Gallery);

        Magnify.setImageResource(R.drawable.zoominactive);


        Button TreasuryBtn = findViewById(R.id.TreasuryBtn);
        TreasuryBtn.setOnClickListener(this);
        Button GlassGalleryBtn = findViewById(R.id.GlassGalleryBtn);
        GlassGalleryBtn.setOnClickListener(this);
        Button GothicChapelBtn = findViewById(R.id.GothicChapelBtn);
        GothicChapelBtn.setOnClickListener(this);
        Button BonnefontClositerBtn = findViewById(R.id.BonnefontClositerBtn);
        BonnefontClositerBtn.setOnClickListener(this);
        Button TrieClostierBtn = findViewById(R.id.TrieClostierBtn);
        TrieClostierBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.TreasuryBtn:
                NameOfGallery.setText(getString(R.string.Treasury));
                NumOfGallery.setText("");
                Magnify.setImageResource(R.drawable.zoomactiveempty);

                // Changing Gallery, adding new activity [active when button is clicked]
                ChangeGallery.setOnClickListener(new View.OnClickListener() {
                    //@Override
                    public void onClick(View v) {
                        startActivity(new Intent(GroundFloorActivity.this, Treasury.class));
                    }
                });
                break;
            case R.id.GlassGalleryBtn:
                NameOfGallery.setText(getString(R.string.Glass_Gallery));
                NumOfGallery.setText("1");
                Magnify.setImageResource(R.drawable.zoomactivefull);

                ChangeGallery.setOnClickListener(new View.OnClickListener() {
                    //@Override
                    public void onClick(View v) {
                        startActivity(new Intent(GroundFloorActivity.this, TheGlassGallery.class));
                    }
                });
                break;
            case R.id.GothicChapelBtn:
                NameOfGallery.setText(getString(R.string.Gothic_Chapel));
                NumOfGallery.setText("");
                Magnify.setImageResource(R.drawable.zoomactiveempty);

                ChangeGallery.setOnClickListener(new View.OnClickListener() {
                    //@Override
                    public void onClick(View v) {
                        startActivity(new Intent(GroundFloorActivity.this, GothicChapel.class));
                    }
                });
                break;
            case R.id.BonnefontClositerBtn:
                NameOfGallery.setText(getString(R.string.Bonnefont_Clositer));
                NumOfGallery.setText("");
                Magnify.setImageResource(R.drawable.zoomactiveempty);

                ChangeGallery.setOnClickListener(new View.OnClickListener() {
                    //@Override
                    public void onClick(View v) {
                        startActivity(new Intent(GroundFloorActivity.this, bonnefontCloister.class));
                    }
                });
                break;
            case R.id.TrieClostierBtn:
                NameOfGallery.setText(getString(R.string.Trie_Clostier));
                NumOfGallery.setText("");
                Magnify.setImageResource(R.drawable.zoomactiveempty);

                ChangeGallery.setOnClickListener(new View.OnClickListener() {
                    //@Override
                    public void onClick(View v) {
                        startActivity(new Intent(GroundFloorActivity.this, TrieClositer.class));
                    }
                });
                break;
            default:
                NameOfGallery.setText("");
                NumOfGallery.setText("");
                Magnify.setImageResource(R.drawable.zoominactive);
        }
    }

    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }
}
