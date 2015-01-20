/*The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
public class Sum_square_difference{
  /*sum of squares : n(n+1)(2n+1)/6, sum : (1+n)n/2*/
  public static int sumSquare(int max){
    reture max*(max+1)*(2*max+1)/6;
  }
  
  public static int sum(int max){
    return max*(max+1)/2;
  }
}
