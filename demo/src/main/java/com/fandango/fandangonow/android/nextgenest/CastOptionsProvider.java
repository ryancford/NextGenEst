package com.fandango.fandangonow.android.nextgenest;

import android.content.Context;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;

import java.util.List;

public class CastOptionsProvider implements OptionsProvider
{
    @Override
    public CastOptions getCastOptions(Context appContext) {
        CastOptions castOptions = new CastOptions.Builder()
                .setReceiverApplicationId(appContext.getString(com.wb.nextgenlibrary.R.string.google_chromecast_id))
                .build();
        return castOptions;
    }

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context)
    {
        return null;
    }
}
