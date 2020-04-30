package com.xiaojinzi.component.support;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.xiaojinzi.component.impl.RouterErrorResult;
import com.xiaojinzi.component.support.NavigationDisposable;

/**
 * 被取消了回调接口
 */
public interface OnRouterError {

    /**
     * 当路由错误的时候回调
     *
     * @param errorResult 路由失败的对象
     */
    @MainThread
    void onError(@NonNull RouterErrorResult errorResult);

}
