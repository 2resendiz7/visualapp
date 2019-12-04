package com.example.app;

import android.content.Context;

import com.example.login.R;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;

import java.util.List;

public class CastOptionsProvider implements OptionsProvider {
    @Override
    public CastOptions getCastOptions(Context castContext) {
        CastOptions castOptions = new CastOptions.Builder()
                .setReceiverApplicationId(castContext.getString(R.string.app_id))
                .build();
        return castOptions;
    }

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }
}

