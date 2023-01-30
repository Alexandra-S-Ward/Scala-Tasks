object forLoop{
    def main(args: Array[String]){
        val lst = List(1,2,3,4,5,6,7,8,9,10)
        for(i <- 1.to(5)){
            println(i)
        }
        for(i <- 1 until 6){
            println(f"i using until $i%d")
        }
        for(i <- lst){
            println(i)
        }
        for(i <- lst; if i % 2 == 0){
            println(i)
        }
        val result = for(i <- lst; if i % 2 == 1) yield {
            i;
        }
        println(s"odd numbers in lst: $result")
    }
}