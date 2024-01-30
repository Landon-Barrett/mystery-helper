package com.example.cs408lab1mysteryhelper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cs408lab1mysteryhelper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] storyPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Random rand = new Random();
        storyPoint = getResources().getStringArray(R.array.storyPoints);
        binding.getHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Grabs a random entry from string array resource and displays it. */
                int randInt = rand.nextInt(storyPoint.length);
                TextView t = binding.output;
                t.setText(storyPoint[randInt]);
            }

        });

    }

}