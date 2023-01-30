object case_match{
    def main(args: Array[String]){
        val age = "26";
        age match { 
            case "25" => println(s"$age is 25")
            case "26" => println(s"$age is 26")
            case _ => println("default")
        }
        val result = age match{
            case "25" => println("25")
            case "26" => println("26")
            case _ => println("default")
        }
    }
}