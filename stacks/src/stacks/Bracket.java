package stacks;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Bracket {
	public static void main(String[] args) {
		Stack<Character> bList = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String target = sc.next();
		char[] array = target.toCharArray();
		if(!checkValidity(array, bList))
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}

	private static boolean checkValidity(char[] array, Stack<Character> bList) {
		// TODO Auto-generated method stub
		for(char c:array) {
			if(c=='('||c=='['||c=='{')
				bList.add(c);
			if(c==')') {
				if(bList.peek()=='(')
				{
					bList.pop();
				}
				else {
					return false;}
			}
			if(c=='}') {
				if(bList.peek()=='{')
				{
					bList.pop();
				}
				else
				{
					return false;}
			}
			if(c==']') {
				if(bList.peek()=='[')
				{
					bList.pop();
				}
				else
				{
					return false;}			}
		}
		return true;
	}

}


