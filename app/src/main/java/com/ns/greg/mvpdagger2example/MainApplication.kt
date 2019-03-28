package com.ns.greg.mvpdagger2example

import android.app.Application
import com.ns.greg.mvpdagger2example.di.HasComponent
import com.ns.greg.mvpdagger2example.di.components.ApplicationComponent
import com.ns.greg.mvpdagger2example.di.components.DaggerApplicationComponent
import com.ns.greg.mvpdagger2example.di.modules.ApplicationModule
import com.ns.greg.mvpdagger2example.di.modules.SharedPreferencesModule

/**
 * @author gregho
 * @since 20/04/2018
 */
class MainApplication : Application(), HasComponent<ApplicationComponent> {

  private val component: ApplicationComponent by lazy {
    DaggerApplicationComponent.builder().applicationModule(
        ApplicationModule(this)).sharedPreferencesModule(SharedPreferencesModule()).build()
  }

  override fun component(): ApplicationComponent {
    return component
  }
}