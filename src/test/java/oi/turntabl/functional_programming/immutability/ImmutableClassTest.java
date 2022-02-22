package oi.turntabl.functional_programming.immutability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableClassTest {

    private ImmutableClass immutableClass;
    private ImmutableArray immutableArray;

    @BeforeEach
    void setUp() {
        immutableClass = new ImmutableClass(23, "Lizzy");
        immutableArray = new ImmutableArray();
    }

    @Test
    void checkNameOnImmutableClass(){
//        given
        String name = "Lizzy";
//        when
        String exceptedName = immutableClass.getName();
//        then
        assertEquals(exceptedName,name);
    }

    @Test
    void checkAgeOnImmutableClass(){
//        given
        int age = 23 ;
//        when
        int exceptedAge = immutableClass.getId();
//        then
        assertEquals(exceptedAge, age);
    }

}