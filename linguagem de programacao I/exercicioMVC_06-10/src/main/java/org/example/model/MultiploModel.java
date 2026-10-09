package org.example.model;

public class MultiploModel {

    public boolean ehMultiplo(int n1, int n2) {
        if (n2 == 0)
            return false;
        return n1 % n2 == 0;
    }
}
