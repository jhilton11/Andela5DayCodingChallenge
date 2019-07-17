package com.appify.andela5_daycodingchallenge;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class ActivityC extends AppCompatActivity {
    private ImageView profilePic;
    private TextView profileName, email, phoneNo, country, track, slackName;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        profilePic = findViewById(R.id.profilePic);
        profileName = findViewById(R.id.profileName);
        email = findViewById(R.id.email);
        phoneNo = findViewById(R.id.phoneNo);
        country = findViewById(R.id.country);
        track = findViewById(R.id.track);
        slackName = findViewById(R.id.slackName);

        email.setText("Email:   scolaguys@yahoo.co.uk");
        country.setText("Country:   Nigeria");
        profileName.setText("Oluyinka Ige");
        phoneNo.setText("Phone No:  +234(0)8081866654");
        track.setText("Track:   Android");
        slackName.setText("Slack Username:  @Oluyinka Ige");

        toolbar = getSupportActionBar();
        toolbar.setTitle("My Profile");

        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setHomeButtonEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
