package com.gz.android_utils.ui.listview;

import android.view.View;
import android.view.ViewGroup;

/**
 * created by Zhao Yue, at 22/9/16 - 6:52 PM
 * for further issue, please contact: zhaoy.samuel@gmail.com
 */
public abstract class GZListViewBaseItem {

    protected long getItemId() {
        return 0;
    }

    /* Called to generate the content view */
    protected abstract View generateContentView(ViewGroup parent);

    /* Called to update the content view display information */
    protected abstract void onContentViewUpdate(View t);

    /* Perform on item click */
    protected abstract void onItemClicked();

    /* Support different types of view */
    protected int getItemViewType() {
        return 0;
    }
}