package Tri;

import java.util.ArrayList;
import java.util.Collections;

public class quickSort {
	public static int partitionner(ArrayList<Integer> t, int bas, int haut) {
        int pivot = t.get(haut);
        int i = bas - 1;

        for (int j = bas; j <= haut - 1; j++) {
            if (t.get(j) <= pivot) {
                i = i + 1;
                Collections.swap(t, i, j);
            }
        }

        Collections.swap(t, i + 1, haut);
        return i + 1;
    }
	
	public static void quicksort(ArrayList<Integer> t, int bas, int haut) {
		if (bas < haut) {
            int pi = partitionner(t, bas, haut);
            quicksort(t, bas, pi - 1);
            quicksort(t, pi + 1, haut);
        }
    }
	
	public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<>();
        t.add(10);
        t.add(7);
        t.add(8);
        t.add(9);
        t.add(1);
        t.add(5);

        quicksort(t, 0, t.size()-1);
        System.out.println("Résultat : " + t);
    }
}