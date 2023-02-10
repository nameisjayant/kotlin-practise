package lamdas

import java.sql.Struct

// lamdas type declaration
val sum:(Int,Int)->Int = {a,b -> a + b}

// lamdas without type declaration
val minus = {a:Int,b:Int -> a-b}

// lamda as a class extension
val classExtension : String.(Int)->String = {
    a -> this + a
}

val returnPair: (Pair<String,Int>)->Unit = {
    println("${it.first} ${it.second}")
}

// higher order function
fun printSomething() = println("Hey i am higher order function")
fun demo(printSomething:()->Unit){
    printSomething()
}

fun processLanguage(list:List<String>,action:(String)->Unit){
    list.forEach(action)
}

fun main(){
    val res = sum(1,2)
    val minusRes = minus(5,1)
    val classRes = "jayant".classExtension(50)
    val languageList = listOf("Java","kotlin","Python","C")
    println(res)
    println(minusRes)
    println(classRes)
    demo(::printSomething)
    returnPair.invoke("Jayant" to 10)
    val action = {language:String -> println(language) }
    processLanguage(languageList){
        action(it)
    }

}