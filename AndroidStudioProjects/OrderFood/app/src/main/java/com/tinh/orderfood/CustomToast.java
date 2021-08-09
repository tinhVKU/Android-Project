package com.tinh.orderfood;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class CustomToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public CustomToast(Context context) {
        super(context);
        setDuration(Toast.LENGTH_SHORT);
        setGravity(Gravity.HORIZONTAL_GRAVITY_MASK & Gravity.CENTER,0,0);
        View view = View.inflate(context,R.layout.toast,null);
        setView(view);
    }
}
