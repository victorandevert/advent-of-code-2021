package day1

class DepthMeasurement {

    fun countIncreases(measures: List<Int>): Int =
        measures.zipWithNext { current, next -> current < next }.count { it }

    fun countIngreasesFromThreeSlidingWindow(measures: List<Int>): Int =
        measures.windowed(3) { it.sum() }
            .zipWithNext { current, next -> current < next  }
            .count{it}
}