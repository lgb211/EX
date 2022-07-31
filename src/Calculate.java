
public class Calculate {


	public  int[] calculate(int j) {		
		int[] t = new int[9];
		
		for(int i=0;i<9;i++) {
			t[i]= j*(i+1);
			System.out.println(t[i]);
		}		
	
		return t;
		
	}
}
