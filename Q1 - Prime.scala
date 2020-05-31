object PrimeNumbers{ 
  
  def main(args: Array[String]) { 

    var n : Int = 8; 
      if (prime(n)){
        println("True");
      } else{
        println("False");
      }
  } 

  def prime(n:Int, i:Int = 2) : Boolean = 
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
      return prime(n, i + 1); 
  } 
  
}