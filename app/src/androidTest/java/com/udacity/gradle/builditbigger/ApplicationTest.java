package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends AndroidTestCase {

   public void testJoke() throws ExecutionException, InterruptedException {
       Context context = getContext();
       GetJoke getJoke = new GetJoke(context, null);
       assertNotNull(getJoke.execute().get());
   }
}