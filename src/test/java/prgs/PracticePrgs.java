package prgs;


//https://www.softwaretestinghelp.com/java-coding-interview-programs/

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class PracticePrgs {
	
	  public static int AA[]= {10,20,30,40,50,60,70,80};
	  public static int RArray[];
	  
	  public static int SecondMax[]={10,20,30,40,50,60,70,80};
	  
	  public static String Rduplicates,str="Apple";
	  
	  public static int m=5, n=25;
	  
	public static void main(String[] args) {  
	   
	    //[1]----REVERSE STRING --//REVERSE STRING--//REVERSE STRING
		    System.out.println(reverseString("Hello World"));  
	    
	   //[2]----Array Reverse--//Array Reverse--//Array Reverse
			RArray=	ReverseArray(AA);
			for(int k=0;k<=RArray.length-1;k++)
		    System.out.println(RArray[k]);
		
		//[3]-----SecondMax=====//SecondMax=====//SecondMax
			int KK= secMax(SecondMax);
			System.out.println("Second Maximum= " +KK);
			
		//[4]-----Remove Duplicates========//Remove Duplicates//Remove Duplicates
			Rduplicates = removeDup(str);
			System.out.println("Duplicates Removed String=" +Rduplicates);
		
		//[5]-----prime numbers betweeen the given range
		  PrimeNumbers(m, n); 
		
		//[6]----Palindrome==Palindrome==Palindrome
		  int xyz = 114411;
		   NumberPalindrome(xyz);
		  
		 //[7]---fibonacci series==fibonacci series==fibonacci series
		   FibonacciSeries();
		 
		 //[8]-----SUM of digits
		    SumOfDigits();
		   
		  //[9]-----SWAP of Numbers
		     SWAPNos();
		    
		  //[10]----count occurence of characters
		    String str = "beginnersbook"; 
			countEachChar(str); 
		  
	}

 

	private static void countEachChar(String str2) {
		//ASCII values ranges upto 256
		int counter[] = new int[256]; 

		//String length
		int len = str.length(); 

		/* This array holds the occurrence of each char, For example
		 * ASCII value of A is 65 so if A is found twice then 
		 * counter[65] would have the value 2, here 65 is the ASCII value
		 * of A
		 */
		for (int i = 0; i < len; i++) 
			counter[str.charAt(i)]++; 

		// We are creating another array with the size of String
		char array[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
		   array[i] = str.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			/* If a char is found in String then set the flag 
			 * so that we can print the occurrence
			 */
			if (str.charAt(i) == array[j])  
				flag++;                 
		   } 

		   if (flag == 1)  
		      System.out.println("Occurrence of char " + str.charAt(i)
			 + " in the String is:" + counter[str.charAt(i)]);             
		} 
	        
	        String someString = "elephant";
	        long count = someString.chars().filter(ch -> ch == 'e').count();
	        assertEquals(2, count);
	        System.out.println("Count=" +count);
		
	}



	private static void SWAPNos() {
		 int x=10, y=20;
		 int t;
		 t=x;
		 x=y;
		 y=t;
	    System.out.println("After swapping: "+x +"   " + y); 
	    
	    //Below Code with out using the third variable  
	      x = x + y;
	      y = x - y;
	      x = x - y;
      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
  }



	private static void SumOfDigits() {
		int number = 1236, digit, sum = 0;
			while(number > 0)  
			{  
			//finds the last digit of the given number    
			digit = number % 10;  
			//adds last digit to the variable sum  
			sum = sum + digit;  
			//removes the last digit from the number  
			number = number / 10;  
			}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);  
		
	}



	private static void FibonacciSeries() {
		 
		int num=10, a = 0,b=0, c =1;
        //Scanner in = new Scanner(System.in);
       // System.out.println("Enter the number of times");
       // num = in.nextInt();
        System.out.println("Fibonacci Series of the number is:");
        for (int i=0; i<num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + "");    //if you want to print on the same line, use print()
        }       
	}



	private static void NumberPalindrome(int xyz) {
		
		  int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  temp=n;    

		  while(n>0){    
		   r=n%10;  //getting remainder  
		   n=n/10;
		   sum=(sum*10)+r;     
		  }    

		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		 
		  String text ="Hello";
		  String clean = text.replaceAll("\\s+", "").toLowerCase();
		    StringBuilder plain = new StringBuilder(clean);
		    StringBuilder reverse = plain.reverse();
		    
		    if((reverse.toString()).equals(clean))
		    	System.out.println("Palindrome");
		    else
		    	System.out.println("NOT -a- Palindrome");
		
	}



	private static void PrimeNumbers(int s1, int s2) {
		int flag = 0;
		System.out.println ("The prime numbers in between the entered limits are :");
        for(int i = s1; i <= s2; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                 flag = 0;
                    break;
                }
                else
                {
                  flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
        
        //To Check number is prime or not
        int temp, num=5;
        boolean isPrime = true;
       // Scanner in = new Scanner(System.in);
        //num = in.nextInt();
        //in.close();
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(num + "number is prime");
            else
                System.out.println(num + "number is not a prime");
             
         
		
	}



	private static String removeDup(String str2) {
		 
		String strNoDup = "";

	    // loop over string and get each char
	    for(char ch : str2.toCharArray()) {
	      // if strNoDup does not contain char then add to it
	      if(!strNoDup.contains(String.valueOf(ch))) {
	        strNoDup += ch;
	      }
	    }

	    return strNoDup;
	}



	private static int secMax(int numArr[]) {
	    Arrays.sort(numArr);
       // return one before last. Array is soreted from smallest to biggest
	    return numArr[numArr.length-2];
	    
	   //Second Min
	   //return numArr[1];
		
	}



	private static int[] ReverseArray(int[] arrNum) {
	
		int j = arrNum.length - 1;

	    // our loop will go till half of our input array
	    // 'i' is a pointer that will start from the beginning
	    for(int i = 0; i < arrNum.length / 2; i++) {
	      // swap elements using positions of i and (j - i)
	      int tmp = arrNum[i];
	      arrNum[i] = arrNum[j - i];
	      arrNum[j - i] = tmp;
	      //System.out.println(arrNum[i]);
	    }
		return arrNum;
		
	}







	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
	
	
	
	
}
