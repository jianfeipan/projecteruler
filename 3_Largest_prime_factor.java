/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/
public class Largest_prime_factor{
  public static int largestPrileFactorof(int input){
    int factor = 1;
    int result=null;
    while(factor<=input){
      if(input%factor==0){
        if(isPrime(factor)){
          result=factor;
        }
      }
      factor++;
    }
  }
  
  public boolean isPrime(int number){
    int count=2;
    while(count<number){
      if(number%count==0)
        return false;
    }
    return true;
  }
}
