package inputManager

interface InputManager {
    fun getIntWithDescription(description: String?): Int?

    fun getDoubleWithDescription(description: String?): Double?

    fun getStringWithDescription(description: String?): String?
}