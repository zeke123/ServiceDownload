package com.zhoujian.servicedownload;

import java.io.File;

public interface DownloadListener
{

    void onProgress(int progress);

    void onSuccess(File file);

    void onFailed();

    void onPaused();

    void onCanceled();

}
