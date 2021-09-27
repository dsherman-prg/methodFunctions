import kotlin.math.PI
import kotlin.math.sqrt

fun main(){
    // Initialize variable
    var userSelection = 1
    var area = 1.2

    do {
        // Print menu options
        println("1) Square")
        println("2) Circle")
        println("3) Triangle")
        println("4) Hexagon")
        println("5) Exit")

        // Get user input
        println("Please select the number of the shape you want to calculate the area for:")
        userSelection = readLine()!!.toInt()

        when (userSelection){
            1 -> {
                println("Square selected")
                println("Enter the length of a side")
                val side = readLine()!!.toDouble()

                area = square(side)
            }

            2 -> {
                println("Circle selected")
                println("Enter the radius")
                val radius = readLine()!!.toDouble()

                area = circle(radius)
            }

            3 -> {
                println("Triangle selected")
                println("Enter the height")
                val height = readLine()!!.toDouble()
                println("Enter the length of the base")
                val base = readLine()!!.toDouble()

                area = triangle(height, base)
            }

            4 -> {
                println("Hexagon selected")
                println("Enter the length of a side")
                val side = readLine()!!.toDouble()

                area = hexagon(side)
            }
        }
    }while (userSelection !in 1..5)

    if (userSelection != 5) {
        println("The area is: $area")
    }
}

fun square(side: Double): Double{
    return side * side
}

fun circle(radius: Double): Double{
    return (PI * radius * radius)
}

fun triangle(height: Double, base: Double): Double{
    return (.5*base*height)
}

fun hexagon(side: Double): Double{
    return (((3*sqrt(3.0))/2)*(side*side))
}