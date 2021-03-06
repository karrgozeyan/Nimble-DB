package com.karen.nimbledb;

import android.annotation.SuppressLint;
import android.content.Context;

public class Nimble {
    private static final String DEF_PATH = "default";

    @SuppressLint("StaticFieldLeak")
    private static Context context = null;

    public static void initialize(Context _context) {
        context = _context.getApplicationContext();
    }

    public static NimbleSection on() {
        return on(DEF_PATH);
    }

    public static NimbleSection on(String name) {
        if (context == null) {
            throw new RuntimeException("context is null, please call initialize method");
        }
        return new NimbleSection(name, context);
    }
}
