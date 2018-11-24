package com.networknt.taiji.event;

import java.lang.reflect.Method;

public class EventHandlerProcessorDispatchedEventReturningVoid extends EventHandlerMethodProcessor {

  @Override
  public boolean supportsMethod(Method method) {
    return EventHandlerProcessorUtil.isVoidMethodWithOneParameterOfType(method, DispatchedEvent.class);
  }

  @Override
  public EventHandler processMethod(Object eventHandler, Method method) {
    return new EventHandlerDispatchedEventReturningVoid(method, eventHandler);
  }
}
