import repo.Notebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Lenuvo > Asos > MacNote > Eser > Xamiou

        List<Notebook> notebook = new ArrayList<>();
        Notebook[] arr = new Notebook[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Notebook.brandGen();
        }

        Collections.addAll(notebook, arr);

        Notebook.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
