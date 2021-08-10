package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
// Need to import from XLM error

public class MainActivity extends AppCompatActivity implements OnClickListener {
    // podcast player
    // Mediaplayer player

    //1st Step: Create two variable Text and Btn
    TextView NameOfGallery;
    TextView NumOfGallery;
    ImageView Glass;
    Button ChangeGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Changing the name of the interface on the top of the screen
        //setTitle("Name");

        // 2nd Step: Link created variable by Ref.ID
        NameOfGallery = findViewById(R.id.NameOfGallery);
        NumOfGallery = findViewById(R.id.NumOfPodcast);
        Glass = findViewById(R.id.Default);
        ChangeGallery = findViewById(R.id.Change_Gallery);

        Glass.setImageResource(R.drawable.zoominactive);

        //Create your buttons and set their onClickListener to "this"
        Button LateGothicHallBtn = findViewById(R.id.LateGothicHallBtn);
        LateGothicHallBtn.setOnClickListener(this);
        Button FuentiduenaChapelBtn = findViewById(R.id.FuentidueñaChapelBtn);
        FuentiduenaChapelBtn.setOnClickListener(this);
        Button SaintGuilhemCloisterBtn = findViewById(R.id.SaintGuilhemCloisterBtn);
        SaintGuilhemCloisterBtn.setOnClickListener(this);
        Button RomanesqueHallBtn = findViewById(R.id.RomanesqueHallBtn);
        RomanesqueHallBtn.setOnClickListener(this);
        Button LangonChapelBtnn = findViewById(R.id.LangonChapelBtn);
        LangonChapelBtnn.setOnClickListener(this);
        Button PontautChapterHouseBtn = findViewById(R.id.PontautChapterHouseBtn);
        PontautChapterHouseBtn.setOnClickListener(this);
        Button EarlyGothicHallBtn = findViewById(R.id.EarlyGothicHallBtn);
        EarlyGothicHallBtn.setOnClickListener(this);
        Button CuxaCloisterBtn =findViewById(R.id.CuxaCloisterBtn);
        CuxaCloisterBtn.setOnClickListener(this);
        Button UnicornTapestriesRoomBtn = findViewById(R.id.UnicornTapestriesRoomBtn);
        UnicornTapestriesRoomBtn.setOnClickListener(this);
        Button NineHeroesTapestriesRoomBtn = findViewById(R.id.NineHeroesTapestriesRoomBtn);
        NineHeroesTapestriesRoomBtn.setOnClickListener(this);
        Button BoppardRoomBtn =  findViewById(R.id.BoppardRoomBtn);
        BoppardRoomBtn.setOnClickListener(this);
        Button MerodeRoomBtn = findViewById(R.id.MerodeRoomBtn);
        MerodeRoomBtn.setOnClickListener(this);
        Button MainHallBtn = findViewById(R.id.Main_Hall);
        MainHallBtn.setOnClickListener(this);
        Button MetStoreBtn = findViewById(R.id.Met_Store);
        MetStoreBtn.setOnClickListener(this);

        TextView tv=(TextView)findViewById(R.id.NameOfGallery);
        tv.setSelected(true);
    }

    @Override
    public void onClick(View v){
            // Perform action on click
            switch(v.getId()) {
                case R.id.LateGothicHallBtn:
                    //LateGothicHallBtn.isSelected = !LateGothicHallBtn.isSelected;
                    NameOfGallery.setText(getString(R.string.Late_Gothic_Hall));
                    Glass.setImageResource(R.drawable.zoomactivefull);
                    NumOfGallery.setText("3");

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, LateGothicHall.class));
                        }
                    });


                    break;
                case R.id.FuentidueñaChapelBtn:
                    NameOfGallery.setText(getString(R.string.Fuentidueña_Chapel));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, FuentiduenaChapel.class));
                        }
                    });

                    break;
                case R.id.SaintGuilhemCloisterBtn:
                    NameOfGallery.setText(getString(R.string.Saint_Guilhem_Cloister));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, SeintFuilhemCloister.class));
                        }
                    });

                    break;
                case R.id.RomanesqueHallBtn:
                    NameOfGallery.setText(getString(R.string.Romanesque_Hall));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, RomanesqueHall.class));
                        }
                    });
                    break;
                case R.id.LangonChapelBtn:
                    NameOfGallery.setText(getString(R.string.Langon_Chapel));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, LangonChapel.class));
                        }
                    });

                    break;
                case R.id.PontautChapterHouseBtn:
                    NameOfGallery.setText(getString(R.string.Pontaut_Chapter_House));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, PontautChapterHouse.class));
                        }
                    });
                    break;
                case R.id.EarlyGothicHallBtn:
                    NameOfGallery.setText(getString(R.string.EarlyGothic_Hall));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, EarlyGothicHall.class));
                        }
                    });
                    break;
                case R.id.NineHeroesTapestriesRoomBtn:
                    NameOfGallery.setText(getString(R.string.Nine_Heroes_Tapestries_Room));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, NineHeroesTapestriesRoom.class));
                        }
                    });

                    break;
                case R.id.CuxaCloisterBtn:
                    NameOfGallery.setText(getString(R.string.Cuxa_Cloister));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, CuxaCloister.class));
                        }
                    });

                    break;
                case R.id.BoppardRoomBtn:
                    NameOfGallery.setText(getString(R.string.Boppard_Room));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, BoppardRoom.class));
                        }
                    });

                    break;
                case R.id.MerodeRoomBtn:
                    NameOfGallery.setText(getString(R.string.Merode_Room));
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoomactiveempty);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, MerodeRoom.class));
                        }
                    });
                    break;
                case R.id.UnicornTapestriesRoomBtn:
                    NameOfGallery.setText(getString(R.string.Unicorn_Tapestries_Room));
                    NumOfGallery.setText("1");
                    Glass.setImageResource(R.drawable.zoomactivefull);

                    // Changing Gallery, adding new activity [active when button is clicked]
                    ChangeGallery.setOnClickListener(new View.OnClickListener() {
                        //@Override
                        public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, UnicornTapestriesRoom.class));
                        }
                    });
                    break;
                case R.id.Main_Hall:
                    NameOfGallery.setText("Main Hall");
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoominactive);
                    break;
                case R.id.Met_Store:
                    NameOfGallery.setText("The Met Store");
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoominactive);
                    break;
                default:
                    NameOfGallery.setText("1st Floor");
                    NumOfGallery.setText("");
                    Glass.setImageResource(R.drawable.zoominactive);
            }
        }


    public void launchGroundFloor (View v) {
        Intent i = new Intent(this,GroundFloorActivity.class );
        startActivity(i);
    }

    public void ShowPopUp (View v) {
        Intent i = new Intent(this,PopUpActivity.class );
        startActivity(i);
    }

    // public void [name of the func] (View v){}

    // launch new activity
    /*
    public void launch[name of activity](View v){
        Intent i = new Intent(packageContent:this, [name of activity].class);
        startActivity (i);
    }
     */

    /*
    public void play (View v){
        if (player == null){
            player = Mediaplayer.create (context: this, R.raw.[name of the mp3];
        }
        player.start();
    }

    public void pause (View v){
        if (player != null){
            player.pause();
        }
    }
     */
}