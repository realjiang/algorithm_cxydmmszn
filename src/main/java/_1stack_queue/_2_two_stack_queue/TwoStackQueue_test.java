package _1stack_queue._2_two_stack_queue;

import java.util.Stack;

/**
 * 标题: 两个栈实现队列   add,poll,peek  + 倒入函数
 * 要点  一个栈 往另一个栈倒数据  顺序就对了
 * 1.只有pop栈 为空  才能倒入
 * 2.倒入时要一次性把push栈中的 全部倒入 pop
 * 3.push 和 pop 都为空 队列才为空
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/26 10:50
 */
public class TwoStackQueue_test {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue_test() {
        this.stackPush = new Stack<>();
        this.stackPop = new Stack<>();
    }

    public void pushToPop() {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int addNum) {
        stackPush.push(addNum);
        pushToPop();
    }

    public int poll() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("your queue is empty!");
        }
        pushToPop();
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("your queue is empty!");
        }
        pushToPop();
        return stackPop.peek();
    }
}
