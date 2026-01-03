class LeetCode784 {

    var resultIndex: Int = 0

    fun Char.reverseCase() : Char{
        if(this.isLowerCase()) return this.uppercaseChar()
        return this.lowercaseChar()
    }

    fun letterCasePermutation(s: String): List<String> {
        val arr = s.toCharArray()
        val sb = StringBuilder()
        val result: ArrayList<String> = ArrayList()
        permute(result,sb,arr,0)
        return result
    }

    fun permute(
        result: ArrayList<String>,
        sb: StringBuilder,
        arr: CharArray,
        index: Int
    ){
        if(index==arr.size) result.add(resultIndex++, String(sb))
        else{
            permute(result, sb.append(arr[index]), arr, index+1)
            if(arr[index].isLetter()){
                permute(result, sb.deleteAt(index).append(arr[index].reverseCase()), arr, index+1)
            }
            sb.deleteAt(index)
        }
    }
}

fun main(){
    println("Permutations -> \n${LeetCode784().letterCasePermutation("ProGyA24")}")
}