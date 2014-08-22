package com.kaiinui.sampleannotation;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by kaiinui on 2014/08/22.
 */
public class ViewInjector {
    public static void inject(Activity target) {
        for (Field field : target.getClass().getDeclaredFields()) {
            injectField(target, field);
        }
    }

    private static void injectField(Activity target, Field field) {
        InjectView annotation = field.getAnnotation(InjectView.class);
        if (annotation == null) { return; }
        int id = annotation.value();
        injectViewById(target, field, id);
    }

    private static void injectViewById(Activity target, Field field, int id) {
        View view = target.findViewById(id);
        try {
            field.set(target, view);
        } catch (IllegalAccessException e) { }
    }
}
