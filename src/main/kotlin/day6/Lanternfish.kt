package day6

class Lanternfish {

    fun spawn(fish: MutableList<Int>, days: Int): Int {
        var newFish = 0
        repeat(days){
            fish.indices.forEach { index ->
                if (fish[index] != 0){
                    fish[index]--
                }else{
                    fish[index]=6
                    newFish++
                }
            }
            for (i in 0 until newFish){
                fish.add(8)
            }
            newFish=0
        }
        return fish.size
    }
}