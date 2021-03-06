package com.networknt.taiji.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventSubscriber {

  String id() default "";
  SubscriberDurability durability() default SubscriberDurability.DURABLE;
  SubscriberInitialPosition readFrom() default SubscriberInitialPosition.BEGINNING;
  boolean progressNotifications() default false;


}

