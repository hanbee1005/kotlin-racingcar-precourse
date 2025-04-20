package view

import model.Car

class RacingResultView(
    val results: MutableList<String> = mutableListOf()
) {
    fun recordResult(cars: List<Car>) {
        results.add(cars.joinToString(separator = "\n") { it.getNameAndDistance() })
    }

    fun printAllResults() {
        results.forEach { println(it + "\n") }
    }
}