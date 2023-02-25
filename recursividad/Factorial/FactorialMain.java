public class FactorialMain{
    public static void main(String[] agrs){
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(8));
    }   
   }
   
   class Factorial{
       public int factorial(int a){
           if (!(a==1)) return a * factorial(a-1);
           return 1;
       } 
   }