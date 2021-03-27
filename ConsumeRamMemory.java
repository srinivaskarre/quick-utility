package com.sk;

import java.util.ArrayList;

/**
 * run from commandline for sure as java -Xmx16000m -Xms11000m com.sk.CrunchifyGenerateOOM
 */
public class ConsumeRamMemory {

    public static void main(String[] args) {
        ConsumeRamMemory memoryTest = new ConsumeRamMemory();
        try {
            memoryTest.consumeMemory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void consumeMemory() throws Exception {
        int iteratorValue = 10;
        System.out.println("\n=================> OOM test started..\n");
        ArrayList al = new ArrayList();
            for (int outerIterator = 1; outerIterator < 10000000; outerIterator++) {
                System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
                int[] arr = new int[1048576];
                al.add(arr);
            }
    }

}
