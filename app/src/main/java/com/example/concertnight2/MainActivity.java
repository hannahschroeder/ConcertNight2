package com.example.concertnight2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button generateMadlib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateMadlib = findViewById(R.id.generateMadlib);

        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);

        EditText name = findViewById(R.id.name);
        EditText adjective = findViewById(R.id.adjective);
        EditText verb = findViewById(R.id.verb);
        EditText musicGenre = findViewById(R.id.musicGenre);
        EditText modeOfTransport = findViewById(R.id.modeOfTransport);
        EditText relationshipType = findViewById(R.id.relationshipType);
        EditText animal = findViewById(R.id.animal);
        EditText season = findViewById(R.id.season);
        EditText clothingItem = findViewById(R.id.clothingItem);
        EditText sport = findViewById(R.id.sport);

        generateMadlib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String story = "You just got tickets to see your favorite artist, " + name + " in concert tonight!";
                story += "\nYou are very excited because the artist is extremely " + adjective + " and always " + verb + "s on stage.";
                story += "\nYou usually do not like " + musicGenre + " music, but you make an exception because the tickets were free and you are cheap.";
                story += "\nYou and your " + relationshipType + " try to drive to the concert, but your car dies on the way there.";
                story += "\nAfter being stuck on the freeway for 20 minutes, you and your " + relationshipType + " decide to ditch the car and take a " + modeOfTransport + " instead.";
                story += "\nYou guys are on your way again, until you spot a " + animal + " in the middle of the road";
                story += "\nYou are confused because you never finished school and you thought that all " + animal + "s died in the " + season + ".";
                story += "\nThe " + animal + verb + "s up to you and bites you, ripping your favorite " + clothingItem + ".";
                story += "\nYou are so frustrated that you don't even want to go to " + name + "'s concert anymore.";
                story += "\nYou see that a group of strangers started a game of " + sport + ", so you ditch your " + relationshipType + " and join them instead.";


                secondActivity.putExtra("story", story);

                startActivity(secondActivity);
            }
        });



    }
}