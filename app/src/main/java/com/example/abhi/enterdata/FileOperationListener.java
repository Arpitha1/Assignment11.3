package com.example.abhi.enterdata;

/**
 * Created by Abhi on 23-06-2017.
 */

public interface FileOperationListener {
    void onSDcardChecked(Boolean isReady,String status);
    void onMemoryChecked(long total,long free);
    void onFileOpearionMsg(String msg);
    void onFileRead(String text);
}
