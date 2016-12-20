package org.cleverframework.eventhandings;

import java.util.HashMap;
import java.util.Map;

public class EventHandlerProvider {

	private Map<String, EventHandlerInvoker> eventInvokers;

	public EventHandlerProvider() {

		eventInvokers = new HashMap<String, EventHandlerInvoker>();
	}

	public EventHandlerInvoker getEventInvoker(String eventName) {
		if (!eventInvokers.containsKey(eventName)) {
			return null;
		}

		return eventInvokers.get(eventName);
	}

}
