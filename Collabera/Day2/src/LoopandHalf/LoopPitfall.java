
public class LoopPitfall {

	public static void main(String[] args) {
		int result =0; double cnt = 1.0;
		
		while (cnt <= 10.0 ) {
			cnt += 1.0;
			result++;
		}
		System.out.println(result);
	}
}
 /*int result =0; double cnt = 0.0; {

//while (cnt <= 1.0 ) {
	cnt += 0.1;
	result++;
}
System.out.println(result);
}
} */