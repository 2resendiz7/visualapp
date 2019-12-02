package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.mediarouter.app.MediaRouteButton;

import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;

public class Main2Activity extends AppCompatActivity {

    private CastContext mCastContext;


    private  CastSession mCastSession;
    private  SessionManager mSessionManager;
    private SessionManagerListener mSessionManagerListener = new SessionManagerListenerImpl();


    //@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mCastContext =  CastContext.getSharedInstance(this);
        mSessionManager = mCastContext.getSessionManager();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.cast, menu);
        CastButtonFactory.setUpMediaRouteButton(getApplicationContext(),menu,R.id.media_route_menu_item);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCastSession = mSessionManager.getCurrentCastSession();
        mSessionManager.addSessionManagerListener(mSessionManagerListener);
    }
    @Override
    protected void onPause() {
        super.onPause();
        mSessionManager.removeSessionManagerListener(mSessionManagerListener);
        mCastSession = null;
    }

    public class SessionManagerListenerImpl implements SessionManagerListener {

        @Override
        public void onSessionStarting(Session session) {}

        @Override
        public void onSessionStarted(Session session, String s) {
            mCastSession = mSessionManager.getCurrentCastSession();
            //loadMedia(mCastSession);
        }

        @Override
        public void onSessionStartFailed(Session session, int i) {}

        @Override
        public void onSessionEnding(Session session) {}

        @Override
        public void onSessionEnded(Session session, int i) {}

        @Override
        public void onSessionResuming(Session session, String s) {}

        @Override
        public void onSessionResumed(Session session, boolean b) {}

        @Override
        public void onSessionResumeFailed(Session session, int i) {}

        @Override
        public void onSessionSuspended(Session session, int i) {}
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
