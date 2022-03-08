
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("java data types ");
        String[] data_type={"bytes","short","interger","long","float","double","char","bool"};
        int[] bytess = {1,2,4,8,4,8,2,1};
        for(int k=0;k<data_type.length;k++){
            System.out.print(data_type[k]);
            System.out.println(" "+bytess[k]+" bytes "+Math.pow(2, bytess[k])+" combinations");
        }


        
    }
}
