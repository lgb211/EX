import java.util.Scanner;
public class TimeTable {
 
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int j=scan.nextInt();
	if(j>=10) {
		System.out.println("입력받은 값이 9보다 큽니다");
	}else if(j<2) {
		System.out.println("입력받은 값이 2보다 작습니다");
	}else {
		for(int i=1;i<10;i++) {
		System.out.println(j+"*"+i+"="+j*i);
		}
	}
	}
}

