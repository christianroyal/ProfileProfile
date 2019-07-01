package com.example.profileprofile;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileView extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_profile);

        Profile userProfile = (Profile) getIntent().getSerializableExtra(Constants.USER_PROFILE_KEY);

        tvDisplay = findViewById(R.id.tv_display);

        if (userProfile != null) {
            tvDisplay.setText(userProfile.toString());
        }

    }
}