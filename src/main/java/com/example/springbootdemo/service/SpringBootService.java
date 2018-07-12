package com.example.springbootdemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

import static java.lang.System.*;

@Service
public class SpringBootService {

    public static Random random = new Random();

    public SpringBootService() {
        out.println("inintal spring boot service");
    }
    @Async
    public void asynTask1() throws InterruptedException {
        out.println("come in asynTask1");

        long start = currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = currentTimeMillis();
        out.println("complete task1 spend time:" + (end - start));

    }

    @Async
    public void asynTask2() throws InterruptedException {

        out.println("come in asynTask2");

        long start = currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = currentTimeMillis();
        out.println("complete task2 spend time:" + (end - start));
    }

    @Async
    public void asynTask3() throws InterruptedException {

        out.println("come in asynTask3");

        long start = currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = currentTimeMillis();
        out.println("complete task3 spend time:" + (end - start));
    }
}
