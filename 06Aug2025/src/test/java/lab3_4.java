import java.util.Arrays;
import java.util.Comparator;

public class lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] product= {"Laptop", "Mobile", "bike","Car"};
		
		Arrays.sort(product, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(product));
	}

}
