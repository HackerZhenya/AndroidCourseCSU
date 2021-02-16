import java.util.stream.IntStream
import kotlin.random.Random
import kotlin.streams.toList

class OpossumGroupGenerator(
    private val minOpossumCount: Int,
    private val maxOpossumCount: Int,
) {
    private fun makeOpossum() = Opossum(
        Random.nextInt(0, 100),
        Random.nextInt(0, 100),
        Random.nextInt(0, 100),
        Random.nextInt(0, 100),
    )

    fun make(): List<Opossum> = IntStream
        .range(minOpossumCount, maxOpossumCount)
        .mapToObj { makeOpossum() }
        .toList()
}