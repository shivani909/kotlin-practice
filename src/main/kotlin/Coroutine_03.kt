import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random


//Countdown with cancellation
fun main() = runBlocking<Unit> {
    println("Starting Countdown")

    val job = launch {
        try {
            for (i in 10 downTo 1) {
                println("Countdown: $i ...")
delay(500)
            }
                println("Countdown done!")
        } catch (e: CancellationException) {
            println("Countdown was interrupted early!")

        }
    }
    delay(3000L)

    println("\\n 3 seconds are up! Cancelling the countdown...")
   job.cancel()

    job.join()
    println("\t Done")
}