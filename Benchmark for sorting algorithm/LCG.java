package com.example;

public class LCG {
    private long seed;

    public LCG(long seed) {
        this.seed = seed;
    }


    public int next(int bits) {
        this.seed = (this.seed * 25214903917L + 11L) & ((1L << 48) - 1);
        return (int) (this.seed >>> (48 - bits));
    }

    public int nextInt(int upper) {
        int b, v;

        do {
            b = this.next(31);
            v = b % upper;
        } while (b - v + (upper - 1) < 0);

        return v;
    }

}