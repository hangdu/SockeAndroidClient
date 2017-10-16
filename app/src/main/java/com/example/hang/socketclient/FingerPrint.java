package com.example.hang.socketclient;

import java.util.List;

/**
 * Created by hang on 10/15/17.
 */

public class FingerPrint {
    private String position;
    private List<Integer> strengthVals;

    public FingerPrint(String position, List<Integer> list) {
        this.position = position;
        this.strengthVals = list;
    }
}
