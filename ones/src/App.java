import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("enter a number");
        int  Name;
        Scanner age = new Scanner(System.in);
        Name = System.in.read();
        System.out.println(age);
        Name = System.in.read();

    }

    public class employ{
        private int age;
        private int name;

        public void setname(int  name)
        {
            this.name = name;
        }
        public void setage(int age)
        {
            this.age = age;
        }

        public void nameAge()
        {
            System.out.println("name and age of the employee is ");
            System.out.println(this.name);
            System.out.println(this.age);
        }



    }

    employ ones = new employ();
    
}
