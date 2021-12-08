package day2

import kotlin.math.absoluteValue

class Submarine {
    var forward = 0
    var depth = 0
    var position = 0
    var aim = 0


    fun dive(command: List<String>): Int{
        command.forEach {
            val (direction, value) = Pair(
                it.substringBefore(" ").trim(),
                it.substringAfter(" ").trim().toInt()
            )

            if (direction == "forward") {
                forward += value
                if (aim >0){
                    depth+=(value*aim)
                }
            } else if (direction == "up"){
                aim-=value
            }else if (direction=="down"){
                aim+=value
            }

        }
        if (forward!=0 && depth != 0) {
            position = depth*forward
        }else if (forward == 0) {
            position = aim
        }else{
            position = forward
        }

        return position.absoluteValue
    }
}