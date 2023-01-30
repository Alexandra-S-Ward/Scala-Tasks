import java.util.Date;

object fncs{
     object calc{
        def add(x : Int, y : Int): Int = {
            return x + y
        }
        def sub(x : Int, y : Int): Int = {
            return x - y
        }
        def multiply(x : Int, y : Int): Int = {
            return x * y
        }
        def divide(x : Int, y : Int): Float = {
            return x / y
        }
        def print_add(x : Int, y : Int): Unit = {
            println(x+y)
        }
     }
    def higher_order(x : Double, y: Double, f : (Double, Double)=> Double): Double = f(x,y);
    def log(date : Date, message: String) = {
        println(s"$date    -    $message")
    }

    def curried_add_function(x : Int) = (y : Int) => x + y;

    def main(args: Array[String]){
        println(calc.add(2,3))
        println(calc.sub(2,3))
        println(calc.multiply(2,3))
        println(calc.divide(2,3))
        println(calc.add(calc.sub(300,20),30))
        calc.print_add(30,50)
        var add = (x: Int, y: Int) => x+y;  
        println(add(3,5))
        println("Higher Order")
        println(higher_order(2,3, (x,y) => x+y))
        val sum = calc.add(3,_)
        println(sum(2))
        val date = new Date;
        var addLog = log(date,_: String)
        addLog("Log one")
        addLog("Log two")
        println(curried_add_function(30)(20))

        // Strings
        val test_string: String = "Ostritch"
        val test_string2: String = " Apple"
        val number_for_test: Int = 392
        println(test_string.length())
        println(test_string.concat(test_string2))
        println(test_string + test_string2)
        printf("%s, %s, %d", test_string, test_string2, number_for_test)


    }
}