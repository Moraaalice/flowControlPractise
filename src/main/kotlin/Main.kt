fun main(){
    checkVowelConsonants()
    //
    var x = exitLoop(arrayOf(12,10,9,4,-2,-4,4))
    println(x)
    //
    checkFibonacci()
    //
    factorialNumber()
    //
    factorOfNumber()


}
//Write a program in Kotlin that prints the Fibonacci sequence up to a certain number.
// Use a do-while loop to generate the sequence.
fun checkFibonacci(){
    var num1 = 0
    var num2 = 1
    var i = 1
    var x = 5
    println("first $x terms")
    while (i <= x){
        println("$num1 + ")
    var sum = num1 + num2
    num1 = num2
    num2 = sum
    i++
    }
    println(i)
}
//Write a program in Kotlin that uses a break statement to exit a loop when a certain condition is met.
fun exitLoop(nums:Array<Int>):Int{
    var addition = 0
    for (n in nums){
        if (n > 0){
            addition+=n
        }else if (n < 0){
            break
        }
    }
    return addition
}
//Write a program in Kotlin that uses a try-catch block to handle a potential division by zero error.


//Write a program in Kotlin that asks the user to enter a letter and then prints
// whether it is a vowel or a consonant.
fun checkVowelConsonants(){
    var ch = 'b'
    var vowel = if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        println("vowel")
    else
        println("consonant")
}

//Write a program in Kotlin that asks the user to enter a number and then prints the factorial
// of that number. Use a while loop to calculate the factorial.
//Factorial of a number using for loop
fun factorialNumber(){
    var num = 10
    var factorial: Long = 1
    for (i in 1..num){
        factorial  *= i.toLong()
    }
    println(factorial)
}
//Factorial using a while loop
fun factorOfNumber(){
    var number = 10
    var factor:Long=10
    var i = 1
    while (i<=number){
        factor *= i.toLong()
        i++
    }
    println(factor)
}
//
