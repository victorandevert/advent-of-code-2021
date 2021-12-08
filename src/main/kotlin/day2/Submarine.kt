package day2

class Submarine {
    var forward = 0
    var depth = 0

    fun dive(command: String): Int{
        val (direction, value) = Pair(
            command.substringBefore(" ").trim(),
            command.substringAfter(" ").trim().toInt())

        if (direction == "forward"){
            forward+=value
        }else{
            depth+=value
        }

        return if (forward!=0 && depth != 0) {
            depth*forward
        }else if (forward == 0) {
            depth
        }else{
            forward
        }

    }
}