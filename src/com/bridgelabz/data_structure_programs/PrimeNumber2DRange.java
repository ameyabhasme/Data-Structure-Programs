package com.bridgelabz.data_structure_programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber2DRange {
	
	public boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber2DRange primeNumber2D = new PrimeNumber2DRange();
		int start = 0, end = 100, arraySize = 0;
		List<Integer> primeList;
		Integer[][] primeNumber = new Integer[10][];
		
		for (int i = 0; i < 10; i++) {
			primeList = new ArrayList<>();
			for (int j = start; j <= end; j++) {
				if (primeNumber2D.isPrime(j)) {
					primeList.add(j);
					arraySize++;
				}
			}
			primeNumber[i] = primeList.toArray(new Integer[arraySize]);
			System.out.println(primeNumber[i].length);
			for (Integer item : primeNumber[i]) {
				System.out.print(item + "  ");
			}
			System.out.println("\n");
			start = end + 1;
			end += 100;
			arraySize = 0;
		}
	}
}
