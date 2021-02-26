package _1stack_queue._4_cat_dog_queue;

/**
 * 标题: 宠物进队列
 *
 * @Author: Jiang yuting
 * @Date: 2021/2/26 17:47
 */
public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {
        return this.count;
    }

    public String getEnterPetType() {
        return this.pet.getPetType();
    }
}
