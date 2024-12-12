package calculator.view

import calculator.Contants.promptMessage
import calculator.Contants.resultMessage
import calculator.model.UserInput

class OutputView  {
    fun printMsg() {
        println(promptMessage)
    }
    fun printMsg(result: UserInput) {
        println("$resultMessage $result")
    }
}