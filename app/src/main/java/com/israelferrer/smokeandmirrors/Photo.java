package com.israelferrer.smokeandmirrors;

import android.support.annotation.DrawableRes;

public class Photo {
    @DrawableRes
    public final int resId;

    public Photo(@DrawableRes int resId) {
        this.resId = resId;
    }
}
