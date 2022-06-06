import application.TriviaGame
import application.applicationModule
import org.koin.core.context.startKoin

fun main(args: Array<String>) {

    startKoin{
        // use Koin logger
        printLogger()
        // declare modules
        modules(applicationModule)
    }

    val application = TriviaGame()

    application.startApplication()

}