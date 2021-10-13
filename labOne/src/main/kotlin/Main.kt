// creating a function
fun calculateY(m:Int, x:Int, c:Int) : Int{
    // y = mx + c, this is the formula for a straight line
    return m * x + c
}

// creating a function to find the intersection of two lines
fun intersectionOfTwoLines(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) {
    for (xValue in 0 .. 100) {
        val firstY: Int = calculateY(mOne, xValue,cOne)
        val secondY : Int = calculateY(mTwo,xValue,cTwo)
        if (firstY == secondY){
            println("the two lines intersect at this '$xValue'.")
        }
        else println("these lines do not intersect")
    }
}

// this is the main function
fun main(args: Array<String>) {
    // making a variable in kotlin
    var name = "Hello"
    println(name)

    // calling the function and printing a range of vals of y between the x vals of -5 and 5

    for (i in -5 .. 5){

        println(calculateY(3,i,-1))
    }

    // finding the intersection of two lines
    for (a in 0 .. 20){
        val firstY : Int = calculateY(3,a,5)
        val secondY : Int = calculateY(4,a,2)
        if (firstY == secondY){
            println("the coordinates for the intersection of the two lines is ($a,$secondY)")
        }
    }

    // calling the intersection checker function
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    println("\ncalling the intersection checker function\n")
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")

    intersectionOfTwoLines(3,5,4,2)
    intersectionOfTwoLines(2,1,3,3)
    intersectionOfTwoLines(-2,3,3,-2)




}