
/*
fun main(args: Array<String>) {
    var arr = IntArray(0)
    arr = arr add 3 // create new array and add element at the end
    arr = arr add 7 add 1
    arr = arr add 9 add 6 add 8
    arr = arr insert 5 at 2 // insert 5 into position 2
    arr = arr `remove at` 3 // set to 0 at position 3
    arr = arr `remove at` 1
    arr print 2..5 // 5 0 6 8

    // optional
    println()
    println(arr get size) // 6
    arr print all // 3 0 5 0 6 8
}*/

infix fun IntArray.print(r: IntRange) {

    for(i in r) {
        print("${this[i]} ")
    }

}

infix fun IntArray.add(newVal: Int): IntArray = intArrayOf(*this, newVal) // done


infix fun IntArray.`remove at`(index: Int): IntArray {
    val tempArr = this
    tempArr[index] = 0
    return tempArr
}

infix fun IntArray.insert(value: Int): IntArray {
    var array: IntArray = this

    array = array add value

    return array
}


infix fun IntArray.at(index: Int): IntArray {

    val theValue = this[this.size - 1]

    val tempArray = IntArray(this.size - 1)

    for(ind in 0 until this.size - 1) {
        tempArray[ind] = this[ind]
    }

    when {
        index > this.size - 1 -> println("Take lower index")
        else -> tempArray[index] = theValue
    }

    return tempArray
}



fun main()
{
    var arr = IntArray(0)
    arr = arr add 3
    arr = arr add 7 add 1
    arr = arr add 9 add 6 add 8

    for(el in arr) {
        print("$el ")
    }
    println("\n")

    arr = arr `remove at` 3
    arr = arr `remove at` 1

    for(el in arr) {
        print("$el ")
    }
    println("\n")

    arr print 2..4

    println("\n")

    arr = arr insert 5 at 2
    arr = arr insert 222 at 5
    for(el in arr) {
        print("$el ")
    }
    println("\n")


}

