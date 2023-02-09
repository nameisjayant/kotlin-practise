package string_practise


fun main(){

    val name = "Jayant Kumar"

    // through helper function
    val reversedThroughFunction = name.reversed()
    val reversedOne = reverseStringOne(name)
    val reverseTwo = reverseStringTwo(name)

    println(reversedThroughFunction)
    println(reversedOne)
    println(reverseTwo)

}

fun reverseStringOne(name:String):String{

    var reverseString = ""

    for (i in name.length-1 downTo 0){
        reverseString += name[i]
    }

    return  reverseString

}

fun reverseStringTwo(name:String):String{

    val chars = CharArray(name.length)

    name.indices.forEach {
        chars[name.length- it  - 1] = name[it]
    }
    return  String(chars)
}