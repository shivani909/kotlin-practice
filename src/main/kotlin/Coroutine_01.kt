import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

//Sequential vs Parallel
suspend fun fakeNetworkCall(id: Int): String {
    delay(1000)
    return "Result $id"
}

fun main() = runBlocking {
   println("Starting sequential execution")

    val timeTaken = measureTimeMillis {
        val res1 = fakeNetworkCall(1)
        val res2 = fakeNetworkCall(2)
        val res3 = fakeNetworkCall(3)
        println( "$res1, $res2, $res3")
    }
    println("Completed in ${timeTaken}ms\n")
}