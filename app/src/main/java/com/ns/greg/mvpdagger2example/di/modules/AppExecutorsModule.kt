package com.ns.greg.mvpdagger2example.di.modules

import com.ns.greg.mvpdagger2example.AppExecutors
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author gregho
 * @since 2018/6/6
 */
@Module
class AppExecutorsModule {

  @Provides
  @Singleton
  fun providesAppExecutors(): AppExecutors {
    return AppExecutors()
  }
}