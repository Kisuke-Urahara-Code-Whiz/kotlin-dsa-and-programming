val set: HashSet<ArrayList<Int>> = HashSet()

fun main() {
    println("Enter the number of elements in the array : ")
    val size: Int = readln().toInt()
    val arr = IntArray(size)
    val used = BooleanArray(size)
    for(i in 0..<size){
        println("Enter element $i :")
        arr[i] = readln().toInt()
    }
    println("Array ->\n${arr.contentToString()}")
    val result : ArrayList<ArrayList<Int>> = ArrayList()
    val temp : ArrayList<Int> = ArrayList()
    permute(result,temp,arr,used)
    println("All permutations -> ")
    for(i in result){
        println(i.toString())
    }
}

fun permute(
    result: ArrayList<ArrayList<Int>>,
    temp: ArrayList<Int>,
    arr: IntArray,
    used: BooleanArray
){
    if(temp.size==arr.size){
        if(!set.contains(temp)){
            set.add(ArrayList(temp))
            result.add(ArrayList(temp))
        }
    } else {
        for (i in 0..<used.size) {
            if (!used[i]) {
                temp.addLast(arr[i])
                used[i] = true
                permute(result, temp, arr, used)
                temp.removeLast()
                used[i] = false
            }
        }
    }
}

