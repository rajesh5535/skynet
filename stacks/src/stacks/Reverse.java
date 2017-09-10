package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		Stack<Integer> bList = new Stack<>();
		bList.push(1);
		bList.push(2);
		bList.push(3);
		bList.push(4);
		bList.push(5);

		System.out.println(bList);
		reverse(bList);
		System.out.println(bList);
	}

	private static Stack<Integer> reverse(Stack<Integer> bList) {
		int x = 0;
		if (bList == null)
			return null;
		if (!bList.isEmpty()) {
			x = bList.pop();
			reverse(bList);
			bList.add(0, x);
		}
		return null;
	}
}
