package com.ns.greg.mvpdagger2example

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author gregho
 * @since 23/04/2018
 */
@Singleton
class SharedPreferenceManager @Inject internal constructor(
    private val sharedPreferences: SharedPreferences) {

  /**
   * Gets the String from [SharedPreferences]
   * with specific key
   *
   * @param key specific key
   * @param defaultValue default value
   */
  fun getString(key: String, defaultValue: String): String? {
    return sharedPreferences.getString(key, defaultValue)
  }

  /**
   * Sets the String into [SharedPreferences]
   *
   * @param key specific key
   * @param value stored value
   */
  fun setString(key: String, value: String) {
    sharedPreferences.edit().putString(key, value).apply()
  }

  /**
   * Gets the boolean form [SharedPreferences]
   * with specific key
   *
   * @param key specific key
   * @param defaultValue default value
   */
  fun getBoolean(key: String, defaultValue: Boolean): Boolean {
    return sharedPreferences.getBoolean(key, defaultValue)
  }

  /**
   * Sets the boolean into [SharedPreferences]
   *
   * @param key specific key
   * @param value stored value
   */
  fun setBoolean(key: String, value: Boolean) {
    sharedPreferences.edit().putBoolean(key, value).apply()
  }

  /**
   * Gets the Integer form [SharedPreferences]
   * with specific key
   *
   * @param key specific key
   * @param defaultValue default value
   */
  fun getInt(key: String, defaultValue: Int): Int {
    return sharedPreferences.getInt(key, defaultValue)
  }

  /**
   * Sets the Integer into [SharedPreferences]
   *
   * @param key specific key
   * @param value stored value
   */
  fun setInt(key: String, value: Int) {
    sharedPreferences.edit().putInt(key, value).apply()
  }

  /**
   * Gets the Float from [SharedPreferences]
   * with specific key
   *
   * @param key specific key
   * @param defaultValue default value
   */
  fun getFloat(key: String, defaultValue: Float): Float {
    return sharedPreferences.getFloat(key, defaultValue)
  }

  /**
   * Sets the Float into [SharedPreferences]
   *
   * @param key specific key
   * @param value stored value
   */
  fun setFloat(key: String, value: Float) {
    sharedPreferences.edit().putFloat(key, value).apply()
  }

  /**
   * Gets the Long from [SharedPreferences]
   * with specific key
   *
   * @param key specific key
   * @param defaultValue default value
   */
  fun getLong(key: String, defaultValue: Long): Long {
    return sharedPreferences.getLong(key, defaultValue)
  }

  /**
   * Sets the Long into [SharedPreferences]
   *
   * @param key specific key
   * @param value stored value
   */
  fun setLong(key: String, value: Long) {
    sharedPreferences.edit().putLong(key, value).apply()
  }

  /**
   * Checks if [SharedPreferences] contains the specific key
   *
   * @param key specific key
   */
  fun hasKey(key: String): Boolean {
    return sharedPreferences.contains(key)
  }

  /**
   * Clears [SharedPreferences]
   */
  fun clearPreferences() {
    sharedPreferences.edit().clear().apply()
  }
}