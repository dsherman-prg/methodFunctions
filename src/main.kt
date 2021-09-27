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

    // Call function to get area
    val area = getShape(userInput)

    if (area != null) {
        println("The area is: $area")
    }
}