package prgs;

public class SamplePrgs {

	public static void main(String[] args) {

		String[] strArray = { "T", "O", "M", "M", "O", "R", "O", "W" };
		String s = "O";
		int count = 0;

		boolean x = false; // initializing x to false
		int in = 0; // declaration of index variable

		for (int i = 0; i < strArray.length; i++) {
			
			if (s.equals(strArray[i])) {
				in = i;
				x = true;
				// break;
				if (x)
				{
					//System.out.println(s + " String is found at index " + in);
					count = count +1;
					//System.out.println("Count=" +count);
					if(count==1)
					strArray[in] = "$";
					else if(count==2)
						strArray[in] = "$$";
					else if(count==3)
						strArray[in] = "$$$";
					}
				else
					System.out.println(s + " String is not found in the array");

			}
			System.out.print(strArray[i]);
		}
		
 
	}

	 

	 
	
	
	

}
