public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("greek unicode!");

        for(char k=0x0370;k<0x03ff;k++){
            
            System.out.print(k);
        }
    }
}
