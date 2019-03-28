package com.ns.greg.mvpdagger2example

import android.net.wifi.WifiManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ns.greg.mvpdagger2example.R.id
import com.ns.greg.mvpdagger2example.di.HasComponent
import com.ns.greg.mvpdagger2example.di.components.ApplicationComponent
import com.ns.greg.mvpdagger2example.view.DemoFragment
import javax.inject.Inject

/**
 * @author gregho
 * @since 20/04/2018
 */
class MainActivity : AppCompatActivity(), HasComponent<ApplicationComponent> {

  companion object Constant {

    const val WIFI_KEY = "wifi"
  }

  @Inject
  lateinit var wifiManager: WifiManager

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    component().inject(this)
    showDemo(wifiManager.connectionInfo.bssid)
  }

  private fun showDemo(ssid: String?) {
    val bundle = Bundle()
    bundle.putString(WIFI_KEY, ssid)
    val fragment = DemoFragment()
    fragment.arguments = bundle
    supportFragmentManager.beginTransaction()
        .add(id.cl_fragment_root, fragment)
        .show(fragment)
        .commit()
  }

  override fun component(): ApplicationComponent {
    return (application as MainApplication).component()
  }
}