package com.ns.greg.mvpdagger2example.di.modules

import android.app.Application
import android.content.Context
import android.location.LocationManager
import android.net.wifi.WifiManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author gregho
 * @since 23/04/2018
 */
@Module
class ApplicationModule(private val application: Application) {

  @Provides
  @Singleton
  fun providesApplicationContext(): Context = application

  @Provides
  @Singleton
  fun providesWifiManager(): WifiManager = application.getSystemService(
      Context.WIFI_SERVICE) as WifiManager
}