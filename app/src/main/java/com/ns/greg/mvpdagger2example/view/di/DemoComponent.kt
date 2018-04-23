package com.ns.greg.mvpdagger2example.view.di

import com.ns.greg.mvpdagger2example.di.PerFragment
import com.ns.greg.mvpdagger2example.view.DemoContractor.IDemoFragmentPresenter
import com.ns.greg.mvpdagger2example.view.DemoFragment
import dagger.Component

/**
 * @author gregho
 * @since 23/04/2018
 */
@PerFragment
@Component(modules = [DemoModule::class, PresenterModule::class])
interface DemoComponent {

  fun inject(demoFragment: DemoFragment)

  /*--------------------------------
   * Exposed to sub-graphs
   *-------------------------------*/

  fun presenter(): IDemoFragmentPresenter
}