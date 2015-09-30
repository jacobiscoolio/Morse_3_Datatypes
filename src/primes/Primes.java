
package primes;

public class Primes {

    public static void main(String[] args) {
int evens = 0;
    for(int i = 1;i < 101; i++) {
  
      //  evens++;
    
        //isEven(i);
    //isOdd(i);
    //}
//System.out.println(isEven(i));
    //System.out.println(isOdd(i));
    System.out.println(i +" is "+isPrime(i));
    }

    }
static boolean isEven(int someNumber){
    
    return(someNumber % 2 ==0);
}
static boolean isOdd(int someNumber){
    
    return(someNumber % 2 ==1);
}
static boolean isPrime(int someNumber){
    boolean prime = true;
    for(int i = 2; i < someNumber/2; i++){
    if(someNumber % i ==0){
        prime = false;
    }
    }
        return prime;
}
}
