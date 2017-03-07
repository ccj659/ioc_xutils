package com.ccj.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import android.view.View;
import android.view.View.OnClickListener;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@ListenEvent(setListener="setOnClickListener"
,listenerType=View.OnClickListener.class
,callbackMethod="onClick")


public @interface InjectEvent {
	int[] value();
}
