import java.util.Scanner;
public class ClassTimeTable {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int j = scan.nextInt();
	
	
	Calculate ca = new Calculate();
	Print pr = new Print();
	int[] t = ca.calculate(j);
	pr.print(t, j);


}
}
