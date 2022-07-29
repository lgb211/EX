import java.util.Scanner;
public class TimeTable {
 
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int j=scan.nextInt();
	for(int i=1;i<10;i++) {
		System.out.println(j+"*"+i+"="+j*i);
	}
}

}