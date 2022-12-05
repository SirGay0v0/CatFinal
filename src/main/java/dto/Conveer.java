package dto;

import java.util.ArrayList;

public class Conveer {
    public void conveer(){
        ArrayList<Cat> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Cat cat = new Cat(i, "Cat#"+i);
            myList.add(cat);
        }
    }
}
