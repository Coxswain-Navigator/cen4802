	/**
	 * 1/20/2023
	 * Assignment 2
	 * Demonstrates fibonacci sequence and version control by
	 * printing out the 10th term of the fibonacci sequence and
	 * subsequently being uploaded to github. 
	 * 
	 *@author      Adam Hunt
	 *@version     2.0
	 *@param p 	the current value of 
	 *@param n 	the int value associated with the method, and the number of terms in the sequence
	 *@return	the value at the n'th term of the fibonacci sequence
	 */
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
