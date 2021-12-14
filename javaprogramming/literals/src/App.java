class literalstest{
    int num;
    literalstest(int num){
        this.num = num;
    }

    void to_bin(){
        System.out.println(Integer.toBinaryString(this.num));
    }
    void to_hex(){
        System.out.println(Integer.toHexString(this.num));
    }
    void to_octal(){
        System.out.println(Integer.toOctalString(this.num));
    }
}

public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Test number conversion");
        literalstest num1 = new literalstest(-10);
        num1.to_bin();
        num1.to_hex();
        num1.to_octal();
    }
}

