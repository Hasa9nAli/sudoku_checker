package utils

fun check(name: String, result: Boolean, correctResult: Boolean){
    if(result == correctResult){
        println("Success -> $name".withGreenColor())
    }
    else {
        println("Fail -> $name".withRedColor())

    }
}
