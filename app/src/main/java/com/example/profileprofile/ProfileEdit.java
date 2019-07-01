package com.example.profileprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileEdit extends AppCompatActivity {

    Profile Profile;
    EditText etName, etEmail, etAge;
    RadioButton male, female;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        male = (RadioButton)findViewById(R.id.male);
        female = (RadioButton)findViewById(R.id.female);
        Button btn = (Button)findViewById(R.id.send);
        Profile = new Profile();

        init();

        findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                saveProfile();
                goToNextActivity();

                Toast.makeText(ProfileEdit.this, "Big Toast", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if(checked)
                    str = "Male Selected";
                break;
            case R.id.female:
                if(checked)
                    str = "Female Selected";
                break;

        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }


    private void goToNextActivity() {
        Intent intent = new Intent(ProfileEdit.this, ProfileView.class);
        intent.putExtra(Constants.USER_PROFILE_KEY, Profile);
        startActivity(intent);
    }

    private void saveProfile() {
    /*String fName = etFirstName.getText().toString();
    userProfile.setFirstName(fName);*/

        Profile.setName(etName.getText().toString());
        Profile.setEmail(etEmail.getText().toString());
        Profile.setAge(etAge.getText().toString());


    }

    private void init() {
        etName = findViewById(R.id.name);
        etEmail = findViewById(R.id.email);
        etAge = findViewById(R.id.age);

    }

}
