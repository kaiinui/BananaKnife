package com.kaiinui.sampleannotation;

import android.app.Activity;

/**
 * Created by kaiinui on 2014/08/22.
 */
public class BananaKnife {
    public static void inject(Activity target) {
        ViewInjector.inject(target);
    }
}
