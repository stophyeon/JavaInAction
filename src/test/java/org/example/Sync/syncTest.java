package org.example.Sync;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class syncTest {
    @Test
    void mainSync(){
        Sync sync = new Sync("john");
        sync.call_1();
        sync.call_2();
        sync.call_3();
    }

}