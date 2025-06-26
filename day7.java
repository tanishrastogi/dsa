// 26/06/2025

public class day7 {
    public static void main(String[] args) {
        
    }

    public static boolean problem125(){
        String s = "abcddcba";
        String rev = "";
        s = s.toLowerCase();
        String copy = s;
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            int value = (int) ch;
            if((value<97 || value>122)  && !(value >=48 && value<=57)){
               copy = copy.replace(ch+"", "");
            }
        }


        int n = copy.length();

        for(int i = n-1;i>=0;i--){
            System.out.println(s.charAt(i));
            rev = rev+copy.charAt(i);
        }

        if(rev.equals(copy)){
            return true;
        }
        else{
            System.out.println(copy);

            System.out.println(rev);

            return false;
        }
    }
}