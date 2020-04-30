package com.xiaojinzi.component.interceptor;

import android.support.annotation.MainThread;
import android.support.annotation.Nullable;

import com.xiaojinzi.component.impl.RouterInterceptor;

/**
 * 拦截器顶级接口
 * time   : 2018/12/26
 *
 * @author : xiaojinzi
 */
public interface IComponentInterceptor {

    /**
     * 根据拦截器的唯一名字获取拦截器
     *
     * @param name if name is null,return null
     */
    @Nullable
    @MainThread
    RouterInterceptor getByName(@Nullable String name);

}
