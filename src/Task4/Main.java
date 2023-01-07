package Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\Masha\\IT\\task5.txt");
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
        printWriter.println("Task4");
        printWriter.flush();
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String temp;
        while ((temp = bufferedReader.readLine()) != null) {
            System.out.println(temp);
        }
        bufferedReader.close();
    }
}
