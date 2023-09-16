package org.shop;

import java.util.ArrayList;
import java.util.List;

public class _Test {

    public static void main(String[] args) {

	int[] arr = { 2, 5, 8, 11, 13, 19 };

	int[] output = new int[arr.length];

	int k = 0;

	for (int i = 0; i < arr.length - 2; i++) {
	    int sum = arr[i + 2];// sum=8

	    if (arr[i] + arr[i + 1] == sum) {

		output[k] = arr[i];
		output[k++] = arr[i + 1];

	    }

	}

	for (int i = 0; i < k; i++) {
	    System.out.println(output[i]);
	}

	// Adding of list
	List<String> li = new ArrayList<>();
	li.add("a");
	li.add("b");
	li.add("c");
	li.add("d");
	li.add("e");

	// Iterating the list
	for (int i = 0; i < li.size(); i++) {
	    String string = li.get(i);
	    System.out.println(string);
	}

	// Reverse of code
	String str = "java programm";
	String out = "";
	String[] split = str.split(" ");
	for (String s : split) {
	    for (int i = s.length() - 1; i >= 0; i--) {
		char c = s.charAt(i);
		out = out + c;
	    }
	    out = out + " ";
	}

	System.out.println(out);

    }

}
