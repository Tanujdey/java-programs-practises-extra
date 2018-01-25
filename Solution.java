import java.io.*;
import java.util.*;
class Solution{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a0 = in.nextInt();
    int a1 = in.nextInt();
    int a2 = in.nextInt();
    int b0 = in.nextInt();
    int b1 = in.nextInt();
    int b2 = in.nextInt();

    int alicepoints = 0, bobpoints = 0;
    int[] alice = {a0,a1,a2};
    int[] bob = {b0,b1,b2};
    for (int i = 0; i < 3; i++){
      if(alice[i]>bob[i]){
        alicepoints++;
      }
      else if(alice[i]<bob[i]){
        bobpoints++;
      }
    }
    System.out.println(alicepoints+ " " +bobpoints);

  }
}
