class LeetCode47 {

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result : ArrayList<ArrayList<Int>> = ArrayList()
        val temp : ArrayList<Int> = ArrayList()
        val used = BooleanArray(nums.size)
        nums.sort()
        permute(result,temp,nums,used,0)
        return result
    }

    fun permute(
        result: ArrayList<ArrayList<Int>>,
        temp: ArrayList<Int>,
        arr: IntArray,
        used: BooleanArray,
        index: Int
    ){
        if(index==used.size) result.add(ArrayList(temp))
        else {
            for (i in 0..<used.size) {
                if(used[i]) continue
                if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;
                temp.add(index, arr[i])
                used[i] = true
                permute(result, temp, arr, used, index+1)
                temp.removeLast()
                used[i] = false
            }
        }
    }
}

fun main(){
    val obj = LeetCode47()
    val result = obj.permuteUnique(intArrayOf(1,2,2,1))
    println(result)
}