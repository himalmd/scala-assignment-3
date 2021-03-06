object PrimeNumbers{ 
  
  def main(args: Array[String]) { 

    var n : Int = 10;
    var a : Int = 1;
    while( a < n ){
        if (primeSeq(a)){
          println(a);
      }
         a = a + 1;
      }
      
  } 

  def primeSeq(n:Int, i:Int = 2) : Boolean = 
  { 
      // Base cases 
      if (n <= 2) {
        if(n==2){
          return true
        }else{
          return false
        }
      }
      if (n % i == 0) 
          return false
      if (i * i > n) 
          return true

      // Check for next divisor 
      return primeSeq(n, i + 1); 
  } 
  
}