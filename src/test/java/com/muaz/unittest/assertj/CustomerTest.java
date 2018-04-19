package com.muaz.unittest.assertj;


import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;



public class CustomerTest {

    List<String> turkCities=new ArrayList<String>(Arrays.asList("istanbul","urfa","izmir"));
    List<String> abroadCities=new ArrayList<String>(Arrays.asList("boston","munih","bruksel"));

    @Test
    public void testStrings() throws Exception{
        String text1="ankara";

        assertThat(text1).isEqualTo("ankara")
                .describedAs("this is an error")
                .startsWith("an")
                .endsWith("ra")
                .contains("ka")
                .isNotEmpty()
                .isNotNull()
                .doesNotContain("ankara")
                .containsOnlyOnce("nk");


    }

    @Test
    public void testLists() throws Exception{
        List<String> cities=new ArrayList<String>(Arrays.asList("istanbul","urfa","izmir"));
        assertThat(cities)
                .describedAs("this is an error")
                .contains("istanbul")
                .doesNotContain("boston")
                .containsExactly("istanbul","urfa","izmir")
                .doesNotHaveDuplicates();

        List<String> cities2=new ArrayList<String>(Arrays.asList("istanbul","urfa","izmir"));
        assertThat(cities2)
                .have(turkCities());
        List<String> cities3=new ArrayList<String>(Arrays.asList("boston","munih","bruksel"));
        assertThat(cities3)
                .have(abroadCities());
        List<String> cities4=new ArrayList<String>(Arrays.asList("boston","munih","bruksel","urfa","izmir"));
        assertThat(cities4)
                .haveExactly(2,turkCities())
                .haveExactly(3,abroadCities());
    }

    private Condition<? super String> turkCities(){
        return new Condition<String>(){
          @Override
            public boolean matches(String s){
              return turkCities.contains(s);
          }
        };
    }
    private Condition<? super String> abroadCities(){
        return new Condition<String>(){
            @Override
            public boolean matches(String s){
                return abroadCities.contains(s);
            }
        };
    }
}
