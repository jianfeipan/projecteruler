/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
public class Smallest_multiple{
  public static int smallest_multiple(int a,int b){
    if(a<b){
      for(int i=1;i<=a;i++)
        if(i*b%a==0){
          return i*b;
        }
    }else if(a>b){
      for(int i=1;i<=b;i++)
        if(i*a%b==0){
          return i*a;
        }
    }
    return a;

  }
  
  public static void main(String[] args){
    int result=1;
    for(int i=1;i<=10;i++){
      result=smallest_multiple(result,i);
    }
    System.out.println(result);
  }
}
