fun main (){
    oddNumbers()
    println( takeArrayNames(arrayOf("wamb","Kashekoo","kibetini","latu","lizin")))
    printNumbers()
    servingRobot(35)
    servingRobot(5)
    servingRobot(15)

}
fun oddNumbers(){
    for (odd in 1..100){
        if (odd % 2 !=0){
            println(odd)
        }
    }
}

fun takeArrayNames(name:Array<String>):Int{
    var x=0
    for (names in name){
        if (names.length>=5)
        x++
    }
    return x
}

fun servingRobot(age:Int){
   if (age<=6){
        println("milk")
    }
    else if ( age>6 && age<=15 ){
        println("fanta orange")
    }
   else{
        println("coca cola")
   }
}

fun printNumbers(){
    for(number in 1..100){
        if ( number % 3==0 && number %5==0)
        {
            println("FizzBuzz")
        }
        else if (number % 5==0){
            println("Buzz")
        }
        else if (number % 3==0 ){
            println("Fizz")
        }
        else {
            println(number)
        }
    }
}
