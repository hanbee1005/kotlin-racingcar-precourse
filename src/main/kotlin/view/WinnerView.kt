package view

class WinnerView(
    val winners: List<String>,
) {
    fun printWinners() {
        println("최종 우승자 : ${winners.joinToString(separator = ", ") { it }}")
    }
}