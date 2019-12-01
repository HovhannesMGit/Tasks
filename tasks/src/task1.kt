
/*
fun main(args: Array<String>) {
    // Create forEachWord function
    "please print each word".forEachWord { word ->
        println(word)
    }

    // create toColor function
    val c = (-0x775FB34F).toColor()
    println(c) // Color(a=136, r=160, g=76, b=177)

    // create bitIsOneAtPosition
    print(4.bitIsOneAtPosition(3))
}*/


fun Int.toColor(): String {
    fun decimalEquivalent(hex: String): Int {
        var decimal = 0
        for ((i,e) in hex.withIndex()) {
            when {
                e in '0'..'9' -> decimal += (e.toInt() - 48) * Math.pow(16.0,hex.length - 1 - i.toDouble()).toInt()
                e in 'A'..'F' -> decimal += (e.toInt() - 55) * Math.pow(16.0,hex.length - 1 - i.toDouble()).toInt()
                e in 'a'..'f' -> decimal += (e.toInt() - 87) * Math.pow(16.0,hex.length - 1 - i.toDouble()).toInt()
            }
        }
        return decimal
    }

    val hexString = Integer.toHexString(this).toString()
    println(hexString)

    val a: Int = decimalEquivalent(hexString.substring(0,2))
    val r: Int = decimalEquivalent(hexString.substring(2,4))
    val g: Int = decimalEquivalent(hexString.substring(4,6))
    val b: Int = decimalEquivalent(hexString.substring(6,8))

    return "Color(a=$a, r=$r, g=$g, b=$b)"
}





fun String.forEachWord(action: (String) -> Unit) {
    var str = ""

    for(ch in this) {
        if(ch == ' ') {
            action(str)
            str = ""
        } else {
            str += ch
        }
    }

    if(str != "") action(str)
}


fun Int.bitIsOneAtPosition(index: Int): Boolean {

    var numb = this
    var reversedBinaryRepr = ""

    while(numb != 0) {
        reversedBinaryRepr += if(numb % 2 == 0) '0' else '1'
        numb /= 2
    }

    //println(reversedBinaryRepr.reversed())

    if(reversedBinaryRepr.length <= index) return false

    return reversedBinaryRepr[index] == '1'

}


fun main()
{
    var rgb = (-0x775FB34F).toColor()

    println(rgb)

    rgb = (0x12453211).toColor()

    println(rgb)

    println()

    "I love you Maria".forEachWord { word -> println(word) }


    println()
    //12 in binary is 1100
    println(12.bitIsOneAtPosition(0))
    println(12.bitIsOneAtPosition(1))
    println(12.bitIsOneAtPosition(2))
    println(12.bitIsOneAtPosition(3))


}