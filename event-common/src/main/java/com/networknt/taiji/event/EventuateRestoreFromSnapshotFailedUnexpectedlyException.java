package com.networknt.taiji.event;

public class EventuateRestoreFromSnapshotFailedUnexpectedlyException extends EventuateClientException {
  public EventuateRestoreFromSnapshotFailedUnexpectedlyException(ReflectiveOperationException e) {
    super(e);
  }
}
