package com.udacity.gradle.builditbigger;


import android.test.UiThreadTest;

import junit.framework.TestCase;

import java.util.concurrent.CountDownLatch;

public class AsyncTaskTest extends TestCase implements EndpointsAsyncTask.JokeRetrieved {
    private EndpointsAsyncTask asyncTask;
    private CountDownLatch latch = null;


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        latch = new CountDownLatch(1);
        asyncTask = new EndpointsAsyncTask(this);
    }

    @UiThreadTest
    public void testString() throws InterruptedException{
        asyncTask.execute();
        latch.await();
    }

    @Override
    public void passJoke(String joke) {
     assertTrue("Emptry string retrieved by AsyncTask", !joke.isEmpty());
        latch.countDown();
    }
}
