package LoopandHalf;

import java.util.Scanner;

public class LoopaHalf{
public static void main(String[] args) {
	LoopaHalf();
}

public static void LoopaHalf() {
    String name;
	Scanner in = new Scanner(System.in);
	
	while(true) {
		System.out.print("Your name: ");
		name = in.nextLine();
		
		if(name.length() > 0) {
			System.out.println("Name: " + name);
			break;
		}
		System.out.println("Invalid Entry" + "You must enter at least one character");
	}
  }
}
