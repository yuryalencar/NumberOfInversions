/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.edu.br;

/**
 *
 * @author YURY
 */
public class InversionAnalyzer {

    private long numberOfInversions;

    public long getNumberOfInversions(Integer[] data) {
        numberOfInversions = mergeSort(data, 0, data.length - 1);
        return this.numberOfInversions;
    }

    private long mergeSort(Integer[] data, int start, int end) {
        long count = 0;
        if (start < end) {
            int beginning = (start + end) / 2;
            count = mergeSort(data, start, beginning)
                    + mergeSort(data, beginning + 1, end)
                    + merge(data, start, beginning, end);
        }
        return count;
    }

    private long merge(Integer[] data, int start, int beginning, int end) {
        Integer[] aux = data.clone();
        int i = start;
        int j = beginning + 1;
        long count = 0;
        for (int k = start; k <= end; k++) {
            if (i > beginning) {
                data[k] = aux[j++];
            } else if (j > end) {
                data[k] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                data[k] = aux[i++];
            } else {
                data[k] = aux[j++];
                count += beginning - i + 1;
            }
        }
        return count;
    }
}
