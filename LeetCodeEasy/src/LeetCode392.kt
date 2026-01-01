class LeetCode392 {

    fun isSubsequence(s: String, t: String): Boolean {
        if(s.isEmpty())
            return true
        else{
            var p1 = 0
            var p2 = 0
            val l1 = s.length
            val l2 = t.length
            while(p2<l2){
                if(p1==l1)
                    return true
                if(t[p2]==s[p1]){
                    p1+=1
                }
                p2+=1
            }
            return p1==l1
        }
    }
}