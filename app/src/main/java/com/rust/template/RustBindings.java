package com.rust.template;

public class RustBindings {
    private static boolean mInitialized = false;

    public RustBindings(NativeLoader nativeLoader) {
        if (!mInitialized) {
            nativeLoader.load();
            mInitialized = true;
        }
    }

    public native String greeting(final String pattern);
}