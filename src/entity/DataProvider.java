package entity;

import java.util.ArrayList;

public class DataProvider {
    public ArrayList<User> getDate() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Banan", "123@gmail.c"));
        list.add(new User("Tomat", "1420@gmail.c"));
        list.add(new User("Jek", "7130@gmail.c"));
        list.add(new User("John", "71230@gmail.c"));
        list.add(new User("Jordan", "7130123@gmail.c"));
        return list;
    }
}
