public class Prime{
  public static void main(String[] args) {

    System.out.println("This num is "+isPrime(-22));
    System.out.println("This num is "+isPrime(0));
    System.out.println("This num is "+isPrime(1));
    System.out.println("This num is "+isPrime(3));
    System.out.println("This num is "+isPrime(37));
  }
  public static String isPrime(int num){
    if (num<0) {
      return "invalid";
    }
    if (num==0||num==1) {
      return "not a Prime";
    }
    if(num==2||num==3||num==5||num==7){
      return "Prime";
    }
    if (num%2==0) {
      return "not a prime";
    }
    if (num%5==0) {
      return "not a prime";
    }
    for (int i=3;i<Math.sqrt(num);i++) {
      if (num%i==0) {
        return "not a prime";
      }
    }
    return "Prime";
  }

}
