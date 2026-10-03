import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

//Multiple launches 
fun main() = runBlocking {
    println("Starting 5 Coroutines")

    repeat(5) { id ->
        launch {
            val randomDay = Random.nextLong(100, 1001)
            delay(randomDay)
            println("Coroutine #$id finished after ${randomDay}ms")
        }
    }
    println("Finished all coroutines")
}