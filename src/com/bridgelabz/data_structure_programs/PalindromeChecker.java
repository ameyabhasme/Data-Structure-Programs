package com.bridgelabz.data_structure_programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeChecker {

	static final Scanner in = new Scanner(System.in);
	static Queue<Character> queue = new LinkedList<>();

	public static void main(String[] args) {

		System.out.print("Enter string to check Palindrome: ");
		String inputString = in.next();

		for (int i = inputString.length() - 1; i >= 0; i--) {
			queue.add(inputString.charAt(i));
		}

		String reverseString = "";

		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (inputString.equals(reverseString))
			System.out.println("The input String is a palindrome.");
		else
			System.out.println("The input String is not a palindrome.");

	}
}
