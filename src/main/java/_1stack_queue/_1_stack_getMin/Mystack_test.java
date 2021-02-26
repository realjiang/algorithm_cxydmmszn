package _1stack_queue._1_stack_getMin;

import java.util.Stack;

/**
 * 标题: 实现栈,以及获取最小值
 * 复习
 * 要点  用两个栈  一个实现进出栈,一个存放最小值 栈顶为最小值
 * 两个方案
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/26 9:31
 */
public class Mystack_test {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Mystack_test() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push1(int pushNum) {
        if (this.stackMin.empty()) {
            this.stackMin.push(pushNum);
        } else if (pushNum <= this.getMin()) {
            this.stackMin.push(pushNum);
        }
        this.stackData.push(pushNum);
    }

    public void push2(int pushNum) {
        if (this.stackMin.empty()) {
            this.stackMin.push(pushNum);
        } else if (pushNum <= this.getMin()) {
            this.stackMin.push(pushNum);
        }
        this.stackMin.push(this.getMin());
        this.stackData.push(pushNum);
    }

    public int pop1() {
        if (this.stackData.empty()) {
            throw new RuntimeException("your this.stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()) {
            this.stackMin.pop();
        }
        return value;
    }
    public int pop2() {
        if (this.stackData.empty()) {
            throw new RuntimeException("your this.stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getMin() {
        if (this.stackMin.empty()) {
            throw new RuntimeException("your stack is empty");
        }
        return this.stackMin.peek();
    }
}
