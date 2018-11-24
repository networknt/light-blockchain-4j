/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.networknt.taiji.event;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BlockchainEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8606033913035798620L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BlockchainEvent\",\"namespace\":\"com.networknt.taiji.event\",\"fields\":[{\"name\":\"EventId\",\"type\":{\"type\":\"record\",\"name\":\"EventId\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"nonce\",\"type\":\"long\"}]}},{\"name\":\"entityAddress\",\"type\":\"string\"},{\"name\":\"entityType\",\"type\":\"string\"},{\"name\":\"eventType\",\"type\":\"string\"},{\"name\":\"eventData\",\"type\":[\"null\",\"bytes\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BlockchainEvent> ENCODER =
      new BinaryMessageEncoder<BlockchainEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BlockchainEvent> DECODER =
      new BinaryMessageDecoder<BlockchainEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BlockchainEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BlockchainEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BlockchainEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BlockchainEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BlockchainEvent from a ByteBuffer. */
  public static BlockchainEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public com.networknt.taiji.event.EventId EventId;
  @Deprecated public java.lang.CharSequence entityAddress;
  @Deprecated public java.lang.CharSequence entityType;
  @Deprecated public java.lang.CharSequence eventType;
  @Deprecated public java.nio.ByteBuffer eventData;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BlockchainEvent() {}

  /**
   * All-args constructor.
   * @param EventId The new value for EventId
   * @param entityAddress The new value for entityAddress
   * @param entityType The new value for entityType
   * @param eventType The new value for eventType
   * @param eventData The new value for eventData
   */
  public BlockchainEvent(com.networknt.taiji.event.EventId EventId, java.lang.CharSequence entityAddress, java.lang.CharSequence entityType, java.lang.CharSequence eventType, java.nio.ByteBuffer eventData) {
    this.EventId = EventId;
    this.entityAddress = entityAddress;
    this.entityType = entityType;
    this.eventType = eventType;
    this.eventData = eventData;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return EventId;
    case 1: return entityAddress;
    case 2: return entityType;
    case 3: return eventType;
    case 4: return eventData;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: EventId = (com.networknt.taiji.event.EventId)value$; break;
    case 1: entityAddress = (java.lang.CharSequence)value$; break;
    case 2: entityType = (java.lang.CharSequence)value$; break;
    case 3: eventType = (java.lang.CharSequence)value$; break;
    case 4: eventData = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'EventId' field.
   * @return The value of the 'EventId' field.
   */
  public com.networknt.taiji.event.EventId getEventId() {
    return EventId;
  }

  /**
   * Sets the value of the 'EventId' field.
   * @param value the value to set.
   */
  public void setEventId(com.networknt.taiji.event.EventId value) {
    this.EventId = value;
  }

  /**
   * Gets the value of the 'entityAddress' field.
   * @return The value of the 'entityAddress' field.
   */
  public java.lang.CharSequence getEntityAddress() {
    return entityAddress;
  }

  /**
   * Sets the value of the 'entityAddress' field.
   * @param value the value to set.
   */
  public void setEntityAddress(java.lang.CharSequence value) {
    this.entityAddress = value;
  }

  /**
   * Gets the value of the 'entityType' field.
   * @return The value of the 'entityType' field.
   */
  public java.lang.CharSequence getEntityType() {
    return entityType;
  }

  /**
   * Sets the value of the 'entityType' field.
   * @param value the value to set.
   */
  public void setEntityType(java.lang.CharSequence value) {
    this.entityType = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public java.lang.CharSequence getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(java.lang.CharSequence value) {
    this.eventType = value;
  }

  /**
   * Gets the value of the 'eventData' field.
   * @return The value of the 'eventData' field.
   */
  public java.nio.ByteBuffer getEventData() {
    return eventData;
  }

  /**
   * Sets the value of the 'eventData' field.
   * @param value the value to set.
   */
  public void setEventData(java.nio.ByteBuffer value) {
    this.eventData = value;
  }

  /**
   * Creates a new BlockchainEvent RecordBuilder.
   * @return A new BlockchainEvent RecordBuilder
   */
  public static com.networknt.taiji.event.BlockchainEvent.Builder newBuilder() {
    return new com.networknt.taiji.event.BlockchainEvent.Builder();
  }

  /**
   * Creates a new BlockchainEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BlockchainEvent RecordBuilder
   */
  public static com.networknt.taiji.event.BlockchainEvent.Builder newBuilder(com.networknt.taiji.event.BlockchainEvent.Builder other) {
    return new com.networknt.taiji.event.BlockchainEvent.Builder(other);
  }

  /**
   * Creates a new BlockchainEvent RecordBuilder by copying an existing BlockchainEvent instance.
   * @param other The existing instance to copy.
   * @return A new BlockchainEvent RecordBuilder
   */
  public static com.networknt.taiji.event.BlockchainEvent.Builder newBuilder(com.networknt.taiji.event.BlockchainEvent other) {
    return new com.networknt.taiji.event.BlockchainEvent.Builder(other);
  }

  /**
   * RecordBuilder for BlockchainEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BlockchainEvent>
    implements org.apache.avro.data.RecordBuilder<BlockchainEvent> {

    private com.networknt.taiji.event.EventId EventId;
    private com.networknt.taiji.event.EventId.Builder EventIdBuilder;
    private java.lang.CharSequence entityAddress;
    private java.lang.CharSequence entityType;
    private java.lang.CharSequence eventType;
    private java.nio.ByteBuffer eventData;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.networknt.taiji.event.BlockchainEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.EventId)) {
        this.EventId = data().deepCopy(fields()[0].schema(), other.EventId);
        fieldSetFlags()[0] = true;
      }
      if (other.hasEventIdBuilder()) {
        this.EventIdBuilder = com.networknt.taiji.event.EventId.newBuilder(other.getEventIdBuilder());
      }
      if (isValidValue(fields()[1], other.entityAddress)) {
        this.entityAddress = data().deepCopy(fields()[1].schema(), other.entityAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.entityType)) {
        this.entityType = data().deepCopy(fields()[2].schema(), other.entityType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.eventType)) {
        this.eventType = data().deepCopy(fields()[3].schema(), other.eventType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventData)) {
        this.eventData = data().deepCopy(fields()[4].schema(), other.eventData);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BlockchainEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.networknt.taiji.event.BlockchainEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.EventId)) {
        this.EventId = data().deepCopy(fields()[0].schema(), other.EventId);
        fieldSetFlags()[0] = true;
      }
      this.EventIdBuilder = null;
      if (isValidValue(fields()[1], other.entityAddress)) {
        this.entityAddress = data().deepCopy(fields()[1].schema(), other.entityAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.entityType)) {
        this.entityType = data().deepCopy(fields()[2].schema(), other.entityType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.eventType)) {
        this.eventType = data().deepCopy(fields()[3].schema(), other.eventType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventData)) {
        this.eventData = data().deepCopy(fields()[4].schema(), other.eventData);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'EventId' field.
      * @return The value.
      */
    public com.networknt.taiji.event.EventId getEventId() {
      return EventId;
    }

    /**
      * Sets the value of the 'EventId' field.
      * @param value The value of 'EventId'.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder setEventId(com.networknt.taiji.event.EventId value) {
      validate(fields()[0], value);
      this.EventIdBuilder = null;
      this.EventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'EventId' field has been set.
      * @return True if the 'EventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'EventId' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.networknt.taiji.event.EventId.Builder getEventIdBuilder() {
      if (EventIdBuilder == null) {
        if (hasEventId()) {
          setEventIdBuilder(com.networknt.taiji.event.EventId.newBuilder(EventId));
        } else {
          setEventIdBuilder(com.networknt.taiji.event.EventId.newBuilder());
        }
      }
      return EventIdBuilder;
    }

    /**
     * Sets the Builder instance for the 'EventId' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.networknt.taiji.event.BlockchainEvent.Builder setEventIdBuilder(com.networknt.taiji.event.EventId.Builder value) {
      clearEventId();
      EventIdBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'EventId' field has an active Builder instance
     * @return True if the 'EventId' field has an active Builder instance
     */
    public boolean hasEventIdBuilder() {
      return EventIdBuilder != null;
    }

    /**
      * Clears the value of the 'EventId' field.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder clearEventId() {
      EventId = null;
      EventIdBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'entityAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getEntityAddress() {
      return entityAddress;
    }

    /**
      * Sets the value of the 'entityAddress' field.
      * @param value The value of 'entityAddress'.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder setEntityAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.entityAddress = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'entityAddress' field has been set.
      * @return True if the 'entityAddress' field has been set, false otherwise.
      */
    public boolean hasEntityAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'entityAddress' field.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder clearEntityAddress() {
      entityAddress = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'entityType' field.
      * @return The value.
      */
    public java.lang.CharSequence getEntityType() {
      return entityType;
    }

    /**
      * Sets the value of the 'entityType' field.
      * @param value The value of 'entityType'.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder setEntityType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.entityType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'entityType' field has been set.
      * @return True if the 'entityType' field has been set, false otherwise.
      */
    public boolean hasEntityType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'entityType' field.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder clearEntityType() {
      entityType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventType' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventType() {
      return eventType;
    }

    /**
      * Sets the value of the 'eventType' field.
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder setEventType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.eventType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'eventType' field.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventData' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getEventData() {
      return eventData;
    }

    /**
      * Sets the value of the 'eventData' field.
      * @param value The value of 'eventData'.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder setEventData(java.nio.ByteBuffer value) {
      validate(fields()[4], value);
      this.eventData = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'eventData' field has been set.
      * @return True if the 'eventData' field has been set, false otherwise.
      */
    public boolean hasEventData() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'eventData' field.
      * @return This builder.
      */
    public com.networknt.taiji.event.BlockchainEvent.Builder clearEventData() {
      eventData = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BlockchainEvent build() {
      try {
        BlockchainEvent record = new BlockchainEvent();
        if (EventIdBuilder != null) {
          record.EventId = this.EventIdBuilder.build();
        } else {
          record.EventId = fieldSetFlags()[0] ? this.EventId : (com.networknt.taiji.event.EventId) defaultValue(fields()[0]);
        }
        record.entityAddress = fieldSetFlags()[1] ? this.entityAddress : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.entityType = fieldSetFlags()[2] ? this.entityType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.eventType = fieldSetFlags()[3] ? this.eventType : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.eventData = fieldSetFlags()[4] ? this.eventData : (java.nio.ByteBuffer) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BlockchainEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<BlockchainEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BlockchainEvent>
    READER$ = (org.apache.avro.io.DatumReader<BlockchainEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
