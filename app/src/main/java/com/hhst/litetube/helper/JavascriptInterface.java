package com.hhst.litetube.helper;


import android.content.Context;
import android.util.Log;

import com.hhst.litetube.MainActivity;

/**
 * Build a JavaScript interface primarily for controlling web tabs in JavaScript.
 *
 */
public class JavascriptInterface {
    private final Context context;

    public JavascriptInterface(Context context){
        this.context = context;
    }

    @android.webkit.JavascriptInterface
    public void test(String url){
        Log.d("JavascriptInterface-test", url);
    }

    @android.webkit.JavascriptInterface
    public void finishRefresh(){
        ((MainActivity)context).swipeRefreshLayout.setRefreshing(false);
    }

    @android.webkit.JavascriptInterface
    public void setRefreshLayoutEnabled(boolean enabled){
        ((MainActivity)context).swipeRefreshLayout.setEnabled(enabled);
    }


    @android.webkit.JavascriptInterface
    public void download(String url){

    }

}
