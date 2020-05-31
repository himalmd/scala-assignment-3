object EvenSum{ 

def evenSum(sum:Int, i:Int) : Int = {
    if(i <= 10){
      var tot : Int = sum
        tot = tot + i;
        return evenSum(tot, (i+2));

    }
    else
        return sum;

}


def main(args: Array[String]) { 
  
  println(evenSum(0,2))
      
  }
  
}