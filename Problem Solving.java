//------Question 1-----
// 1. Write a recursive function that returns the nth Fibonacci number.

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;


public class Main
{
	public static void main (String[] args) 
	{
   fib(8);
  }
public static int fib(int n)
    {
       if (n==1)
           return 0;
        else if (n==2)
            return 1; 
        else return fib(n-1)+fib(n-2);
	}
//--------Question2----------
//2. Store the generated list of N numbers and sort them by reverse lexical order.
  
  
  	//FibArray[] is array of intergers to store the values of fib(n)
    int [] FibArray= new int[n];	
    int i=0;
    while (i<n){  		         
			FibArray[i]=fib(i+1);
			i=i+1;}
		
  //Converting interger array to array of Strings		
String StrArray []= new String[FibArray.length];
for (int j=0; j<FibArray.length; j++){
		StrArray[j]=String.valueOf(FibArray[i]);
	}
//Sorting the string array, StrArray to reverse lexical order

Arrays.sort(StrArray, Collections.reverseOrder());
	System.out.println(Arrays.toString(StrArray));
}


//--------Question 3---------
//3. Implement an algorithm to determine if a string has all unique characters.  What if you cannot use additional data structures?

class Unique{

    public static boolean checkChar( String s) {

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < i; j++)

             if (s.charAt(i) == s.charAt(j)) return false;

         }

         return true; 

    }



    public static void main(String[] args) {

        String s = "helo";

        System.out.println("The string is " + s);

        if (checkChar(s)) System.out.println("All Characters are unique");

        else System.out.println("Duplicated Values Exist");

        return;

    }

}

//------Question 4------
//4. Implement an algorithm to find the kth to last element of a singly linked list.


Class FindK{
	
	public static void main(String[] args) {

		public kthToTheLastLast(int k)

//while loop removes (k-1) elements after the kth element
		int i=0;
		while(i<k-1){
	
	//removing k-1 elements from the last element
			list.pop();
			return k;
			i+1;
			}

			}

}				
//-------Question5--------
//5.  Write a program to sort a stack such that the smallest items are on the top.  You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as an array).  The stack supports the following operations: push, pop, peek and isEmpty.


import java.util.ListIterator; 
import java.util.Stack; 
  
class Sorter 
{ 
    static void sortedInsert(Stack<Integer> s, int x) 
    { 
        
        if (s.isEmpty() || x > s.peek()) 
        { 
            s.push(x); 
            return; 
        } 
       
        // If top is greater, removing the top item and recurring  
       			 int temp = s.pop(); 
        		 sortedInsert(s, x); 
       
        // Adding back the top item removed earlier 
       			 s.push(temp); 
    } 
       
    // Method to sort stack 
    static void sortStack(Stack<Integer> s) 
    { 
        // If stack is not empty 
        if (!s.isEmpty()) 
        { 
            // Removing the top item 
            int x = s.pop(); 
       
            // Sorting remaining stack 
            sortStack(s); 
			
			  // Pushing the top item back in sorted stack 
            sortedInsert(s, x); 
        } 
    } 
      
    // Utility Method to print contents of stack 
    static void printStack(Stack<Integer> s) 
    { 
       ListIterator<Integer> lt = s.listIterator(); 
         
       // forwarding 
       while(lt.hasNext()) 
           lt.next(); 
         
       // printing from top to bottom 
       while(lt.hasPrevious()) 
       System.out.print(lt.previous()+" "); 
    } 
    
    // Driver method  
    	public static void main(String[] args)  
    { 
      	Stack<Integer> s = new Stack<>(); 
        s.push(5); 
        s.push(-5); 
        s.push(8); 
        s.push(94); 
        s.push(-73); 
       
        System.out.println("Stack elements before sorting: "); 
        printStack(s); 
       
        sortStack(s); 
       
        System.out.println(" \n\nStack elements after sorting:"); 
        printStack(s); 
       
    } 
} 
		
