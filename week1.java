  // 10/08/2025
  public class week1 {
    public static void pattern1(){
        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(",");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
          pattern1();
      }
  }
