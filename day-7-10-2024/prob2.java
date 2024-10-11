class Solution {
  public boolean isPalindrome(int x) {
    int i= x;
    int rev=0;
    if(x>=0){
      while(i>0){
        int r = i%10;
        rev = rev*10+r;
        i=i/10;
      }
      System.out.println(rev);
      if(rev==x){
       return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    Solution solution = new Solution();

    boolean b = solution.isPalindrome(121);

    System.out.println(b);

  }
}