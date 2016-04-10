package com.su.lapponampai_w.test_canerease;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class DetailActivity extends AppCompatActivity {

    private Button hotmailbutton;
    private Button back_to_MainActivity;
    private Button soundButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();
        openhotmail();
        back_to_MainActivity();
        addSound();


    }

    private void addSound() {
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (MediaPlayer.create(getBaseContext(),R.raw.cow)).start();

            }
        });
    }

    private void back_to_MainActivity() {
        back_to_MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(i);


            }
        });


    }

    private void openhotmail() {

        hotmailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent w = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotmail.com"));
                startActivity(w);

            }
        });
    }

    private void bindWidget() {
        hotmailbutton = (Button) findViewById(R.id.detail_Button);
        back_to_MainActivity = (Button) findViewById(R.id.back_to_Main_Button);
        soundButton = (Button) findViewById(R.id.sound_Button);

    }


}


