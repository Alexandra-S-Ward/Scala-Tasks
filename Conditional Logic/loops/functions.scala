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
    def main(args: Array[String]){
        println(calc.add(2,3))
        println(calc.sub(2,3))
        println(calc.multiply(2,3))
        println(calc.divide(2,3))
        println(calc.add(calc.sub(300,20),30))
        calc.print_add(30,50)
        var add = (x: Int, y: Int) => x+y;  
        println(add(3,5))


    }
}