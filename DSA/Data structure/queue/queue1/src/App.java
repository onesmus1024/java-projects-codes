class Queue{
    int size;
    int front,rear;
    int queue[];
    Queue(int size){
        queue = new int[size];
        this.size = size;
        this.front=-1;
        this.rear = -1;

    }

    private boolean Isempty(){
        if(this.front == -1){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean Isfull(){

        if(this.rear == size-1){
            return true;
        }
        else{
            return false;
        }
        
    }
    public void dequeue(){
        if(this.Isempty()){
            System.out.println("the queue is empty");
        }
        else{
            if(this.front==this.rear){
                System.out.println("REMOVING");
                System.out.println(this.queue[this.front]);
                this.front=-1;
                this.rear = -1;

            }
            System.out.println("REMOVING");
            System.out.println(this.queue[this.front]);
            this.front++;
        }
    }
    public void enqueue(int item){
        if(Isfull()){
            System.out.println("the queue is full");
            System.exit(1);
        }
        else if(this.front==-1){
            this.front++;
            this.rear++;
            this.queue[this.rear]=item;
        }
        else{
            this.rear++;
            this.queue[this.rear]=item;
        }
    }
    public void display(){
        if(this.Isempty()){
            System.out.println("the queue is empty");
            System.exit(1);
        }

        else{
            System.out.println("queue contains");
            for(int i = this.front;i<=this.rear;i++){
                System.out.println(this.queue[i]);
            }
        }
        System.out.println(" ");
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Queue operations");
        Queue queue1 = new Queue(5);
        queue1.enqueue(30);
        queue1.display();
        queue1.enqueue(20);
        queue1.display();
        queue1.enqueue(40);
        queue1.display();
        queue1.dequeue();
        queue1.display();
    }
}
