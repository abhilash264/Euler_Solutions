import java.util.*;
public class Main  {
   public static void main(String[] args) {
      generate();
   }
   public static void generate(){
      ArrayList<Integer> al = new ArrayList<Integer>();
      for(int i = 1; i < 10000; i++ ) {
         int a = sum(divisors(i));
         int b = sum(divisors(a));
         if(i == b && i != a){
            if(!al.contains(i))
               al.add(i);
            if(!al.contains(b))
               al.add(b);
         }
      }
     
      System.out.println("Sum: " + sum(al));
   }
   public static ArrayList<Integer> divisors(int n) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      for(int i = 2; i < (n/2+1); i++){
         if(n % i == 0){
            list.add(i);
         }
      }
      return list;
   }
   public static int sum(ArrayList<Integer> c){
   int sum = 0;
   for(Integer e : c)
      sum += e;
   return sum;
   }
}