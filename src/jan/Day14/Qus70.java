package jan.Day14;

/*
70.Check if a number ‘a’ is present in another number ‘b.
 */
public class Qus70 {
    public static void main(String[] args) {
        String a = "12345";
        String b = "34";

        if(a.indexOf(b) == -1){
            System.out.println("not present");
        }else{
            System.out.println("present");
        }

    }
}
