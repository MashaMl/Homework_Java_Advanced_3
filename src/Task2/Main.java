package Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       File f1 = new File("D:\\Masha\\IT\\test2.txt");
       if(!f1.exists())
           f1.createNewFile();
       PrintWriter printWriter = new PrintWriter(new FileWriter(f1, true));
       printWriter.println("Hello");
       printWriter.flush();
       printWriter.close();
       BufferedReader bufferedReader = new BufferedReader(new FileReader(f1));
       String temp;
       while ((temp = bufferedReader.readLine()) != null) {
           System.out.println(temp);
       }
       bufferedReader.close();
    }
}
