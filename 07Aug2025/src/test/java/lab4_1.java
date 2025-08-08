import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String filePath = "sample.txt";
	        try {
	            
	        	
	            FileReader fr = new FileReader(filePath);
	            BufferedReader br = new BufferedReader(fr);
	            StringBuilder content = new StringBuilder();
	            String line;
	            while ((line = br.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	            br.close();

	                 content.reverse();

	          
	            FileWriter fw = new FileWriter(filePath);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(content.toString());
	            bw.close();

	            System.out.println("File content reversed successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
