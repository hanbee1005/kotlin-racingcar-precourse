package controller

import model.Car
import view.RacingResultView
import view.WinnerView

class RacingController {
    fun registerCars(carNames: List<String>): List<Car> {
        return carNames.map { Car(it) }
    }

    fun startRace(cars: List<Car>, times: Int): RacingResultView {
        val result = RacingResultView()

        repeat(times) {
            cars.forEach { it.move() }
            result.recordResult(cars)
        }

        return result
    }

    fun getWinners(): WinnerView {
        return WinnerView()
    }
}