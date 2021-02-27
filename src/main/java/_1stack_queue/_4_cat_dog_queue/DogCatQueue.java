package _1stack_queue._4_cat_dog_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 标题: 猫狗队列
 *
 * 思想: 一个猫队列,一个狗队列,猫的从猫队出,狗的从狗队出,
 * 宠物的比较下一个狗和猫的时间戳,小的出队(因为先进先出,时间戳小的先出)
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/26 17:57
 */
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<>();
        this.catQ = new LinkedList<>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            this.dogQ.add(new PetEnterQueue(pet, this.count++));
        } else if (pet.getPetType().equals("cat")) {
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        } else {
            throw new RuntimeException("err,not dog or cat");
        }
    }

    public Pet pollAll() {
        if (!this.isDogQEmpty() && !this.isCatQEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!this.isDogQEmpty()) {
            return dogQ.poll().getPet();
        } else if (!this.isCatQEmpty()) {
            return catQ.poll().getPet();
        } else {
            throw new RuntimeException("err,queue is empty!");
        }
    }

    public Dog pollDog() {
        if (!this.isDogQEmpty()) {
            return (Dog) this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("Dog queue is empty!");
        }
    }

    public Cat pollCat() {
        if (!this.isCatQEmpty()) {
            return (Cat) this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("Cat queue is empty!");
        }
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatQEmpty() {
        return this.catQ.isEmpty();
    }
}
