package com.brintsoft.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Context m_context = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_context = getApplicationContext() ;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showAppToast(String text) {
        Toast.makeText(m_context, "This button will launch "+text, Toast.LENGTH_SHORT).show();
    }

    public void spotifyApp(View view) {
        showAppToast("The Spotify App!") ;
    }

    public void scoresApp(View view) {
        showAppToast("The Scores App!") ;
    }

    public void libraryApp(View view) {
        showAppToast("The Library App!") ;
    }

    public void buildApp(View view) {
        showAppToast("The Build It Bigger App!") ;
    }

    public void readerApp(View view) {
        showAppToast("The XYZReader App!") ;
    }

    public void capstoneApp(View view) {
        showAppToast("My Capstone App!") ;
    }
}
