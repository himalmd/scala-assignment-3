object OddEven 
{ 
    // Function defined 
    def oddEven(num: Int): Boolean=
    { 
        if (num%2 == 0) 
            return true
        else
            return false 
    } 
      
    // Main method 
    def main(args:Array[String]) 
    { 
      if(oddEven(16)){
        println("Even") 
      }else{
        println("Odd")
      }
      
    } 
} 