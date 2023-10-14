// File Name: LargeKotlinCodeExample.kt

data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 30)
    println("Name: ${person.name}, Age: ${person.age}")

    val numbers = listOf(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map { it * 2 }
    println("Original List: $numbers")
    println("Doubled List: $doubledNumbers")

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers: $evenNumbers")

    val sum = numbers.reduce { acc, value -> acc + value }
    println("Sum of Numbers: $sum")

    val result = add(10, 20)
    println("Result of add function: $result")

    val lambdaFunction: (Int, Int) -> Int = { a, b -> a * b }
    val product = operate(5, 4, lambdaFunction)
    println("Result of operate function: $product")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun operate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

class Car(val make: String, val model: String) {
    fun start() {
        println("Starting the $make $model")
    }
}

class Book(val title: String, val author: String) {
    fun read() {
        println("Reading $title by $author")
    }
}
