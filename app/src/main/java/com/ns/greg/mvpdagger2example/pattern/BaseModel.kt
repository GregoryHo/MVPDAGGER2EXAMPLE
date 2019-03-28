package com.ns.greg.mvpdagger2example.pattern

/**
 * @author gregho
 * @since 23/04/2018
 */
interface BaseModel<T, in P : BasePresenter> {

  /**
   * Update current data set
   *
   * @param dataSet target data set to update to model
   * @throws ClassCastException throws exception if given the wrong type
   */
  @Throws(ClassCastException::class)
  fun updateDataSet(dataSet: T?)

  /**
   * Returns the current data set
   */
  fun getDataSet(): T?
}