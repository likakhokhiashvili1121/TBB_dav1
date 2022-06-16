import java.util.Scanner

fun main() {
    sum()
    restart()
}

private fun sum() {

    println("sheiyvanet x: ")
    var x = Scanner(System.`in`)
    println("sheiyvanet y: ")
    var y = Scanner(System.`in`)


    var finx:Int = x.nextInt()
    var finy:Int = y.nextInt()

    var z = finx + finy
    println("jamia" + " " + z)

}

private fun restart() {
    println("gsurt tavidan dawyeba? Y/N:")
    val answer = readLine()
    if (answer == "y" || answer == "Y") {
        main()
    } else if (answer == "n" || answer == "N") {
        println("paka brat")
    }
}

