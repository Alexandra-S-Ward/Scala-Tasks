object whileLoop{
    def main(args: Array[String]){
        var i : Int = 30;
        while (i > 10){
            println(i);
            i-=1;
        }
        do { 
            println(i);
            i+=1;
        } while (i < 20)
    }
}