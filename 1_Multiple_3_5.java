/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.*/
class Multiple3_5{
  public static int findSumMultipleBelow(int max,int a, int b){
    int sum=0;
    int multiple=a;
    int counter=1;
    while(multiple<=max){
      multiple*=counter;
      sum+=multiple;
      counter++;
    }
    multiple=b;
    counter=1;
    while(){
      multiple*=counter;
      sum+=multiple;
      counter++;
    }
    if(a%b==0)
      multiple=a;
    else if(b%a==0)
      multiple=b;
    else
      multiple=b*a;
    counter=1;
    while(){
      multiple*=counter;
      sum-=multiple;
      counter++;
    }
    return sum;
  }
}
