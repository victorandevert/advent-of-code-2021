package day6

class Lanternfish {

    tailrec fun spawn(fish: MutableList<Int>, days: Int): Any {
        return when (days) {
            0 -> fish.size
            else -> spawn(fish, days - 1)
        }
    }
}