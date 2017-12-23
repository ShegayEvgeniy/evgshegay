package ru.job4j.professions.pseudo;


public class Square implements Shape {

    String ln = System.lineSeparator();

    @Override
    public String draw() {
       StringBuilder str = new StringBuilder();
       str.append("+ + + + +");
       str.append(ln);
       str.append("+       +");
       str.append(ln);
       str.append("+       +");
       str.append(ln);
       str.append("+       +");
       str.append(ln);
       str.append("+ + + + +");
       return str.toString();
    }
}
