package edu.pdx.cs410J.SamAndWai;

public class FooBarQix {
    public static String compute(String num){
        int x = Integer.parseInt(num);

        StringBuilder n = new StringBuilder();

        if (x % 3 == 0) n.append("Foo");
        if (x % 5 == 0) n.append("Bar");
        if (x % 7 == 0) n.append("Qix");

        for (Character c : num.toCharArray()) {
            if(c == '3') n.append("Foo");
            if(c == '5') n.append("Bar");
            if(c == '7') n.append("Qix");
        }

        if(n.toString().equals("")) return num;

        return n.toString();
    }

}
