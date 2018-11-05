/**
 * 
 */
package com.kishore.anant.string;

import java.util.Arrays;

/**
 * @author Anant Kishore
 *
 */
public class ShiftLeftRightString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getShiftedString("abcd", 1, 2);
	}

	public static String getShiftedString(String s, int leftShifts, int rightShifts) {
		if (s != null && s.length() > 0) {
			char[] arr = s.toCharArray();
			int len = arr.length;
			char[] temp = new char[len];

			if (leftShifts >= len) {
				leftShifts = leftShifts % len;
			}
			if (leftShifts > 0) {

				for (int i = 0; i < leftShifts; i++) {
					temp[i] = arr[i];
				}
				for (int i = leftShifts; i < len; i++) {
					arr[i - leftShifts] = arr[i];
				}
				for (int i = len - leftShifts, j = 0; i < len && j < leftShifts; i++, j++) {
					arr[i] = temp[j];
				}
			}
			if (rightShifts >= len) {
				rightShifts = rightShifts % len;
			}
			if (rightShifts > 0) {

				for (int i = rightShifts; i < len; i++) {
					temp[i] = arr[i];
				}
				for (int i = len - 1; i >= rightShifts; i--) {
					arr[i] = arr[i - rightShifts];
				}
				for (int i = rightShifts - 1, j = len - 1; i >= 0 && j >= rightShifts; i--, j--) {
					arr[i] = temp[j];
				}
			}
			return new String(arr);
		}
		return s;
	}

}
