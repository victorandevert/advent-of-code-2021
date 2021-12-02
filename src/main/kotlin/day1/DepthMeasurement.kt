package day1

class DepthMeasurement {

    fun countIncreases(measures: List<Int>): Int =
        measures.zipWithNext { current, next -> current < next }.filter { it }.count()
}