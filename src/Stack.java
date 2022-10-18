public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full!!!");
        } else {
            System.out.println("Inserting: " + x);
            arr[++top]=x;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!!!");
        } else{
            System.out.println("Top of stack is: " + arr[top]);
            top--;
        }
    }
}

class checkStack{
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            stack.pop();
        }

    }
}
