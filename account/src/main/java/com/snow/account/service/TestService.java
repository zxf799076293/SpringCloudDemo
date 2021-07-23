package com.snow.account.service;

import java.util.concurrent.Future;

public interface TestService {
    /**
     * 异步调用，无返回值
     */
    void asyncTask();

    /**
     * 异步调用，有返回值
     * @param s
     * @return
     */
    Future<String> asyncTask(String s);

    /**
     * 异步调用，无返回值，事务测试
     * @param exFlag
     */
    void asyncTaskForTransaction(Boolean exFlag);
}
