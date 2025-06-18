import java.util.function.*;
import java.util.Random;
public class LambdaExpression {
   public static void main(String args[]) {
      NumberUtil num = new NumberUtil();
      int randVal = num.getRandomValue(
               () -> {     // no parameter lambda
                   Random random = new Random();
                   return random.nextInt(500);
               });
      System.out.println("The value returned from Lambda is: "+ randVal);
   }
   private static class NumberUtil {
      public int getRandomValue(Supplier<Integer> supplier) {
         return supplier.get();
      }
   }
}