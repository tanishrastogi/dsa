
public class patterns {

  static void solid_rectangle(){
    for(int i =0;i<4;i++){
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  static void hollow_rectangle(){
    for(int i =0;i<5;i++){
      for (int j = 0; j < 5; j++) {
          if(i==0||i==4 ||j==0||j==4){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
      }
      System.out.println("");
    }
  }

  static void half_pyramid(){
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
          System.out.print("*");
      }
      System.out.println("");
    }
  }

  static void inverted_half_pyramid(){
    for (int i = 0; i < 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  static void butterfly(){
    int n = 4;
    for(int i = 0; i<8;i++){
      int spaces = 2*(n-i);
      for(int j = 0;j<i;j++){
      }
    }
  }

  public static void main(String[] args) {
    // solid_rectangle();
    // hollow_rectangle();
    // half_pyramid();
    inverted_half_pyramid();
  }
}
