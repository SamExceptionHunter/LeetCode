package Easy;

public class PalindromeNumber {

        public boolean isPalindrome(int x) {
            int OriginalNumber=x;
            int reversedNumber=0;
            int temoin;
            while(x>0){
                temoin= x %10;
                reversedNumber=reversedNumber*10+temoin;
                x=x/10;

            }
            return OriginalNumber == reversedNumber;
    }
}
