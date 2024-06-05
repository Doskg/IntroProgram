import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        boolean v=true;
        boolean f=false;
        
        System.out.println("v && f = " + (v&&f));
        System.out.println("v && v = " + (v&&v));
        System.out.println("v || v = " + (v||v));
        System.out.println("v || f = " + (v||f));
        System.out.println("!(v || f) = " + !(v||f));
        System.out.println("!(v && f) = " + !(v&&f));
        System.out.println("!(v && v) = " + !(v&&v));
        
    }
}