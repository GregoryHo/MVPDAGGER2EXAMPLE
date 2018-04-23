package com.ns.greg.mvpdagger2example.view

import com.ns.greg.mvpdagger2example.pattern.BaseModel
import com.ns.greg.mvpdagger2example.pattern.BasePresenter
import com.ns.greg.mvpdagger2example.pattern.BaseView

/**
 * @author gregho
 * @since 23/04/2018
 */
interface DemoContractor {

  interface IDemoFragment : BaseView<IDemoFragmentPresenter> {

  }

  interface IDemoFragmentPresenter : BasePresenter {

    fun saveSsid(string: String?)
  }

  interface IDemoFragmentModel : BaseModel<String, IDemoFragmentPresenter> {

  }
}