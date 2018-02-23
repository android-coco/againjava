package com.yh.demo;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int x = -1193959466;
		System.out.println(~x == (Math.abs(x) - 1));
		Random random1 = new Random(100);
		System.out.println(random1.nextInt());
		System.out.println(random1.nextInt());
		int[] y = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(binarySearch(y, y.length, 6));

		ok: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 2) {
					break ok;
				}
			}
		}

		boolean isBreak = false;
		for (int i = 0; i < 10 && !isBreak; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 2) {
					isBreak = true;
				}
			}
		}
	}

	static int binarySearch(int[] array, int size, int value) {
		int lo = 0;
		int hi = size - 1;

		while (lo <= hi) {
			final int mid = (lo + hi) >>> 1;
			final int midVal = array[mid];

			if (midVal < value) {
				lo = mid + 1;
			} else if (midVal > value) {
				hi = mid - 1;
			} else {
				return mid; // value found
			}
		}
		return ~lo; // value not present
	}
}
