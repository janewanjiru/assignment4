import java.util.*

fun main() {

name("jane","lovelace","mango","word")
    place()
    word()
    word()
    println(Arrays.toString(names(("school","lovelace","cate"))))
}
fun name(a:String,b:String,c:String,d:String) {
    var ArrayName=arrayOf("$a,$b,$c,$d")
    println(Arrays.toString(ArrayName))


}
fun place() {
    var cities= arrayListOf("harare","mumbai","dodoma","jakarta")
    cities.forEach{one->
        println(cities.capitalize())

}

}
fun word() {
    var numbers = arrayOf(32, 17, 4, 113, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers[1] + numbers[4])
    println(numbers.lastIndex - 1)

    for (oneNumber in numbers.sorted()) {
        println(oneNumber)

    }

}
fun names(words: String, s: String, s1: String):Array<String>{
    return arrayOf(words)


}

