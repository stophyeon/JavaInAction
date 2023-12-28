package org.example.Lamda;

public class PredicatePassword implements Predicate{
    @Override
    public boolean authenticated(User user) {
        if (user.getPassword().equals("8257")){
            System.out.println("success");
            return true;
        }
        else{
            System.out.println("password isn't equal");
            return false;
        }
    }
}
