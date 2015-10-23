package com.jamiealtizer.cordova.inappbrowser;

import junit.framework.Assert;
import android.content.Context;

public class ExternalResourceHelper {
	
    public static int getDrawable(Context context, String name)
    {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);

        return context.getResources().getIdentifier(name,
                "drawable", context.getPackageName());
    }

    public static int getColor(Context context, String name)
    {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);
        int id = context.getResources().getIdentifier(name, "color", context.getPackageName());
        return context.getResources().getColor(id);
    }

    public static int getStrings(Context context, String name)
    {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);

        return context.getResources().getIdentifier(name,
                "string", context.getPackageName());
    }

    public static int getIds(Context context, String name)
    {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);

        return context.getResources().getIdentifier(name,
                "id", context.getPackageName());
    }
}
