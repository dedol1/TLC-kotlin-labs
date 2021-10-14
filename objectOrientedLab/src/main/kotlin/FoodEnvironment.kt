import kotlin.random.Random

class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores: MutableMap<Actor, Int> = mutableMapOf()
    var animal : String? = null

    init{
        for (actor in ags){
            scores.put(actor , 0)
        }

    }

    override fun processAction(agent: Actor, act: Action) {

        when(act){
            is ForageAction -> scores.get(agent)?.plus(1).let {
                if (it != null) {
                    scores.put(agent,it)
                }
            }

            is HuntAction ->  scores.get(agent)?.plus(2).let { it?.let { it1 -> scores.put(agent, it1) } }


        }
    }

    override fun sense(agent: Actor) {

        if (animal == null){
            agent.perceive()
        }
        else{
            agent.perceive("animal", animal!!)

        }

    }

    // creating an override method for the step method in Environment
    override fun step() {

        // generating random numbers to calculate for the 50% time there will be an animal
       val randomNumbers : Double = Random.nextDouble(0.0, 1.0)
        if (randomNumbers > 0.5){
            animal = "goat"
        }
        else println("$animal")
        super.step()
    }
}