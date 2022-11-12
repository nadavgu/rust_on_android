package com.krupitskas.pong;

public class RustBindings {
    static {
        System.loadLibrary("pong_lib");
    }

    public static native String greeting(final String pattern);
}