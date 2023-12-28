package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static String predicate(User user, Predicate p){
        if (p.authenticated(user)){
            return "success";
        }
        else{
            return "fail";
        }
    }
    public static void main(String[] args) {
        User user1 = new User("john", "8257", "jj6778");
        User user2 = new User("jasen", "8257", "jj6778");
//        PredicateEmail predicateEmail = new PredicateEmail();
//        PredicateName predicateName = new PredicateName();
//        PredicatePassword predicatePassword = new PredicatePassword();
//        user1.login(predicateEmail);
//        user1.login(predicateName);
//        user1.login(predicatePassword);
//        String log = predicate(user1,(user)->user.getName().equals("john"));
//        System.out.println(log);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        System.out.println(userList.get(0));
        System.out.println(userList.get(1));
        List<String> userName=userList.stream()
                .sorted(Comparator.comparing(User::getName))
                .map(User::getName)
                .toList();
        System.out.println(userName.get(0));
        System.out.println(userName.get(1));
    }

}