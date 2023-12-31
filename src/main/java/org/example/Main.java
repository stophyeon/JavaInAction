package org.example;

import org.example.Lamda.Predicate;
import org.example.Lamda.User;
import org.example.Sync.Sync;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Sync johnPhone = new Sync("john");
        List<Sync> friends = new ArrayList<>();
        friends.add(new Sync("john"));
        friends.add(new Sync("sindy"));
        friends.add(new Sync("Bob"));
        friends.add(new Sync("Alice"));
        friends.add(new Sync("Selly"));
        long start = System.nanoTime();
        List<CompletableFuture<String>> toOwhen =friends.stream()
                .map(friend->CompletableFuture.supplyAsync(friend::call))
                .toList();
        List<String> deerOwhen = toOwhen.stream().map(CompletableFuture::join).toList();
        Optional<String> message = deerOwhen.stream().reduce((a,b)->a+", "+b);
        long end = System.nanoTime()-start;
        System.out.println(message);
        System.out.println(end/1_000_000 +"msec");
    }

}