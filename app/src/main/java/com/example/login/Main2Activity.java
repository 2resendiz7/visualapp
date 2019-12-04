package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;

public class Main2Activity extends AppCompatActivity {
    private CastContext castContext;
    private CastSession mCastSession;
    private SessionManager mSessionManager;
    private final SessionManagerListener mSessionManagerListener =
            new SessionManagerListenerImpl();
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CastContext castContext = CastContext.getSharedInstance(this);
        mSessionManager = CastContext.getSharedInstance(this).getSessionManager();
    }

    @Override
    protected void onResume() {
        mCastSession = mSessionManager.getCurrentCastSession();
        mSessionManager.addSessionManagerListener(mSessionManagerListener);
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSessionManager.removeSessionManagerListener(mSessionManagerListener);
        mCastSession = null;
    }



    @Override public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.cast, menu);
        CastButtonFactory.setUpMediaRouteButton(getApplicationContext(),
                menu,
                R.id.media_route_menu_item);
        return true;
    }

    private class SessionManagerListenerImpl implements SessionManagerListener {
        @Override
        public void onSessionStarting(Session session) {

        }

        @Override
        public void onSessionStarted(Session session, String sessionId) {
            invalidateOptionsMenu();
        }

        @Override
        public void onSessionStartFailed(Session session, int i) {

        }

        @Override
        public void onSessionEnding(Session session) {

        }

        @Override
        public void onSessionResumed(Session session, boolean wasSuspended) {
            invalidateOptionsMenu();
        }

        @Override
        public void onSessionResumeFailed(Session session, int i) {

        }

        @Override
        public void onSessionSuspended(Session session, int i) {

        }

        @Override
        public void onSessionEnded(Session session, int error) {
            finish();
        }

        @Override
        public void onSessionResuming(Session session, String s) {

        }
    }

    public void menuoptotipos(View view){

        Intent menuoptotipos = new Intent(this, menuoptotipos.class);
        startActivity(menuoptotipos);
    }
    public void TerapiaVisual(View view){

        Intent TerapiaVisual = new Intent(this, TerapiaVisual.class);
        startActivity(TerapiaVisual);
    }

}
