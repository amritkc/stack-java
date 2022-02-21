public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(15);
        stack.pop();
        System.out.println("Peek:" + stack.peek());
        System.out.println("Size of Stack:" + stack.size());
        System.out.println("Stack is Empty: " + stack.isEmpty());
        stack.show();
    }
}
