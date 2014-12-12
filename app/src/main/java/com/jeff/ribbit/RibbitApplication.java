package com.jeff.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Jeff on 10/30/14.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "2rj0WbEO5j5D5iNhPqGbzYxIBQDVNJngvyU2ZAaS", "8BnEOehnOWIiN8FEm7A8kP7jbZsdY9x7h01HokZu");
    }

}
