package com.learning.hackerrank;

import java.math.BigInteger;

public class TaumBday {
    public static void main(String[] args) {
        int b=95677,  w=39394,  bc=86983,  wc=311224,  z=588538;
        BigInteger minCost;
        if(bc>wc+z) minCost = BigInteger.valueOf((long) b *(wc+z)).add(BigInteger.valueOf((long) w *wc));
        else if(wc>bc+z) minCost = BigInteger.valueOf((long) b *bc).add(BigInteger.valueOf((long) w *(bc+z)));
        else minCost = BigInteger.valueOf((long) b *bc).add(BigInteger.valueOf((long) w *wc));
        System.out.println(minCost.longValue());
    }
}
