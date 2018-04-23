package com.ns.greg.mvpdagger2example.view.di

import com.ns.greg.mvpdagger2example.di.PerFragment
import com.ns.greg.mvpdagger2example.view.DemoContractor.IDemoFragmentPresenter
import com.ns.greg.mvpdagger2example.view.DemoFragmentPresenter
import dagger.Binds
import dagger.Module

/**
 * @author gregho
 * @since 23/04/2018
 */
@Module(includes = [DemoModule::class])
abstract class PresenterModule {

  @Binds
  @PerFragment
  abstract fun bindPresenter(demoFragmentPresenter: DemoFragmentPresenter): IDemoFragmentPresenter
}