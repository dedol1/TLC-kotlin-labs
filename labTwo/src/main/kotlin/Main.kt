// creating a function called balance

fun balance() : Unit{
    println("your balance is $funds")
}

// function for deposit
fun deposit(depositMoney: Double) : Unit{
        funds += depositMoney
}

// function for withdrawal

fun withdraw (withDrawMoney : Double) : Unit{
    print("Please enter your password to authenticate this process: ")
    val password : String = readLine()!!

    if (password == pswd){
        funds -= withDrawMoney
    }
    else println("wrong password, restart your withdraw process")
}


var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!

        cmd = input.split(" ")
        when (cmd[0].lowercase()) {
            // Each command goes here...
            "balance" -> balance()
            "deposit" -> deposit(depositMoney = cmd[1].toDouble())
            "withdraw" -> withdraw(withDrawMoney = cmd[1].toDouble())
            else -> println("Invalid command")
        }
    }
}