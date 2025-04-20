package model

class Car(
    val name: String,
    var distance: Int = 0,
) {
    init {
        require(name.length <= 5) { "[ERROR] 자동차 이름은 5글자 이하여야 합니다." }
    }

    fun move() {
        val randomValue = (0..9).random()
        if (randomValue >= 4) {
            this.distance += randomValue
        }
    }

    fun getNameAndDistance(): String {
        return "$name : $distance"
    }
}