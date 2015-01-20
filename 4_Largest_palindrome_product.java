/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/
import java.util.ArrayList;
public class Largest_palindrome_product{
    public static int find3digitproductPalindrom(){
    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=999;i>=100;i--){
        for(int j=999;j>=100;j--)
          if(isPalindrom(intToarray(i*j))){
            list.add(i*j);
          }
    }
    int max=0;
    for(int i : list){
      if(i>max){
        max=i;
      }
    }
    return max;
  }
  
  public static int[] intToarray(int number){
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
  
  public static boolean isPalindrom(int[] intarray){
    int len=intarray.length;
    for(int i=0; i<len/2;i++){
      if(intarray[i]!=intarray[len-1-i])
        return false;
    }
    return true;
  }
  
  public static void main(String []args){
    System.out.println(find3digitproductPalindrom());
   }

}
