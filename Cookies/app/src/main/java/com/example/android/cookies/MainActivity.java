package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView afterCookieView = (ImageView) findViewById(R.id.android_cookie_image_view);
        afterCookieView.setImageResource(R.drawable.after_cookie);

        TextView afterCookieTextView = (TextView) findViewById(R.id.status_text_view);
        afterCookieTextView.setText("I'm So Full");
        

    }
}