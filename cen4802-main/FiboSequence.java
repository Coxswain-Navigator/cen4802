public class FiboSequence {

    public static void main(String []args) {
        int printout = 0;
        printout = fibonacci(10);
        System.out.println("The nth term of the fibonacci sequence is " + printout + ".");
    }
    
static int fibonacci(int p) {
     if(p <= 1)
         return p;
    return fibonacci(p - 1) + fibonacci(p - 2);
}
}
