package forloop;

public class Pyramid {
	
	public static void main(String[] args) {
	Pyramid1();
	System.out.println();
	Pyramid2();
	}
		
	public static void Pyramid1(){
		int N = 6;
		for(int i=1; i<=N; i++) {
			for(int j= 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();//new Line
	    }	
	}
	public static void Pyramid2(){
		int N = 6;
		for(int i=1; i<=N; ) {
			for(int j= 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();//new Line
	    }	
	}
}


	/*for (int i = 0; i <6 ; i++) {
        for (int j = 0; j < 6 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();*/
