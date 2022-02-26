package day4;
import java.io.*;
import java.util.*;
import java.util.concurrent.BlockingDeque;

public class Reader implements Runnable{
    BlockingDeque<String> blockingDeque = null;
    public Runnable setQueue(BlockingDeque<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
        return this;
    }
    @Override
    public void run() {
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                blockingDeque.offer(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
