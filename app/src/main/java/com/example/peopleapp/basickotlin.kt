package com.example.peopleapp

import java.util.*
import javax.security.auth.callback.Callback
import kotlin.system.exitProcess


// Class and Objects
//fun main(){
//    var sima = Person()

//    var a : Boolean = true
//
//    if (!a){
//        print("sdjbfjhsd fjdf")
//    }


//    if (a){
//        print("")
//    }

//}

//class Person(name:String = "sk", age:Number = 9){
//    init {
//         println("My name is $name and my age $age")
//    }
//}


// ---------- SCOPES ----------
//fun main() {
//    myFunction(2)
//}
//
//fun myFunction(a: Int) {
//    var b = a
//    b = 8
//    println(b)
//}


// ----------- User Input
// ---- using readLine()

//fun main(){
//    val name: String? = readLine() // Always Returns a String, for number do typecasting
//
//    print(name)
//    println(name!!::class.simpleName)


//    print("Enter your roll number: ")
//    val num = readLine()!!.toInt()
//    println(num)
//    println(num::class.simpleName) // type of var, not only string everything


//    Typecasting:
//        toString
//        toInt
//        toFloat
//        toBoolean


//    // ---- using readLine()
//    val se = Scanner(System.`in`)
////    se.next()- for string
////    se.nextInt() - for Int
//
//    val b = se.nextFloat()
//    println(b::class.simpleName)
//
//}


// -------------- String
//fun main(){
//    val str = "Hello"
//    println(str[0])

//     println(str + 1) // Correct = Hello1
//     println(1 + str) // Wrong


//    println("Number\nIs") //new Line
//    println("Number\tIs") // Tab spacing

//    Raw String - if multiple space then it will count that and tab space, new line on enter

//    val msg  = """nkjdnjk kkjdn
//        |dsndkjsndksnd
//        |dnsndksdnksndkndksdnks dkdfkds fd f                nkfnkff
//    """
//    println(msg)

//    val name = "Sonam"
//    println(" name in uppercase ${name.uppercase()}")
//}


// When ------------------
//// same as switch statement
//fun main() {
//    val x = 1
//    when(x){
//        1 -> println("$x")
//        2,3 -> {
//            println("Define more statements 1")
//            println("Define more statements 2")
//        }
//        in 1..4 -> {
//            println("from 1 to 4 number is present, then print me , to use this use (in) before")
//        }
//            else -> print("Not valid")
//    }
//
////    ex:
//    when("mon"){
//        "mon","tue","wed" -> {
//            println("Working Day")
//        }
//        "sun", "sat" -> {
//            println("Holiday!!!!")
//        }
//    }
//
//}


// ------------------ for loop
// syntax:- for( item in collection ) print(item)
//fun main() {
//
////    for (item in 1..5){
//    for (item in 5 downTo 1){ // from 5 to 1
//        println(item)
//    }
//
//
//
//}


//--------------------while loop
//fun main() {
//    var x = 0
////    while (until the condition is false the loop will keep executing the coding inside it)
//    while (x<5){
//        println("value of x $x")
//        x++
//    }
//}


//---------------do while loop
//fun main() {
//    var x = 0
//    do{
//        x++
//        if (x ==5) continue; // this stop the ignore the next line and continue the while loop
//        println(x)
//    }while (x>10)
//}


// ----------- functions
//fun main() {
//    println(add())
//    println(add(b = 6, a = 9)) // replace the parameters, by assigning value to the arguments directly
//}
//
//fun add(a: Int = 1, b: Int = 1): Int {
//    return (a + b)
//}


////--------------- Higher Order Function
//fun main() {
//    HOF(1,2,::add)
//}
//
//fun add(a: Int = 0, b: Int = 0): Int {
//    return a + b
//}

//fun HOF(a: Int, b: Int, callback: (Int, Int) -> Int) {
//    println(callback(a, b))
//}


// -------------- Lambda Expression
//fun main() {
////    var y = { a: Int, b: Int -> a + b }
////    println(y(8, 1))
//
//    hOF(1, 2, {a:Int, b:Int -> a+b}) // defining a short function in the argument and making the code short
//    hOF(1, 2) { a: Int, b: Int -> a + b } // Can also write the last argument outside
//}
//
////----- Use of lambda in real world( for shortening the code)
////fun add(a: Int = 0, b: Int = 0): Int {
////    return a + b
////}
//
//fun hOF(a: Int, b: Int, callback: (Int, Int) -> Int) {
//    println(callback(a, b))
//}


//----------------- Anonymous Function
fun main() {
    var y = fun(a: Int) {
        println(a)
    }

    y(1)
}