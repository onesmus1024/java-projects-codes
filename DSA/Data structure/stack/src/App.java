class stack{
    public int items[];
    public int top;
    public int capacity;

    stack(int size)
    {
        items = new int[size];
        top = -1;
        this.capacity = size;

    }
    boolean IsEmpty(){
        return top == -1;
    }
    boolean IsFull(){
        return top == capacity-1;
    }
    void push(int element){
        if(IsFull()){
            System.out.println("THE STACT IS FULL");
            System.exit(1);
        }
        else{
            System.out.print("INSERTING ");
            System.out.println(element);
            top++;
            items[top] = element;
        }
    }

    void pop(){
        if(IsEmpty()){
            System.out.println("STACK IS EMPTY");
            System.exit(1);
        
        }else{
            System.out.println("REMOVING " + items[top]);
            top--;
        }

    }
    void printstack(){
        if(IsEmpty()){
            System.out.println("STACK HAS NO ELEMENT");
        }
        else{
            capacity=top+1;
            for(int i=0;i<capacity;i++){
                System.out.println(items[i]);
            }
        }
    }

}




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("STACK OPERATIONS");
        stack stack1 = new stack(5);
        
        stack1.push(20);
        stack1.push(40);
        stack1.printstack();
        stack1.pop();
        stack1.printstack();
    }
}
