package com.reactnativeepubreader;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class EPubReaderModule extends ReactContextBaseJavaModule {
    private static EPubReaderView epubReaderViewInstance;

    public EPubReaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "EPubReaderModule";
    }

    public static void registerInstance(EPubReaderView view) {
        epubReaderViewInstance = view;
    }

    @ReactMethod
    public void nextChapter() {
        if (epubReaderViewInstance != null) {
            epubReaderViewInstance.nextChapter();
        }
    }

    @ReactMethod
    public void previousChapter() {
        if (epubReaderViewInstance != null) {
            epubReaderViewInstance.previousChapter();
        }
    }

    @ReactMethod
    public void highlightSelection() {
        if (epubReaderViewInstance != null) {
            epubReaderViewInstance.highlightSelection();
        }
    }
}
