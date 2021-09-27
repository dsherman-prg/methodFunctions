import kotlin.math.PI
import kotlin.math.sqrt

fun getShape(x: Int): Double? {
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
