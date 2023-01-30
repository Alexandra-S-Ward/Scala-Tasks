object forLoop{
    def main(args: Array[String]){
        for(i <- 1.to(5)){
            println(i)
        }
        for(i <- 1 until 6){
            println(f"i using until $i%d")
        }
    }
}