package com.ns.greg.mvpdagger2example.di

/**
 * @author gregho
 * @since 23/04/2018
 */
interface HasComponent<out C> {

  fun component(): C
}