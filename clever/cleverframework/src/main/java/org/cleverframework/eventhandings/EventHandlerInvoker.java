package org.cleverframework.eventhandings;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.cleverframework.events.Event;

public class EventHandlerInvoker {

	private Method method;

	private String eventName;

	private EventHandler handler;

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public EventHandler getHandler() {
		return handler;
	}

	public void setHandler(EventHandler handler) {
		this.handler = handler;
	}

	public void invoke(Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		method.invoke(handler, event);
	}
	
	public void invoke(Object handle,Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		method.invoke(handle, event);
	}
}
