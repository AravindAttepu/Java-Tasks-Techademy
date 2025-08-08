import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] args) {
        String filePath = "numbers.txt";

      
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                FileWriter fw = new FileWriter(file);
                for (int i = 0; i <= 10; i++) {
                    fw.write(i + (i < 10 ? "," : "")); 
                }
                fw.close();
                System.out.println("numbers.txt created successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }


        try {
            Scanner scanner = new Scanner(new File(filePath));
            scanner.useDelimiter(","); 
            System.out.println("Even numbers in file:");
            while (scanner.hasNext()) {
                int num = Integer.parseInt(scanner.next().trim());
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
