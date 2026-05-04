package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

abstract class MyAbstractStringBuilder {

    byte[] value;

    int count;

    final Charset charset = StandardCharsets.UTF_8;

    MyAbstractStringBuilder(int capacity) {
        value = new byte[capacity];
    }

    MyAbstractStringBuilder(String str) {
        value = str.getBytes(charset);
        append(str);
    }

    public MyAbstractStringBuilder append(String str) {
        if (str == null || str.equals("")) {
            return this;
        }
        int length = str.length();
        putStringAt(count, str);
        count += length;
        return this;
    }

    private void putStringAt(int index, String str) {
        int length = str.length();
        byte[] newValue = new byte[index + length];
        byte[] valueStr = str.getBytes(charset);
        for (int i = 0; i < index; i++) {
            newValue[i] = value[i];
        }
        int j = index;
        for (int i = 0; i < length; i++) {
            //  j+=i;
            newValue[j] = valueStr[i];
            j++;
        }
        value = newValue;
    }
}
