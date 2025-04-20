package controller

import model.Car
import view.RacingResultView
import view.WinnerView

class RacingController {
    fun registerCars(carNames: List<String>): List<Car> {
        return carNames.map { Car(it) }
    }

    fun startRace(times: Int): RacingResultView {
        return RacingResultView()
    }

    fun getWinners(): WinnerView {
        return WinnerView()
    }
}