import java.util.Scanner;
public class ArrayTimesTable {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int j=scan.nextInt();
		int[] result = new int[9];
		
		for(int i=0;i<result.length;i++) {
			result[i]= j*(i+1);
			System.out.println(result[i]);
		}
	}
	

	
}
