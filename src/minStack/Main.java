package minStack;

public class Main {
    public static void main(String[] args){
        MinStack mstk = new MinStack();
        mstk.push(10);
        mstk.push(30);
        System.out.println("top is "+mstk.top());
        System.out.println("min is "+mstk.getMin());
        mstk.push(5);
        mstk.push(1);
        System.out.println("top is "+mstk.top());
        System.out.println("min is "+mstk.getMin());
        mstk.pop();
        System.out.println("top is "+mstk.top());
        System.out.println("min is "+mstk.getMin());
        mstk.pop();
        System.out.println("top is "+mstk.top());
        System.out.println("min is "+mstk.getMin());
        mstk.getMin();

    }

}
