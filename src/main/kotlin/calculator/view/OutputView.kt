package calculator.view

import calculator.Contants.promptMessage
import calculator.Contants.resultMessage

class OutputView {
    fun printMsg() {
        println(promptMessage)
    }

    fun printResult(result: Int) {
        println("$resultMessage $result")
    }
}