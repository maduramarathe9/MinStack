package minStack;
import java.util.Stack;

public class MinStack {

    Stack<Long> stk ;
    long min;

    public MinStack(){
        stk = new Stack();
    }

    public void push(int x){
        if(stk.isEmpty()){
            stk.push(0L);
            min=x;
        }
        else{
            stk.push(x-min);
            if(x<min){
                min=x;
            }
        }
    }

    public void pop(){
        long x = stk.pop();
        if(x<0){
            min = min-x;
        }

    }

    public int top(){
        if(stk.peek() > 0L){
            return (int)(stk.peek()+min);
        }
        else {
            return (int)(min);
        }
    }

    public int getMin(){
        return (int)(this.min);

    }

}
