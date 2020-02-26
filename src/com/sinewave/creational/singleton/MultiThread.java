package com.sinewave.creational.singleton;

public class MultiThread {

    private static MultiThread multiThread;
    private static Object mutex = new Object();

    private MultiThread() {
    }

    public static MultiThread getInstance() {
        /** If object hasn't created yet, acquire lock on object.
         *  so first racing thread acquire locks, then create an object
         *
         *  Reason for adding extra if inside synchronized block
         *
         *  Lets say two threads race to create an object..
         *  By the time  one acquires lock , other thread still see the `multiThread` value to
         *  be null , so other thread waits until critical section executed and starts to execute code ,
         *
         *  if this `if (null == multiThread)` piece of code wasn't there , thread creates an
         *  another object . To avoid this situation extra `if` is added
         *
         *  **/
        if (null == multiThread) {
            synchronized (mutex) {
                if (null == multiThread)
                    multiThread = new MultiThread();
                return multiThread;
            }
        }
        return  multiThread;

    }
}
