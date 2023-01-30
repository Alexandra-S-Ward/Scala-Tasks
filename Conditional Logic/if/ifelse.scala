object IfElse{
    def main(args: Array[String]){
        val x : Double = 30.3
        if (x > 30){
            print(f"$x%f is over 30.")
        }
        else if (x < 30){
            print(f"$x%f is under 30")
        }
        else{
            print(f"$x%f is 30.")
        }
        println("\n")
        val tmp = if (x < 40) "x < 40" else "x > 40";
        println(tmp)
    }
}