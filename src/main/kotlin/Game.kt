class Game {
    var score = 0
        private set

    var highScore = 0
        private set

    fun incrementScore() {
        score++
        if (score > highScore) {
            highScore++
        }
    }
}