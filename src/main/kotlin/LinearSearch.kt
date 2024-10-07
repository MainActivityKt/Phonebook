import utils.SOURCE_FILE_PATH
import utils.SUB_FILE_PATH
import java.io.File
import java.time.Duration
import java.time.Instant


fun printResult(startingTime: Instant, endingTime: Instant, itemsFound: Int, totalItems: Int) {
    val mins = Duration.between(startingTime, endingTime).toMinutes()
    val secs = Duration.between(startingTime, endingTime).toSeconds()
    val milliSecs = Duration.between(startingTime, endingTime).toMillis()

    println("Found $itemsFound / $totalItems entries. Time taken: $mins min. $secs sec. $milliSecs ms.")
}


fun main() {
    val directoryFile = File(SOURCE_FILE_PATH)
    val targetFile = File(SUB_FILE_PATH)

    val sourceList = directoryFile.readLines().map { it.split(" ").drop(1).joinToString(" ") }
    val targetList = targetFile.readLines()

    val startingTime = Instant.now()
    println("Start searching...")

    val itemsFound = targetList.count { it in sourceList }
    val endingTime = Instant.now()

    printResult(startingTime, endingTime, itemsFound, targetList.size)
}

