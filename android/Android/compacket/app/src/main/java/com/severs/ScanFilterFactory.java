package com.severs;

import android.bluetooth.le.ScanFilter;

public class ScanFilterFactory {
    private static ScanFilterFactory instance;

    private ScanFilterFactory() {

    }

    public static synchronized ScanFilterFactory getInstance() {
        if (instance == null) {
            instance = new ScanFilterFactory();
        }
        return instance;
    }

    public ScanFilter getScanFilter() {
        return new ScanFilter.Builder().build();
    }
}
