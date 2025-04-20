package controller

import view.RacingResultView
import view.WinnerView

class RacingController {
    fun registerCars(carNames: String) {

    }

    fun startRace(time: Int): RacingResultView {
        return RacingResultView()
    }

    fun getWinners(): WinnerView {
        return WinnerView()
    }
}