class LeetCode39{

    var result: ArrayList<ArrayList<Int>> = ArrayList()

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val temp: ArrayList<Int> = ArrayList()
        for(i in 0..<candidates.size){
            if(candidates[i]>target) continue
            temp.add(candidates[i])
            sum(temp, candidates, target-candidates[i], i)
            temp.removeLast()
        }
        return result
    }

    fun sum(
        temp: ArrayList<Int>,
        candidates: IntArray,
        target: Int,
        index: Int
    ){
        if(target==0) result.add(ArrayList(temp))
        else{
            for(i in index..<candidates.size){
                if(candidates[i]>target) continue
                temp.add(candidates[i])
                sum(temp, candidates, target-candidates[i], i)
                temp.removeLast()
            }
        }
    }
}

fun main(){
    println(LeetCode39().combinationSum(intArrayOf(3,12,9,11,6,7,8,5,4),15))
}