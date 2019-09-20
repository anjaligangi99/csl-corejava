package com.scb.algorithum;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
		 int arr[] = { 2, 3, 4, 10, 40 }; 
		 
		System.out.println(arr.length-1);
		 int n = arr.length;
		 int x =40;
		 int result = binarySearch(arr, 0,n-1, x); 
		 if (result==-1) 
			 System.out.println("Element Not found");
		 else 
			 System.out.println("Element Found at"+result);	}

	
	public static int binarySearch(int[] arr,int l,int r,int x) {
		
		if (l<=r) {
			int mid = l+(r-l)/2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid]>x)
				return binarySearch(arr, mid-1, r, x);
			return binarySearch(arr, mid+1, r, x);
		}
	  return -1;	
	}
}
