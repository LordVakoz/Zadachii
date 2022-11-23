package Обучалка;



import static Обучалка.fact.factorial;

public class fact {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
 public static int factorial(int n) {
     if (n == 1)
        return 1;
     return n*factorial(n-1);
 }

   }
