object Sum 
{ 
    // Function defined 
    def sum(num: Int): Int=
    { 
        if (num == 1) 
            1
        else
            sum(num - 1) + num 
    } 
      
    // Main method 
    def main(args:Array[String]) 
    { 
        println(sum(15)) 
    } 
} 