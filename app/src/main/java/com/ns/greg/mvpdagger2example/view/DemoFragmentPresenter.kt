package com.ns.greg.mvpdagger2example.view

import com.ns.greg.mvpdagger2example.di.PerFragment
import com.ns.greg.mvpdagger2example.view.DemoContractor.IDemoFragmentPresenter
import javax.inject.Inject

/**
 * @author gregho
 * @since 23/04/2018
 */
@PerFragment
class DemoFragmentPresenter @Inject constructor(private val demoFragment: DemoFragment,
    private val demoFragmentModel: DemoFragmentModel) : IDemoFragmentPresenter {

  override fun saveSsid(string: String?) {
    demoFragmentModel.updateDataSet(string)
    demoFragment.showMessage("Saved SSID.")
  }

  override fun start() {
  }
}