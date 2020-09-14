package com.example.demo.web;

/**
 * @author xiong
 */
public class Test15 {

    public static void main(String[] args) {
        // 1 2 6 4 3 5
        int[] arr = new int[]{6, 5, 2, 5, 6, 4, 3, 5};
        arr = new Test15().insertSort(arr);

        System.out.println();
        System.out.println("insertSort ===============================");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        arr = new int[]{6, 5, 2, 5, 6, 4, 3, 5};
        arr = new Test15().bubbleSort(arr);
        System.out.println();
        System.out.println("bubbleSort ===============================");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        arr = new int[]{6, 5, 2, 5, 6, 4, 3, 5};
        arr = new Test15().selectSort(arr);
        System.out.println();
        System.out.println("selectSort ===============================");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        arr = new int[]{6, 5, 2, 5, 6, 4, 3, 5};
        arr = new Test15().mergeSort(arr);
        System.out.println();
        System.out.println("mergeSort ===============================");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        arr = new int[]{6, 5, 2, 5, 6, 4, 3, 5};
        arr = new Test15().quickSort(arr);
        System.out.println();
        System.out.println("quickSort ===============================");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        arr = new int[]{4, 2, 5, 12, 3, 8, 1, 9, 6};
        int index = new Test15().quickSortK(arr, 0, arr.length - 1, 2);
        System.out.println();
        System.out.println("quickSortK ===============================");
        System.out.println(arr[index]);
    }

    /**
     * 简单插入排序
     * @param arr
     * @return
     */
    public int[] insertSort(int[] arr) {
        //前面是有序的，每次将i与 i前面的从尾到头进行对比，大于则移动，否则停止移动，进行插入
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] < v) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = v;
        }

        return arr;
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr) {
        //每次把最大的冒泡到最后面，所以后面是有序的，每次冒泡n-i之前的
        //6, 5, 2, 5, 6, 4, 3, 5
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        return arr;
    }

    /**
     * 简单选择排序
     * 每次把最大的放在最前面，所以前面是有序的，j从i+1开始，i+1之前的都是有序的
     * @param arr
     * @return
     */
    public int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }

        return arr;
    }

    /**
     * 归并排序则先分成最小粒度，然后再按顺序合并
     * @param arr
     * @return
     */
    public int[] mergeSort(int[] arr) {
        mergeSortSub(arr, 0, arr.length - 1);
        return arr;
    }

    public void mergeSortSub(int[] arr, int s, int r) {
        if (s >= r) {
            return;
        }
        int q = (s + r) / 2;
        mergeSortSub(arr, s, q);
        mergeSortSub(arr, q + 1, r);
        mergeResult(arr, s, q, r);
    }

    /**
     * 主要是将两个顺序数组合并为一个顺序数组
     * @param target
     * @param s
     * @param q
     * @param r
     */
    public void mergeResult(int[] target, int s, int q, int r) {
        int[] temp = new int[target.length];
        int k = s;
        int i = s;
        int j = q + 1;
        while (i <= q && j <= r) {
            if (target[i] > target[j]) {
                temp[k++] = target[i++];
            } else {
                temp[k++] = target[j++];
            }
        }

        while (i <= q) {
            temp[k++] = target[i++];
        }

        while (j <= r) {
            temp[k++] = target[j++];
        }

        for (int m = s; m <= r; m++) {
            target[m] = temp[m];
        }
    }

    /**
     * 快速排序
     * @param arr
     * @return
     */
    public int[] quickSort(int[] arr) {
        quickSortSub(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSortSub(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(arr, p, r);
        quickSortSub(arr, p, q - 1);
        quickSortSub(arr, q + 1, r);
    }

    /**
     * 分区，每次从最右边为基数
     * @param arr
     * @param p
     * @param r
     * @return
     */
    public int partition(int[] arr, int p, int r) {
        int value = arr[r];
        int i = p;
        int j = p;
        for (; j < r; j++) {
            if (value < arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }

    /**
     * 利用快速排序的思想寻找第K大元素，需要从大到小排序利用快排
     * 比如
     * 9,8,6,1,3,4
     * 6为基数，则第三大元素就是下标为3的，因为左边的都比基数大，右边的都比基数小
     * @param arr
     * @param p
     * @param r
     * @param k
     * @return
     */
    public int quickSortK(int[] arr, int p, int r, int k) {
        int q = partition(arr, p, r);
        int temp = q + 1;
        if (temp > k) {
            return quickSortK(arr, p, q - 1, k);
        } else if (temp < k) {
            return quickSortK(arr, q + 1, r, k);
        } else {
            return q;
        }
    }
}
