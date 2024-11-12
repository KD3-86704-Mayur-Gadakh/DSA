package com.sunbeam;

import java.util.Stack;

public class Assignment3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {54,48,57,52,21,38};
Stack<Integer> stk=new Stack<Integer>();
//System.out.println(arr.length);
int count=0;
for(int i=0;i<arr.length;i++) {
	stk.push(arr[i]);
//	count++;
	
}
//System.out.println("size"+stk.size());

for(int i=0;i<arr.length;i++) {
	System.out.print(" "+stk.pop()); 
	
}

//System.out.println("count"+count);
//System.out.println("size"+stk.size());
	}

}
