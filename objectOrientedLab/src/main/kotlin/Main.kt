fun main(args: Array<String>) {

    // creating an instance of SimpleAgent
//    val env = FoodEnvironment(SimpleAgent("Charlie"))
//    env.step()
//    println(env.scores)
    val env = FoodEnvironment()
    for (i in 1..10) {
        env.step()
        println(env.animal)
    }


}