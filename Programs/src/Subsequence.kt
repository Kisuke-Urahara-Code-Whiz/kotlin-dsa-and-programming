fun main() {
    println("Enter the number of elements in the array : ")
    val size: Int = readln().toInt()
    val arr = IntArray(size)
    for(i in 0..<size){
        println("Enter element $i")
        arr[i] = readln().toInt()
    }
    println("Array ->\n${arr.contentToString()}")
    val result : ArrayList<ArrayList<Int>> = ArrayList()
    subsequence(result, ArrayList(), arr, 0)
    println("All subsequences -> ")
    for(i in result){
        println(i.toString())
    }
}

fun subsequence(result: ArrayList<ArrayList<Int>>, temp: ArrayList<Int>, arr: IntArray, index:Int){
    if(arr.isNotEmpty()){
        val newArr = IntArray(arr.size-1)
        for(i in 1..<arr.size){
            newArr[i-1] = arr[i]
        }
        temp.addLast(arr[0])
        subsequence(result, temp, newArr, index+1)
        temp.removeLast()
        subsequence(result, temp, newArr, index+1)
    }
    else{
        result.addLast(ArrayList(temp))
    }
}


