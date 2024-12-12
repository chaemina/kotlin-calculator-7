package calculator

import calculator.view.InputView
import calculator.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()

    val mainController = MainController(inputView, outputView)

    mainController.start()
}