package com.example.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaInfo.Builder;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;

import static com.google.android.gms.cast.MediaMetadata.KEY_SUBTITLE;
import static com.google.android.gms.cast.MediaMetadata.KEY_TITLE;
import static com.google.android.gms.cast.MediaMetadata.MEDIA_TYPE_MOVIE;

public class Main2Activity extends AppCompatActivity {

    private CastContext mCastContext;
    private MediaRouteButton mMediaRouteButton;

    private  CastSession mCastSession;
    private  SessionManager mSessionManager;
    private MediaMetadata mVideo;
    public SessionManagerListener mSessionManagerListener = new SessionManagerListenerImpl();


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mCastContext = CastContext.getSharedInstance(this);


        mMediaRouteButton = (MediaRouteButton) findViewById(R.id.media_route_button);
        CastButtonFactory.setUpMediaRouteButton(getApplicationContext(), mMediaRouteButton);

        mSessionManager = mCastContext.getSessionManager();

        //MediaMetadata videoMetadata = new MediaMetadata(MEDIA_TYPE_MOVIE);
        //videoMetadata.putString(KEY_TITLE, mVideo.getTitle());
        //videoMetadata.putString(KEY_SUBTITLE, mVideo.getSubtitle());
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

        private boolean autoPlay;
        private int position;

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
