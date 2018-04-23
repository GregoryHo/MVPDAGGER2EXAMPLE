package com.ns.greg.mvpdagger2example.pattern

/**
 * @author gregho
 * @since 23/04/2018
 */
interface BaseView<out T> {

  /**
   * Returns the presenter
   *
   * @return T presenter
   */
  fun getPresenter(): T

  /**
   * Shows the message
   *
   * @param message the display message
   */
  fun showMessage(message: String)
}