import controller.RacingController
import model.Car

fun main() {
    val racingController = RacingController()

    var cars: List<Car> = emptyList()

    var carNames: List<String>?
    while (cars.isEmpty()) {
        try {
            // 1. 차량명 입력받기
            println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)")
            carNames = readlnOrNull()?.split(",")

            if (carNames.isNullOrEmpty()) {
                throw IllegalArgumentException("⚠️ 차량명을 입력해 주세요.")
            }

            // 2. 컨트롤러에 차량 등록 호출
            cars = racingController.registerCars(carNames)
        } catch (error: IllegalArgumentException) {
            println(error.message)
        }
    }

    var times: Int? = null
    while (times == null) {
        // 3. 시도 횟수 입력받기
        println("시도할 회수는 몇회인가요?")
        val input = readlnOrNull()
        times = input?.toIntOrNull()
        if (times == null) {
            println("⚠️ 유효한 숫자를 입력해 주세요.")
        }
    }

    // 4. 컨트롤러 경주 호출
    val racingResultView = racingController.startRace(cars, times)

    // 5. 경주 결과 출력
    println()
    println("실행 결과")
    racingResultView.printAllResults()

    // 6. 우승자 조회 호출
    val winnerView = racingController.getWinners(cars)

    // 7. 우승자 출력
    winnerView.printWinners()
}