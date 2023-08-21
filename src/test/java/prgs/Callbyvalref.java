package prgs;

public class Callbyvalref {

	int data=50;  
	  
	 void change(Callbyvalref op){  
	 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	 
	 void change1(int data){  
		 data=data+100;//changes will be in the local variable only  
		 }  
	     
	    
	 public static void main(String args[]){  
	   Callbyvalref op=new Callbyvalref();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	   
	   System.out.println("=-=-=-=-=-=-=-=-=-=Below Call By Value=-=-=-=-=-=-=-=-=");
	   Callbyvalref op1=new Callbyvalref();  
 	   System.out.println("before change "+op1.data);  
	   op.change1(500);  
	   System.out.println("after change "+op1.data);  
	  
	 }   
}
