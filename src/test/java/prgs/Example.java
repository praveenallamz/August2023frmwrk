package prgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		List<Integer> myList = new ArrayList<>();

		for(int i = 0; i < 10; i++){
		    myList.add(i);
		}
		//gets highest number in the list
		int highestNumber = Collections.max(myList);

		System.out.println(highestNumber);

	}

}
