public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        stack[top] = data;
        top++;
    }
    public void pop(){
        top--;
        stack[top] = 0;
    }
    public int peek(){
        top--;
        return stack[top];
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public void  show(){
        for(int n:stack){
            System.out.print(n +" ");
        }
    }
}
