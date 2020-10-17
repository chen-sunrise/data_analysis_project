package com.lagou.housework02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MulThreadingCopy {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new MulThreadingCopyTest());
        executorService.shutdown();
    }

}
