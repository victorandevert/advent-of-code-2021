package day7

class Crab {
    fun alignHorizontally(positions: List<Int>): Int = alignWithLessCost(1,positions, positions.sum())

    private tailrec fun alignWithLessCost(n: Int, positions: List<Int>, fuelAmount: Int): Int{
        if (n<=positions.maxOf { it }){
            val newPositions=positions.map {
                if(it>=n)it-n
                else n-it
            }
            if(newPositions.sum()<fuelAmount) return alignWithLessCost(n+1, positions, newPositions.sum())
        }
        return fuelAmount
    }
}

