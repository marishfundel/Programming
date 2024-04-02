package m18_loops_part3;

public class FinraPattern {

    public static void main(String[] args) {

      int i = 1;
      while (i <= 20) {
          if (i % 3 == 0 && i % 5 == 0) {
              System.out.print(" FINRA ");
              } else if (i % 3 == 0) {
              System.out.print(" FIN ");
          } else if (i % 5 == 0){
              System.out.print(" RA ");
      }else {
              System.out.print(" " + i +" ");
          }
          i++;
      }





    }

}
