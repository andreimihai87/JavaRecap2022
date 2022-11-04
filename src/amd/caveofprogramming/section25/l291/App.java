package amd.caveofprogramming.section25.l291;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Write a program that ask the user to enter numbers -- as many as they like, one by one.
 * To stop entering numbers, the user types "stop".
 * The program then displays all the numbers the user entered from smallest to largest;
 * it also tells them the average value of all the numbers.
 * If they enter something that isn't a number, it prints, "invalid number" and carries on.
 */

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();

		Scanner scanner1 = new Scanner(System.in);

		boolean flag = true;

		do {
			System.out.print("Enter a number or stop > ");
			String line = scanner1.nextLine();
			if (line.equalsIgnoreCase("stop")) {
				flag = false;
			} else {
				try {
					Integer number = Integer.parseInt(line);
					intList.add(number);
				} catch (Exception e) {
					System.err.println("Invalid integer number");
				}
			}

		} while (flag);

		if (intList.size() > 0) {
			Collections.sort(intList);

			int total = 0;
			for (Integer num : intList) {
				System.out.printf("%d ", num);
				total += num;
			}
			double average = (1.0 * total) / intList.size();
			System.out.println();
			System.out.printf("The average is: %.2f", average);

		} else {
			System.out.println("No numbers!");
		}
		scanner1.close();

	}

}
