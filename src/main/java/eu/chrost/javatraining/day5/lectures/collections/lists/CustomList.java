package eu.chrost.javatraining.day5.lectures.collections.lists;

class CustomListElement {
    Object value;
    CustomListElement next;
    CustomListElement prev;
}

public class CustomList {
    CustomListElement head;

    public void add(Object value) {
        //do nothing
    }

    public Object elementAt(int index) {
        return null;
    }

    public static void main(String[] args) {
        CustomList list = new CustomList();
        String s = "ala";
        list.add(s);
        String s2 = (String)list.elementAt(0);

        list.add(5);
    }
}


