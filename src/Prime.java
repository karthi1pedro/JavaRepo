public class Prime{
  public static void main(String[] args) {
    for(int i=0;i<1000;i++)
    {
      int t = (int)(Math.random()*10000);
      System.out.println("The num "+t+" is "+isPrime(t));
    }
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
