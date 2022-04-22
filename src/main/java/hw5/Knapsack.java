package hw5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Knapsack {

    public static void main(String[] args) {

        Items[] arr = {
                new Items("Laptop", 3, 2000),
                new Items("TV", 5, 2700),
                new Items("Ring", 1, 500),
                new Items("Phone", 2, 800)
        };
        findMaxPrice(arr);

    }

    @AllArgsConstructor
    @Getter
    private static class Items {
        private String name;
        private int weight;
        private int price;
    }

    public static int findMaxPrice(Items[] arr) {
        int maxPrice = 0;
        int capacity = 5;
        List<Integer> knapsacks = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i].getPrice();
            capacity -= arr[i].getWeight();

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j].getWeight() <= capacity) {
                    temp += arr[j].getPrice();
                    capacity -= arr[j].getWeight();
                    knapsacks.add(temp);
                    capacity += arr[j].getWeight();
                    temp-=arr[j].getPrice();
                }
            }
            if (temp > maxPrice) {
                maxPrice = temp;
                capacity = 0;

            }
        }

        System.out.println(knapsacks);
        System.out.println(maxPrice);
        return maxPrice;
    }
}
