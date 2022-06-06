package inputManager

class InputManagerImpl : InputManager {

    override fun getIntWithDescription(description: String?): Int? {
        println(description)
        val input = readLine()
        return input?.toIntOrNull()
    }

    override fun getDoubleWithDescription(description: String?): Double? {
        println(description)
        val input = readLine()
        return input?.toDoubleOrNull()
    }

    override fun getStringWithDescription(description: String?): String? {
        println(description)
        return readLine()
    }
}