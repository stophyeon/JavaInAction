package org.example;

public class PredicateEmail implements Predicate{
    @Override
    public boolean authenticated(User user) {
        if (user.getEmail().equals("jj6778")){
            System.out.println("success");
            return true;
        }
        else{
            System.out.println("email isn't equal");
            return false;
        }
    }


}
