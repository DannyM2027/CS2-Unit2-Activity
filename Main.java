public class Main {

   public static void main(String []args) {
      System.out.println("yo, think of a question trustt i give good answer");

      // Gen a random int 1-10
      int num = (int) (Math.random() * 10) + 1;
      double luck = Math.random();
    

      // conditional block to test value of NUM\

      if (luck >= 0.5) {
         System.out.println("U are a lucky duck");
      }

      if (num == 10) {
         System.out.println("yea");
      }
      else if (num == 9) {
         System.out.println("for sure");
      }
      else if (num == 8) {
         System.out.println("never ask again");
      }

      else if (num == 7) {
         System.out.println("leave me alone");
      }
      else if (num == 6) {
         System.out.println("ask matthew");
      }
      else if (num == 5) {
         System.out.println("Oh hell nah");
      }
      else if (num == 4) {
         System.out.println("I guesss");
      }
      else if (num == 3) {
         System.out.println("ask again later");
      }
      else if (num == 2) {
         System.out.println("maybe");
      }
      else {
         System.out.println("go for it");
      }





   } // close main meth
}
