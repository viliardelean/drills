package com.ardelean.drills.searching;

public class Numbers {

    // Binary search with loop. Make sure you sort the array if it isn't sorted
    // takes O(log n) if the array is sorted. if not, sorting takes n log n.
    // returns the position of the input number, or -1 if not found
    public int binarySearch(int[] sorted, int target) {
        int beginIndex = 0;
        int lastIndex = sorted.length - 1;

        while (beginIndex <= lastIndex) {
            int middleIndex = (beginIndex + lastIndex) / 2;
            int value = sorted [middleIndex];
            if (value == target) {
                return middleIndex;
            }
            if (target < value) {
                lastIndex = middleIndex - 1;
            } else {
                beginIndex = middleIndex + 1;
            }
        }
        return - 1;
    }

    // Binary search recursive. Make sure you sort the array if it isn't sorted
    // takes O(log n) if the array is sorted. if not, sorting takes n log n.
    // returns the position of the input number, or -1 if not found
    public int binarySearchRecursive(int[] sorted, int target) {
        return search(sorted, 0, sorted.length - 1, target);
    }

    private int search(int[] sorted, int first, int last, int target) {
        if (last < first) {
            return - 1;
        }

        int middlePoint = (first + last) / 2;
        int value = sorted[middlePoint];
        if (value == target) {
            return middlePoint;
        }
        if (target < value) {
            return search(sorted, first, middlePoint - 1, target);
        } else {
            return search(sorted, middlePoint + 1, last, target);
        }
    }
}
