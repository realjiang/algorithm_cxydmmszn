package _1stack_queue._5_sort_stack_by_stack;

import java.util.Stack;

public class SortStackByStack {
    /**从小到大排列*/
    public static void sortStackByStack1(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.empty()) {
            int cur = stack.pop();
            while (!help.empty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.empty()) {
            stack.push(help.pop());
        }
    }
    /**从大到小排列*/
    public static void sortStackByStack2(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        if (!stack.empty()) {
            int cur = stack.pop();
            while (!help.empty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.empty()) {
            stack.push(help.pop());
        }
    }
}
