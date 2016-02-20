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
    if (num==0||num==1|num%2==0||num%5==0) {
      return "not a Prime";
    }
    for (int i=3;i<Math.sqrt(num);i++) {
      if (num%i==0) {
        return "not a prime";
      }
    }
    return "Prime";
  }

}
