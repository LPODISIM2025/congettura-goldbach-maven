package it.univaq.disim.lpo25.generics;

public class StackRunner {
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());  // Output: 3
        System.out.println(stack.pop());   // Output: 3
        System.out.println(stack.size());  // Output: 2
    }

}
