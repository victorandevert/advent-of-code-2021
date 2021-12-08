package day6

class Lanternfish {

    fun spawn(fish: List<Int>, days: Int): Long {
        val newFishes = arrayListOf(0L,0L,0L,0L,0L,0L,0L,0L,0L).apply { fish.map { this[it]++ }  }
        repeat(days){
            val nextGenerationFish = arrayListOf(0L,0L,0L,0L,0L,0L,0L,0L,0L)
            for (age in 0..8) when (age) {
                8 -> {
                    nextGenerationFish[8]=newFishes.first()
                    nextGenerationFish[6]+=nextGenerationFish[8]
                }
                else -> nextGenerationFish[age]=newFishes[age+1]
            }
            newFishes.clear()
            newFishes.addAll(nextGenerationFish)
        }
        return newFishes.sum()
    }
}