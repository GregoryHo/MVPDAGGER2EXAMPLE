package com.ns.greg.mvpdagger2example.di.modules

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author gregho
 * @since 23/04/2018
 */
@Module(includes = [ApplicationModule::class])
class SharedPreferencesModule {

  @Provides @Singleton fun providesSharedPreferences(context: Context): SharedPreferences {
    return PreferenceManager.getDefaultSharedPreferences(context)
  }
}