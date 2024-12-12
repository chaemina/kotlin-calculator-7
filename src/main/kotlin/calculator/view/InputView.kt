package calculator.view

import camp.nextstep.edu.missionutils.Console
import calculator.model.UserInput

class InputView {
     fun getUserInput(): UserInput {
        val userInput = Console.readLine() ?: "";
        return UserInput(userInput)
    }
}