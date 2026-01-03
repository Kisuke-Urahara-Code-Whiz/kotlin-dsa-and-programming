class LeetCode77 {

    val result: ArrayList<ArrayList<Int>> = ArrayList()

    fun combine(n: Int, k: Int): List<List<Int>> {
        val temp: ArrayList<Int> = ArrayList()
        for(i in 1..n) {
            temp.add(i)
            combinate(temp, n, k-1, i+1)
            temp.removeLast()
        }
        return result
    }

    fun combinate(
        temp : ArrayList<Int>,
        n: Int,
        k: Int,
        counter: Int,
    ) {
        if(k==0) result.add(ArrayList(temp))
        else{
            for(i in counter..n){
                temp.add(i)
                combinate(temp, n, k-1, i+1)
                temp.removeLast()
            }
        }
    }
}

fun main(){
    println("All Combinations -> \n${LeetCode77().combine(4,3)}")
}