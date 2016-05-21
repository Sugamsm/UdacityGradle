package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

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
        GetJoke joke = new GetJoke(this, pb);

        try {
            String jokePaid = joke.execute().get();
            Intent intent = new Intent(this, star15.com.myandlibrary.MainActivity.class);
            intent.putExtra("joke", jokePaid);
            startActivity(intent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
