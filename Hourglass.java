public class Hourglass {
public static final int SIZE=10;
public static void main (String[] args) {
   top();
   middle();
   vertical();
}

public static void top() {
   System.out.print("|");
   for(int i=1; i<=2*SIZE+2; i++) {
      System.out.print("\"");
   }
   System.out.println("|");
}

public static void middle() {
   for(int i=1; i<=SIZE; i++) {
      for(int j=1; j<=i; j++) {
         System.out.print(" ");
      }
      System.out.print("\\");
      for(int k=1; k<=(-2*i+(2*SIZE+2)); k++) {
         System.out.print(":");
      }
      System.out.println("/");
   }
}

public static void vertical() {
   for(int i=1; i<=SIZE+1; i++) {
      System.out.print(" ");
   }
   System.out.println("||");
} 
}