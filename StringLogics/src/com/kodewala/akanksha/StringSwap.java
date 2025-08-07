package com.kodewala.akanksha;

public class StringSwap {

	public static void main(String[] args) {
		String str = "rahul";
		
		char ch[] = str.toCharArray();
		
		char ch1 = ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1] =ch1;
		
		System.out.println(ch);
	}

}
