// Kushagra Bansal
// E19CSE001

import java.util.*;
public class NewSort {
	public static void selectionSort(int[] arr){  
		
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index])
                {  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int N=input.nextInt();
		
		System.out.println("Enter the values in array");
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++) 
		{
			arr[i]=input.nextInt();
		}
		 
        System.out.println("Before Selection Sort");  
        for(int i:arr)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr);
         
        System.out.println("After Selection Sort");  
        for(int i:arr)
        {  
            System.out.print(i+" ");  
            }  
        }
	}
