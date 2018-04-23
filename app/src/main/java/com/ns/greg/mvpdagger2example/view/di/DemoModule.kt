package com.ns.greg.mvpdagger2example.view.di

import com.ns.greg.mvpdagger2example.di.PerFragment
import com.ns.greg.mvpdagger2example.view.DemoFragment
import com.ns.greg.mvpdagger2example.view.DemoFragmentModel
import dagger.Module
import dagger.Provides

/**
 * @author gregho
 * @since 23/04/2018
 */
@Module
class DemoModule(private val demoFragment: DemoFragment) {

  @Provides
  @PerFragment
  fun providesFragment(): DemoFragment = demoFragment

  @Provides
  @PerFragment
  fun providesModel(): DemoFragmentModel {
    return DemoFragmentModel()
  }
}