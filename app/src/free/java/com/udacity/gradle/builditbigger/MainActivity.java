package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.MyJoke;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = (ProgressBar) findViewById(R.id.loader);
    }

    public void tellJoke(View view) {
        GetJoke joker = new GetJoke(this, pb);
        Intent intent = new Intent(this, star15.com.myandlibrary.MainActivity.class);
        try {
            intent.putExtra("joke", joker.execute().get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        startActivity(intent);
    }
}
