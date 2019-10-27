package com.wangwei.netty.future;

import com.sun.corba.se.spi.orbutil.closure.Closure;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.concurrent.*;

/**
 * Created by wangwei on 19/10/27.
 */
public class SyncFuture<T> implements Future<T> {

    private CountDownLatch countDownLatch = new CountDownLatch(1);
    private T response;
    private long begin = System.currentTimeMillis();

    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        if (response != null) {
            return true;
        }
        return false;
    }

    public T get() throws InterruptedException, ExecutionException {
        countDownLatch.await();
        return this.response;
    }

    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        if (countDownLatch.await(timeout, unit)) {
            return this.response;
        }
        return null;
    }

    public void setResponse(T response) {
        this.response = response;
        countDownLatch.countDown();
    }

    public long getBegin() {
        return begin;
    }
}
