package day6

class Lanternfish {

    fun spawn(fish: MutableList<Int>, days: Int): Int {
        repeat(days){
            val newFish = mutableListOf<Int>()
            fish.indices.forEach {
                when {
                    fish[it] != 0 -> fish[it]--
                    else -> {
                        fish[it]=6
                        newFish.add(8)
                    }
                }
            }
            fish.addAll(newFish)
        }
        return fish.size
    }
}