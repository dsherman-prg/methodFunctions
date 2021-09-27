import kotlin.math.PI
import kotlin.math.sqrt

fun main(){
    // Initialize variable
    var userInput = 1

    do {
        // Print menu options
        println("1) Square")
        println("2) Circle")
        println("3) Triangle")
        println("4) Hexagon")
        println("5) Exit")

        // Get user input
        println("Please select the number of the shape you want to calculate the area for:")
        userInput = readLine()!!.toInt()
    }while (userInput !in 1..5)

    // Call function to get the area
    val area = getShapeArea(userInput)

    if (area != null) {
        println("The area is: $area")
    }
}

fun getShapeArea(x: Int): Double? {
    when (x){
        // Square
        1 -> {
            println("Square selected")
            println("Enter the length of a side")
            val side = readLine()!!.toDouble()

            return side * side
        }

        // Circle
        2 -> {
            println("Circle selected")
            println("Enter the radius")
            val radius = readLine()!!.toDouble()

            return (PI * radius * radius)
        }

        // Triangle
        3 -> {
            println("Triangle selected")
            println("Enter the height")
            val height = readLine()!!.toDouble()
            println("Enter the length of the base")
            val base = readLine()!!.toDouble()

            return (.5*base*height)
        }

        // Hexagon
        4 -> {
            println("Hexagon selected")
            println("Enter the length of a side")
            val side = readLine()!!.toDouble()

            return (((3*sqrt(3.0))/2)*(side*side))
        }
    }

// Null if exit is selected
    return null
}

