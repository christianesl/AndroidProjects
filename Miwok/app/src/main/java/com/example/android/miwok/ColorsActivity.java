package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> listOfColors = new ArrayList<>();
        listOfColors.add(new Word("red","wetetti", R.drawable.color_red, R.raw.color_red));
        listOfColors.add(new Word("mustard yellow","chiwiitә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        listOfColors.add(new Word("dusty yellow", "topiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        listOfColors.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        listOfColors.add(new Word("brown", "takaakii", R.drawable.color_brown, R.raw.color_brown));
        listOfColors.add(new Word("gray", "topoppi", R.drawable.color_gray, R.raw.color_gray));
        listOfColors.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        listOfColors.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));

        WordAdapter wordAdapter = new WordAdapter(this, listOfColors, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = listOfColors.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });
    }
}