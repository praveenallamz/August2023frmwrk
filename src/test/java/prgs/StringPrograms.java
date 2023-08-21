package prgs;
//https://www.javatpoint.com/java-programs#java-string-programs

public class StringPrograms {

	public static void main(String[] args) {
		 
		//[1]<--------Reverse String , Remove White spaces, Replace white spaces && Remove Duplicates from String------------->
		StringReverseFunc();
		
		String str = "Geeks for Geeks";
		StringPrograms obj = new StringPrograms();
        System.out.print("<--1-->Reverse String Using Recursive function:");
        obj.reverse(str); 
		
		//[2]<-----Count Total no of characters in a string , count no-of-words in a string
		StringsCount();
		
		//[3]<-----Vowel and constant count-------->
		 CountVowelConsonant();
		 
		//[4]<-----Swap Two Strings Without using third or temp variable--------------->
		 SwapTwoStringd();
		 
		//[5]<-----To Find Duplicate characters && Duplicate words in a string------------->
		 DuplicateCharacters();
		 
		//[6]<-----To Find Frequency/occurance of characters and given character , MAX && MIN occurance--------------------->
		 FrequencyCharacter();
		 
		//[7]<-----To Find given string is palindrome------------------->
		 PalindromeString();
		
		  
		 
		 
		 
	}

	 

	private void reverse(String str) {
		//If the string is null or consists of single character
        //then print the entered string 
        if ((str==null)||(str.length() <= 1)) 
           System.out.print(str); 
        else
        { 
            //If string consists of multiple strings
            System.out.print(str.charAt(str.length()-1)); 
            //Call the function recursively to reverse the string
            reverse(str.substring(0,str.length()-1)); 
        }         
	}



	private static void PalindromeString() {
		 String string = "Kayak";    
	        boolean flag = true;    
	            
	        //Converts the given string into lowercase    
	        string = string.toLowerCase();    
	            
	        //Iterate the string forward and backward, compare one character at a time     
	        //till middle of the string is reached    
	        for(int i = 0; i < string.length()/2; i++){    
	            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
	                flag = false;    
	                break;    
	            }    
	        }    
	        if(flag)    
	            System.out.println("Given string is palindrome");    
	        else    
	            System.out.println("Given string is not a palindrome");    
	   		
	}

	private static void FrequencyCharacter() {
		 String str = "picture perfect";    
	        int[] freq = new int[str.length()];    
	        int i, j;    
	            
	        //Converts given string into character array    
	        char string[] = str.toCharArray();    
	            
	        for(i = 0; i <str.length(); i++) {    
	            freq[i] = 1;    
	            for(j = i+1; j <str.length(); j++) {    
	                if(string[i] == string[j]) {    
	                    freq[i]++;    
	                        
	                    //Set string[j] to 0 to avoid printing visited character    
	                    string[j] = '0';    
	                }    
	            }    
	        }    
	            
	        //Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(i = 0; i <freq.length; i++) {    
	            if(string[i] != ' ' && string[i] != '0')    
	                System.out.println(string[i] + "-" + freq[i]);    
	        }    
	        
	        //Occurence of Given Character
	       String s = "Java is java again java again";
	       char c = 'a';
	       int count = s.length() - s.replace("a", "").length();
	       System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	       
	       
	       //MAX && MIN Occurance of character
	       String str1 = "grass is greener on the other side";  
	        int[] freq1 = new int[str1.length()];  
	        char minChar = str1.charAt(0), maxChar = str1.charAt(0);  
	        int i1, j1, min, max;          
	          
	        //Converts given string into character array  
	        char string1[] = str1.toCharArray();  
	          
	        //Count each word in given string and store in array freq  
	        for(i1 = 0; i1 < string1.length; i1++) {  
	            freq1[i1] = 1;  
	            for(j1 = i1+1; j1 < string1.length; j1++) {  
	                if(string1[i1] == string1[j1] && string1[i1] != ' ' && string1[i1] != '0') {  
	                    freq1[i1]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string1[j1] = '0';  
	                }  
	            }  
	        }  
	          
	        //Determine minimum and maximum occurring characters  
	        min = max = freq1[0];  
	        for(i1 = 0; i1 <freq1.length; i1++) {  
	              
	            //If min is greater than frequency of a character   
	            //then, store frequency in min and corresponding character in minChar  
	            if(min > freq1[i1] && freq1[i1] != '0') {  
	                min = freq1[i1];  
	                minChar = string1[i1];  
	            }  
	            //If max is less than frequency of a character   
	            //then, store frequency in max and corresponding character in maxChar  
	            if(max < freq1[i1]) {  
	                max = freq1[i1];  
	                maxChar = string1[i1];  
	            }  
	        }  
	          
	        System.out.println("Minimum occurring character: " + minChar);  
	        System.out.println("Maximum occurring character: " + maxChar);  
	   
	  }

	private static void DuplicateCharacters() {
		 String string1 = "Great responsibility";    
	        int count;    
	            
	        //Converts given string into character array    
	        char string[] = string1.toCharArray();    
	            
	        System.out.println("Duplicate characters in a given string: ");    
	        //Counts each character present in the string    
	        for(int i = 0; i <string.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j <string.length; j++) {    
	                if(string[i] == string[j] && string[i] != ' ') {    
	                    count++;    
	                    //Set string[j] to 0 to avoid printing visited character    
	                    string[j] = '0';    
	                }    
	            }    
	            //A character is considered as duplicate if count is greater than 1    
	            if(count > 1 && string[i] != '0')    
	                System.out.println(string[i]);    
	        }    
	        
	        
	        //Duplicate words in a string
	        String string11 = "Big black bug bit a big black dog on his big black nose";    
	        int count1;    
	            
	        //Converts the string into lowercase    
	        string11 = string11.toLowerCase();    
	            
	        //Split the string into words using built-in function    
	        String words[] = string11.split(" ");    
	            
	        System.out.println("Duplicate words in a given string : ");     
	        for(int i = 0; i < words.length; i++) {    
	            count1 = 1;    
	            for(int j = i+1; j < words.length; j++) {    
	                if(words[i].equals(words[j])) {    
	                    count1++;    
	                    //Set words[j] to 0 to avoid printing visited word    
	                    words[j] = "0";    
	                }    
	            }    
	                
	            //Displays the duplicate word if count is greater than 1    
	            if(count1 > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
	        }    
	        
	}

	private static void SwapTwoStringd() {
		String str1 = "Good ", str2 = "morning ";    
        System.out.println("<--4-->Strings Before swapping: " + str1 + " " + str2);    
       
       //Concatenate both the string str1 and str2 and store it in str1    
       str1 = str1 + str2;    
       //Extract str2 from updated str1    
       str2 = str1.substring(0, (str1.length() - str2.length()));    
       //Extract str1 from updated str1    
       str1 = str1.substring(str2.length());    
           
       System.out.println("<--4-->Strings after swapping: " + str1 + " " + str2);    
		
	}

	private static void CountVowelConsonant() {
		//Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String str = "This is a really simple sentence";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("<--3-->Number of vowels:" + vCount);    
        System.out.println("<--3-->Number of consonants:" + cCount);    
   	}

	private static void StringsCount() {
		String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("\n<--2-->Total number of characters in a string:" + count);  
        
        //count the number of words in a string
        String s="Hello World Good Joob";
        String[] words = s.trim().split(" ");
        System.out.println("<--2-->Number of words in the string = "+words.length);
        
 }

	private static void StringReverseFunc() {
		// TODO Auto-generated method stub
        String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println("<--1--> Using Builder Function:-->" +str2);
       
       //Using String Buffer
       StringBuffer sbf = new StringBuffer("MyJava");
       System.out.println("<--1-->Using String Buffer:-->" +sbf.reverse());     
       
       //reverse a string without using String inbuilt function reverse()
       String str1 = "Hello World";
       char chars[] = str1.toCharArray();  // converted to character array and printed in reverse order
       System.out.print("<--1--> Without Builder Function:--->");
       for(int i= chars.length-1; i>=0; i--) {
           System.out.print(chars[i]);
       }
       
       //With for loop
     String  s="Crazy World";                    //reading string from user  
     System.out.print("\n<--1--> With For Loop:--->" );  
       for(int i=s.length();i>0;--i)                //i is the length of the string  
       {  
       System.out.print(s.charAt(i-1));            //printing the character at index i-1  
       }  
       System.out.println("\n");
       
        //REMOVE WHITE SPACES
	   	String inputString ="Golden gates are open accross the times";
	   	String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
	   	System.out.println("<--1-->" +stringWithoutSpaces);
	   	
	    //Replace WHITE SPACES with other character
	    String string = "Once in a blue moon";  
        char ch = '-';  
       //Replace space with specific character ch  
        string = string.replace(' ', ch);  
           System.out.println("String after replacing spaces with given character: ");  
        System.out.println(string);  

	   	// Remove Duplicates from the string   	
	   	String string1 = "Great responsibility";  
        int count;  
          
        //Converts given string into character array  
        char stringg[] = string1.toCharArray();  
        System.out.println("<--1-->Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <stringg.length; i++) {  
            count = 1;  
            for(int j = i+1; j <stringg.length; j++) {  
                if(stringg[i] == stringg[j] && stringg[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    stringg[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && stringg[i] != '0')  
                System.out.println(stringg[i]);  
        }  
    }  
	   	
	

}
