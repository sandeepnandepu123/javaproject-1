package com.sortings;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x == y) {  //(==)method compares memory address.
            System.out.println("X and Y are equal");
        } else {
            System.out.println("X and Y are not equal");
        }


        User user1 = new User(1, "Mike");
        User user2 = new User(2, "Max");
        if (user1.equals(user2)) {     //(.equlas) method  compares content based on id.
            System.out.println("Both users are same");
        } else {
            System.out.println("Both users are not same");
        }

        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        System.out.println("userset size is :" +userSet.size());

        Set<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(10);
        System.out.println("integerset size is :" +integers.size());

        Map<Integer,User> map = new HashMap<>();
        map.put(1,user1);
        map.put(1,user2);
        System.out.println("Map size is :" +map.size());

        List<Integer> integers1 = new ArrayList<>();
        integers1.add(40);
        integers1.add(26);
        integers1.add(12);
        Collections.sort(integers1);
        System.out.println("sorted list is :" +integers1);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user1);
    //    Collections.sort(userList,Comparator.comparing(user -> user.id));
        Collections.sort(userList);
        System.out.println("sorted user list is :" +userList);
    }
}