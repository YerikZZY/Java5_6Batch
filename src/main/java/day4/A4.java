package day4;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class A4 {
    public static void main(String[] args) {
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();
        new Reader().setQueue(blockingDeque).run();
        new Writer().setQueue(blockingDeque).run();
    }
}
