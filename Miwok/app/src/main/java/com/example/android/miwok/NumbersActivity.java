package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(new Word("one","lutti", R.drawable.number_one, R.raw.number_one));
        listOfNumbers.add(new Word("two","otiiko", R.drawable.number_two, R.raw.number_two));
        listOfNumbers.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        listOfNumbers.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        listOfNumbers.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        listOfNumbers.add(new Word("six", "tmmokka", R.drawable.number_six, R.raw.number_six));
        listOfNumbers.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        listOfNumbers.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        listOfNumbers.add(new Word("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        listOfNumbers.add(new Word("ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));

        //https://developer.android.com/reference/android/R.layout.html#simple_list_item_1
        /*
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listofNumbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        */
        WordAdapter wordAdapter = new WordAdapter(this, listOfNumbers, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = listOfNumbers.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });

        //used to create TextView. Later replaced by ArrayAdapter.
        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        TextView[] wordView = new TextView[10];
        int counter = 0;
        while(counter < words.size()){
            wordView[counter] = new TextView(this);
            wordView[counter].setText(words.get(counter));
            rootView.addView(wordView[counter]);
            counter++;
        }
        // Verify the contents of the array by printing out each array element to the logs
        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));*/
    }
}