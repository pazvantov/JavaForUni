public class ExtendThread {

    public static void main(String args[]) {

        PrintNameThread pnt1 =
                new PrintNameThread("A");


        PrintNameThread pnt2 =
                new PrintNameThread("B");


        PrintNameThread pnt3 =
                new PrintNameThread("C");
    }
}
