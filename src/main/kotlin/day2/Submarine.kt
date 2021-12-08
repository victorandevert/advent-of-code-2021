package day2

import kotlin.math.absoluteValue

class Submarine {
    private var forward = 0
    private var depth = 0
    private var aim = 0

    fun dive(command: List<String>): Int{
        command.forEach {
            val (direction, value) = Pair(
                it.substringBefore(" ").trim(),
                it.substringAfter(" ").trim().toInt()
            )
            move(direction,value)
        }
        return multiplyForwardAndDepth()
    }

    private fun move(direction: String, value: Int){
        val orientation = Orientation.valueOf(direction.uppercase())
        when {
            orientation.isForward() -> {
                increaseForwardBy(value)
                increaseDepth(value)
            }
            orientation.isUp() -> decreaseAimBy(value)
            orientation.isDown() -> increaseAimBy(value)
        }
    }

    private fun multiplyForwardAndDepth(): Int = (depth*forward).absoluteValue

    private fun increaseForwardBy(value: Int){
        forward += value
    }

    private fun increaseAimBy(value: Int){
        aim+=value
    }

    private fun decreaseAimBy(value: Int){
        aim-=value
    }

    private fun increaseDepth(value: Int){
        if (aim > 0) depth+=(value*aim)
    }
}

enum class Orientation{
    FORWARD,
    UP,
    DOWN;

    fun isForward(): Boolean = this == FORWARD
    fun isUp(): Boolean = this == UP
    fun isDown(): Boolean = this == DOWN
}