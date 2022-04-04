package repo;

import java.util.*;

public class Notebook {

    private String name;
    private int price;
    private int RAM;

    public Notebook(String name, int price, int RAM) {
        this.name = name;
        this.price = price;
        this.RAM = RAM;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRAM() {
        return RAM;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", RAM=" + RAM +
                '}';
    }

    public static Notebook brandGen() {
        int num = (int) (Math.random() * 5);
        Notebook notebook;

        switch (num) {
            case 0:
                notebook = new Notebook("Lenuvo", (int) (Math.random() * (2000 - 200) + 500), 1);
                break;
            case 1:
                notebook = new Notebook("Asos", (int) (Math.random() * (2000 - 200) + 500), (int) (Math.random() * 24 - 4) + 4);
                break;
            case 2:
                notebook = new Notebook("MacNote", (int) (Math.random() * (2000 - 200) + 200), (int) (Math.random() * 24 - 4) + 4);
                break;
            case 3:
                notebook = new Notebook("Eser", (int) (Math.random() * (2000 - 500) + 200), (int) (Math.random() * 24 - 4) + 4);
                break;
            case 4:
                notebook = new Notebook("Xamiou", (int) (Math.random() * (2000 - 500) + 200), (int) (Math.random() * 24 - 4) + 4);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return notebook;
    }


    public static void sort(Notebook[] arr) {

        boolean isSorted = false;
        Notebook num;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                    isSorted = false;
                    num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                }
                    if (arr[i].getPrice() == arr[i + 1].getPrice()) {
                        if (arr[i].getRAM() > arr[i + 1].getRAM()) {
                            isSorted = false;
                            num = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = num;
                        }
                    }

//                        if (arr[i].getRAM() == arr[i + 1].getRAM()) {
//                            isSorted = false;
//                            Arrays.sort(arr, Comparator.comparing(Notebook::getName));
//                        }
                    }
                }
            }

        }
