package com.ns.greg.mvpdagger2example.view

import com.ns.greg.mvpdagger2example.view.DemoContractor.IDemoFragmentModel

/**
 * @author gregho
 * @since 23/04/2018
 */
class DemoFragmentModel : IDemoFragmentModel {

  private var dataSet: String? = null

  /**
   * Update current data set
   *
   * @param dataSet target data set to update to model
   * @throws ClassCastException throws exception if given the wrong type
   */
  override fun updateDataSet(dataSet: String?) {
    this.dataSet = dataSet
  }

  /**
   * Returns the current data set
   */
  override fun getDataSet(): String? {
    return dataSet
  }
}