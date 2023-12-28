package org.example.Lamda;

public class PredicateName implements Predicate{
    @Override
    public boolean authenticated(User user) {
        if (user.getName().equals("john")){
            System.out.println("success");
            return true;
        }
        else{
            System.out.println("name isn't equal");
            return false;
        }
    }
}
