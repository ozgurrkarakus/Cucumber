package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before// Cucumber ın Annotation
    public void before(){
       // System.out.println("Sennaryo başladı");
    }



    @After // Cucumber ın Annotation ı
    // her senaryodan sonra çalışır
    public void after(){
        GWD.quitDriver();
    }

}
