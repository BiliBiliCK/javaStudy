package java_Hello;

import core.Mana;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

class hi {

    public static int length = 3048576; //10的20次幂
    private static ArrayList al = new ArrayList(length);
    private static LinkedList ll = new LinkedList();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        addNode(1);
        addNode(0);
    }

    private static void addNode(Integer sign) {
        Long start = new Date().getTime();
        for (int i = 0; i < length; i++) {

            if (sign == 1) {
                al.add(i);
            } else {
                ll.add(i);
            }
        }
        Long end = new Date().getTime();
        System.out.println(sign + ":" + (end - start));
    }

}
