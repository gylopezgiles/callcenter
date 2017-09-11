package com.almundo.callcenter;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gisela Lopez Giles on 9/9/17.
 */
public class Call implements Runnable {

    private Runnable callback;

    @Override
    public void run() {
        long duration = ThreadLocalRandom.current().nextLong(5, 10);
        System.out.println("La llamada durara: "+duration);
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(duration));
            if (callback != null) {
                callback.run();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void executeAtEnd(Runnable callback) {
        this.callback = callback;
    }
}
