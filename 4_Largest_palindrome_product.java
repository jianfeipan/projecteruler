/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/
public class Largest_palindrome_product{
  public static void find3digitproductPalindrom(){
     int numberA=999;
     int numberB=999;
     
  }
  
  public int[] intToarray(int number){
    int count=0;
    int temp=number;
    while(temp>0){
      temp/=10;
      count++;
    }
    int[] result=new int[count];
    temp=number;
    for(int i =0; i<count;i++){
      result[i]=temp%10;
      temp/=10;
    }
    return result;
  }
  
  public boolean isPalindrom(int[] intarray){
    int len=int_array.length;
    for(int i=0; i<len/2;i++){
      if(intarray[i]!=intarray[len-1-i])
        return false;
    }
    return true;
  }
}
