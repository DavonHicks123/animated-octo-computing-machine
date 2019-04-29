package inheritance;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clint4 {

	String[] family= {"Father","Son","Son2"};

	 public static void selectionSort(String[]family)
	 {
	    
	    // Find the string reference that should go in each cell of
	    // the array, from cell 0 to the end
	    for (int j=0; j<family.length-1;j++)
	    {
	      // Find min: the index of the string reference that should go into cell j.
	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
	      int min=j;
	      for(int k=j+1;k<family.length;k++)
	        if(family[k].compareTo(family[min])<0)
	        	min=k;  

	      // Swap the reference at j with the reference at min 
	     String temp=family[j];
	      family[j]=family[min];
	      family[min]=temp;
	    }
	 }
	  

	public static void main(String[] args){  
	 
	    System.out.println();
	    
	    
		String Father = "Joe";
		Father Joe = new Father("black", "black", "sports", "girls");
		System.out.println("" + Father);
		System.out.println(Joe.getskin());
		System.out.println(Joe.geteyes());
		System.out.println(Joe.getabilities());
		System.out.println(Joe.getinterest());

		// System.out.println(Joe.toString());
		System.out.println();
		String Son = "Dan";
		Son Dan = new Son("sports", "black", "black","subjects","girls");
		System.out.println(Son);
		System.out.println(Dan.getskin());
		System.out.println(Dan.getinterest());
		System.out.println(Dan.getCapabilities());
		System.out.println(Dan.getWeaknesses());
		System.out.println(Dan.geteyes());
;

		// System.out.println(Dan.toString());
		System.out.println();
		String Son2 = "Earl";
		Son2 Earl = new Son2("black","black","sports", "girls");
		System.out.println(Son2);
		System.out.println(Earl.getskin());
		System.out.println(Earl.geteyes());
		System.out.println(Earl.getabilities());
		System.out.println(Earl.getinterest());
		// System.out.println(Earl.toString());
		
		System.out.println();
		String[] family= {"Father","Son","Son2"};
		   // print out the array
	    System.out.print("Before:");
	    for(String str:family)
	      System.out.print(str+",");
	    System.out.println();
	    
	    // sort the array
	   selectionSort(family);
	    System.out.println();
	 // print out the array
	    System.out.print("After:");
	    for(String str:family)
	      System.out.print(str+",");
	    System.out.println();
	 
	    System.out.println();
	
			
	
	    Father[] family1={new Father("black","black","sports","girls"),new Son("sports","black","black","subjects","girls"),new Son2("black","black","sports","girls")};
		for (int i = 0; i < family1.length; i++) {
			System.out.println(family1[i].getabilities());
			System.out.println(family1[i].geteyes());
			System.out.println(family1[i].getskin());
			System.out.println("///////////////////////////////////////////");
		}
		
	} 

}

