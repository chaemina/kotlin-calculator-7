package calculator.utils


object Calculator {

    // 문자열 반환
    fun basicCalculator(userInput: String): List<String> {
        val resultString = userInput.split(",",":")
        return resultString
    }

    fun customCalculator(userInput: String): List<String> {
        val calculator = userInput[2]
        val newString = userInput.substring(5)
        val resultString = newString.split(calculator)
        return resultString
    }

    fun sum(result: List<String>): Int{
        val numbers = try {
           result.map { it.toInt() }
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("잘못된 입력 형식입니다. (${e.message})")
        }
        if(numbers.any {it < 0}) {
            throw   throw IllegalArgumentException("음수 값이 포함되어 있습니다: $numbers")
        }
        return numbers.sum();
    }
}