package com.ns.greg.mvpdagger2example

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit.SECONDS
import javax.inject.Singleton

/**
 * @author gregho
 * @since 2018/6/6
 */
@Singleton
class AppExecutors {

  private val ioExecutor: Executor by lazy {
    val cores = Runtime.getRuntime().availableProcessors()
    ThreadPoolExecutor(cores, cores * 2, 1L, SECONDS, LinkedBlockingQueue<Runnable>())
  }

  private val uiExecutor: Executor by lazy {
    UiExecutor()
  }

  fun io(): Executor {
    return ioExecutor
  }

  fun ui(): Executor {
    return uiExecutor
  }

  inner class UiExecutor : Executor {

    private val handler: Handler by lazy {
      Handler(Looper.getMainLooper())
    }

    override fun execute(command: Runnable?) {
      handler.post(command)
    }
  }
}