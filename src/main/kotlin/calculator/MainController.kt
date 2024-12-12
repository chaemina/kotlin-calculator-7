package calculator

import calculator.utils.Calculator
import calculator.view.InputView
import calculator.view.OutputView

class MainController(private val inputView: InputView, private val outputView: OutputView) {
    fun start() {
        outputView.printMsg()
        val userInput = inputView.getUserInput()

        // 경우에 따라 함수 호출
        val result = when {
            userInput.startsWith("/") -> Calculator.customCalculator(userInput)
            userInput.isBlank() -> listOf("0")
            userInput.contains(",") -> Calculator.basicCalculator(userInput)
            userInput.contains(":") -> Calculator.basicCalculator(userInput)
            else -> throw IllegalArgumentException("잘못된 입력 형식입니다.")
        }
        val sum = Calculator.sum(result)
        outputView.printResult(sum)
    }
}