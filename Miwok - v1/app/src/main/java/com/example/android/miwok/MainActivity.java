package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        //Set clickListener on that View
        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView family = (TextView)findViewById(R.id.family);
        //Set clickListener on that View
        family.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });


        TextView colors = (TextView)findViewById(R.id.colors);
        //Set clickListener on that View
        colors.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });


        TextView phrases = (TextView)findViewById(R.id.phrases);
        //Set clickListener on that View
        phrases.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });



    }

    /*public void openNumberList(View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }*/
}
