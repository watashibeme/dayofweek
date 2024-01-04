import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.text.DateFormatSymbols
import java.util.Locale

fun main() {
    // Input Validation
    var da: Int
    do {
        println("Enter a number (1-7):")
        da = readLine()?.toIntOrNull() ?: 0
    } while (da !in 1..7)

    // Day Name Lookup
    val result = when (da) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    // Current Day Feature
    val currentDay = LocalDate.now().dayOfWeek.name
    println("Current day: $currentDay")

    // Custom Day Names
    val customDays = mapOf(
        1 to "Workday",
        2 to "Meeting Day",
        // Add custom names for other days
        7 to "Relaxation Day"
    )
    val customResult = customDays[da] ?: "Invalid day."
    println(customResult)

    // Localization
    val locale = Locale.getDefault()
    val localizedDays = DateFormatSymbols(locale).weekdays
    val localizedResult = localizedDays[da] ?: "Invalid day."
    println(localizedResult)
}
