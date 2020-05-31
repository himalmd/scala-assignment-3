object Fibonacci{ 

def fib(n:Int, a:Int = 0, b:Int = 1) : Int =
{ 
    if (n == 0) 
        return a; 
    if (n == 1) 
        return b; 
    return fib(n - 1, b, a + b); 
} 


def main(args: Array[String]) { 
  for( w <- 0 to 10) 
          { 
              println(fib(w)); 
          } 
  
      
  }
  
}