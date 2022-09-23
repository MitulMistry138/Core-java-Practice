/*
Program :-Java Program to Sort an Array in Descending Order
@author :- Mitul Mistry	
Date:-  25-08-2022
*/

import java.util.Scanner;   // importing scanner class

class DescendingOrder
{
    public static void main(String ...args)
    {
        Scanner sc=new Scanner(System.in);   // Creating  scanner class 
        int n;    
        System.out.println("Enter the number :");        // taking input from user
        n=sc.nextInt();    
        
        Integer arr[]=new Integer[n];    
        System.out.println("Enter the arrays:");         //taking input from user 
        for(int a=0;a<n;a++)    
        {
            arr[a]=sc.nextInt();
        }
        
        int temp = 0;    //Temporary variable to store the element
        
         for (int a = 0; a < arr.length; a++)   
         {     
            for (int b = a+1; b < arr.length; b++)    
            {     
               if(arr[a] < arr[b]) //Compare and swap
               {    
                   temp = arr[a];    
                   arr[a] = arr[b];    
                   arr[b] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //output of descending elements   
        System.out.println("Elements of array sorted in descending order: ");    
        for (int a = 0; a < arr.length; a++) 
        {     
            System.out.print(arr[a] + " ");    
        }    
    }
}
