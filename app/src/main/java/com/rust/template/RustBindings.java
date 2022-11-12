package com.rust.template;

public class RustBindings {
    private static boolean mInitialized = false;

    public RustBindings() {
        if (!mInitialized) {
            System.loadLibrary("template_lib");
            mInitialized = true;
        }
    }

    public native String greeting(final String pattern);
}