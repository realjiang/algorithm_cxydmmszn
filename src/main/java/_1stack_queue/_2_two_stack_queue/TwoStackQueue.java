package _1stack_queue._2_two_stack_queue;

import java.util.Stack;

/**
 * 标题: 用两个栈实现队列,支持队列的基本操作(add,poll,peek)
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/25 10:18
 */
public class TwoStackQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    //push栈向pop栈倒入数据
    private void pushToPop() {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    //入队
    private void add(int pushInt) {
        stackPush.push(pushInt);
        pushToPop();
    }

    //出队
    private int poll() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.pop();
    }

    //查看下一个出队的元素
    public int peek() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stackPop.peek();
    }
}
