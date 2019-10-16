package switchtest;


public class EnumTest2 {
	
	
	public static void main(String[] args) {
			
	MyEnums.Fruit f1,f2,f3; 
	f1 = MyEnums.Fruit.APPLE;
	f2 = f1;
	System.out.println("Favorite Fruit is " + f2);

	MyEnums.Fruit favoriteFruit= MyEnums.Fruit.APPLE;
	
	switch(favoriteFruit){
	
	case APPLE: System.out.print("APPLE");
		break;
	case ORANGE:System.out.print("ORANGE");
		break;
	case BANANA:System.out.print("BANANA");
		break;
	}
  }
}