class LeetCode17 {

    val map = mapOf(
        '2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
        '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz"
    )

    var index: Int = 0

    fun letterCombinations(digits:String): List<String>{
        val result: ArrayList<String> = ArrayList()
        val temp: StringBuilder = StringBuilder()
        val nums: CharArray = digits.toCharArray()
        permute(result, temp, nums, 0)
        return result
    }

    fun permute(
        result: ArrayList<String>,
        temp: StringBuilder,
        nums: CharArray,
        ind: Int
    ){
        if(ind==nums.size) result.add(index++,String(temp))
        else{
            val letterArray: String = map[nums[ind]] ?: ""
            for(j in letterArray){
                temp.append(j)
                permute(result, temp, nums, ind+1)
                temp.deleteAt(ind)
            }
        }
    }
}


fun main(){
    println("All permutations -> ${LeetCode17().letterCombinations("233")}")
}