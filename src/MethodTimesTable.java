import java.util.Scanner;
public class MethodTimesTable {
	//입력받은 값을 메소드를 만들어 구구단 구현
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int j = scan.nextInt(); 
	int[] t = Calculate(j); 
	print(t,j); 
}

public static int[] Calculate(int j) {
	
	int[] t = new int[9];
	
	for(int i=0;i<9;i++) {
		t[i]= j*(i+1);
	}
	
	return t;
	
	//계산
}
public static void print(int[] t,int j) {
	for(int i=0;i<t.length;i++) {
			System.out.println(j+"*"+(i+1)+"="+t[i]);
	}
	//계산결과 출력
}

}
