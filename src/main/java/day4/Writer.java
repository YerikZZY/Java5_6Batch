package day4;
import java.io.*;
import java.util.concurrent.BlockingDeque;
public class Writer implements Runnable{

    BlockingDeque<String> blockingDeque = null;
    public Runnable setQueue(BlockingDeque<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
        return this;
    }
    @Override
    public void run() {
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            while(!blockingDeque.isEmpty()){
                myWriter.write(blockingDeque.poll());
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
