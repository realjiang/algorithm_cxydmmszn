package _1stack_queue._1_stack_getMin;

import java.util.Stack;

/**
 * 标题: 实现一个有getMin功能的栈
 *
 *  方案二: pop、push、getMin的操作复杂度都是O(1)
 *  stackMin压入时稍费空间,弹出操作稍省时间
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/23 10:50
 */
public class Mystack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Mystack2() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push (int newNum) {
        if (this.stackMin.empty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getmin()) {
            this.stackMin.push(newNum);
        } else {
            int newMin = this.stackMin.peek();
            stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.empty()) {
            throw new RuntimeException("Your stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getmin() {
        if (this.stackMin.empty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.peek();
    }
}
