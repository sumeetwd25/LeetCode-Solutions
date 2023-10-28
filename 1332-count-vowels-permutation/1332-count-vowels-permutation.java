public class Solution {
    public int countVowelPermutation(int n) {
        final int MOD = 1000000007;
        
        long a = 1, e = 1, i = 1, o = 1, u = 1;
        
        for (int j = 1; j < n; j++) {
            long a_next = (e +i + u) % MOD;
            long e_next = (a + i) % MOD;
            long i_next = (e + o) % MOD;
            long o_next = i;
            long u_next = (i + o) % MOD;
            
            a = a_next;
            e = e_next;
            i = i_next;
            o = o_next;
            u = u_next;
        }
        
        return (int)((a + e + i + o + u) % MOD);
    }
}

/**
given followed to:
a->e
e->a,i
i->a,e,o,u
o->i,u
u->a

visual for each word can come from:
a->e,i,u
e->a,i
i->e,o
o->i
u->i,o
 */