
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("String test!");
        String str = "JAVA";
        String str1 = new String("JAVA");
        char[] name = {'o','n','e','s'};
        String stringfromcahrarray = new String(name);
        System.out.println(stringfromcahrarray);
        if(str == str1){
            System.out.println("the two string objects are the the same");
        }else{
            System.out.println("The two string objects are not the same");
        }
        System.out.println(str);
        System.out.println(stringfromcahrarray.startsWith("o"));
        System.out.println(stringfromcahrarray.endsWith("s"));
    }
}
