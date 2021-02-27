package _1stack_queue._3_reverse_stack;

import java.util.Stack;

/**
 * 标题: 递归函数实现栈的逆序
 *
 * 方案:两个递归函数,一个移除并返回栈底元素,另一个基于该函数进行逆序
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/26 13:54
 */
public class ReverseStack {
    public static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }
}
