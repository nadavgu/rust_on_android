package com.rust.template;

import android.annotation.SuppressLint;

public class Main {
    public static void main(String[] args) {
        String nativePath = System.getenv("NATIVE_PATH");
        assert nativePath != null;
        @SuppressLint("UnsafeDynamicallyLoadedCode")
        RustBindings rustBindings = new RustBindings(() -> System.load(nativePath));
        String r = rustBindings.greeting("Android world");
        System.out.println(r);
    }
}
