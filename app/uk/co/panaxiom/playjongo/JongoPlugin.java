package uk.co.panaxiom.playjongo;

import play.Application;
import play.Play;
import play.Plugin;

public class JongoPlugin extends Plugin {

    public JongoPlugin() {
    }

    public JongoPlugin(Application application) {
    }

    @Override
    public void onStart() {
        PlayJongo.forceNewInstance();
    }

    @Override
    public void onStop() {
        if (!Play.isTest()) {
            PlayJongo.mongo().close();
        }
    }
}