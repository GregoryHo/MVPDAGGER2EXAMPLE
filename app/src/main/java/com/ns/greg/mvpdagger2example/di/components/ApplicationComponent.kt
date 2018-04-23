package com.ns.greg.mvpdagger2example.di.components

import com.ns.greg.mvpdagger2example.MainActivity
import com.ns.greg.mvpdagger2example.SharedPreferenceManager
import com.ns.greg.mvpdagger2example.di.modules.ApplicationModule
import com.ns.greg.mvpdagger2example.di.modules.SharedPreferencesModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author gregho
 * @since 23/04/2018
 */
@Singleton
@Component(modules = [ApplicationModule::class, SharedPreferencesModule::class])
interface ApplicationComponent {

  fun inject(activity: MainActivity)

  /*--------------------------------
   * Exposed to sub-graphs
   *-------------------------------*/

  fun sharedPreferenceManager(): SharedPreferenceManager
}