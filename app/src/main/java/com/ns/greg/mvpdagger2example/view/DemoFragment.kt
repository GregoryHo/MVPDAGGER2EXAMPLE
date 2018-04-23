package com.ns.greg.mvpdagger2example.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ns.greg.mvpdagger2example.MainActivity
import com.ns.greg.mvpdagger2example.R
import com.ns.greg.mvpdagger2example.view.DemoContractor.IDemoFragment
import com.ns.greg.mvpdagger2example.view.DemoContractor.IDemoFragmentPresenter
import com.ns.greg.mvpdagger2example.view.di.DaggerDemoComponent
import com.ns.greg.mvpdagger2example.view.di.DemoComponent
import com.ns.greg.mvpdagger2example.view.di.DemoModule

/**
 * @author gregho
 * @since 23/04/2018
 */
class DemoFragment : Fragment(), IDemoFragment {

  private val component: DemoComponent by lazy {
    DaggerDemoComponent.builder().demoModule(DemoModule(this)).build()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    component.inject(this)
  }

  /**
   * Returns the presenter
   *
   * @return T presenter
   */
  override fun getPresenter(): IDemoFragmentPresenter {
    return component.presenter()
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    inflater?.let {
      return (it.inflate(R.layout.fragment_demo, container, false))
    }

    return null
  }

  override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    view?.let {
      val tvSsid = it.findViewById<TextView>(R.id.tv_ssid)
      tvSsid.text = arguments?.getString(MainActivity.WIFI_KEY) ?: ""
      it.findViewById<Button>(R.id.btn_save).setOnClickListener {
        getPresenter().saveSsid(tvSsid.text.toString())
      }
    }
  }

  /**
   * Shows the message
   *
   * @param message the display message
   */
  override fun showMessage(message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
  }
}