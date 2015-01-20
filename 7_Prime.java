/*Nst prime */
public class Prime{
  public static int nthPrime(int n){
    int candidate, count;
    for(candidate = 2, count = 0; count < n; ++candidate) {
        if (isPrime(candidate)) {
            ++count;
        }
    }
    // The candidate has been incremented once after the count reached n
    return candidate-1;
  }
  
    private static boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
  
  public static void main(String[] args){
      for(int i=1;i<=29;i++)
        System.out.println(nthPrime(i));
  }
}

