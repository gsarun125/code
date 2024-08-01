package learn.DSA.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack nums=new Stack();
        nums.push(15);
        nums.push(16);
        nums.push(19);
        System.out.println("cc"+nums.pop());
        nums.show();
        System.out.println(nums.peek());

    }
    
}
