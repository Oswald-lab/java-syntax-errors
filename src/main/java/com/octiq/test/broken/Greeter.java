package com.octiq.test.broken;

import org.apache.commons.lang3.StringUtils;

public class Greeter {

    public String greet(String name) {
        String cleaned = StringUtils.trim(name)   // INTENTIONAL ERROR 1: missing semicolon
        return "Hello, " + StringUtils.capitalize(cleaned) + "!";
    }

    public int add(int a, int b) {
        return (a + b;                             // INTENTIONAL ERROR 2: unbalanced parenthesis
    }

    public void unfinished() {
        if (true) {
            System.out.println("no closing brace for this method or class");
        // INTENTIONAL ERROR 3: missing closing brace(s)
