package com.exallium.librarytestbed

class BurstSample {

    fun sampleFunction(a: Boolean, b: Boolean): String {
        if (a xor b) {
            return "xor";
        }
        return "not xor";
    }

}