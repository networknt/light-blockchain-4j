/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.networknt.taiji.kyc;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class KycUpdatedEvent extends org.apache.avro.specific.SpecificRecordBase implements KycEvent {
  private static final long serialVersionUID = 6153618044902347725L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"KycUpdatedEvent\",\"namespace\":\"com.networknt.taiji.kyc\",\"fields\":[{\"name\":\"EventId\",\"type\":{\"type\":\"record\",\"name\":\"EventId\",\"namespace\":\"com.networknt.taiji.event\",\"fields\":[{\"name\":\"address\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"owner address that create the token\"},{\"name\":\"nonce\",\"type\":\"long\",\"doc\":\"the number of the transactions for the address\"}]}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"personal or business name\"},{\"name\":\"tags\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"tags to categorize the person or business\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Description of person or business which can be full text searched\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<KycUpdatedEvent> ENCODER =
      new BinaryMessageEncoder<KycUpdatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<KycUpdatedEvent> DECODER =
      new BinaryMessageDecoder<KycUpdatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<KycUpdatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<KycUpdatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<KycUpdatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<KycUpdatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this KycUpdatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a KycUpdatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a KycUpdatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static KycUpdatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private com.networknt.taiji.event.EventId EventId;
  /** personal or business name */
   private java.lang.String name;
  /** tags to categorize the person or business */
   private java.util.List<java.lang.String> tags;
  /** Description of person or business which can be full text searched */
   private java.lang.String description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public KycUpdatedEvent() {}

  /**
   * All-args constructor.
   * @param EventId The new value for EventId
   * @param name personal or business name
   * @param tags tags to categorize the person or business
   * @param description Description of person or business which can be full text searched
   */
  public KycUpdatedEvent(com.networknt.taiji.event.EventId EventId, java.lang.String name, java.util.List<java.lang.String> tags, java.lang.String description) {
    this.EventId = EventId;
    this.name = name;
    this.tags = tags;
    this.description = description;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return EventId;
    case 1: return name;
    case 2: return tags;
    case 3: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: EventId = (com.networknt.taiji.event.EventId)value$; break;
    case 1: name = value$ != null ? value$.toString() : null; break;
    case 2: tags = (java.util.List<java.lang.String>)value$; break;
    case 3: description = value$ != null ? value$.toString() : null; break;
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
   * Gets the value of the 'name' field.
   * @return personal or business name
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * personal or business name
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * @return tags to categorize the person or business
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }


  /**
   * Sets the value of the 'tags' field.
   * tags to categorize the person or business
   * @param value the value to set.
   */
  public void setTags(java.util.List<java.lang.String> value) {
    this.tags = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return Description of person or business which can be full text searched
   */
  public java.lang.String getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * Description of person or business which can be full text searched
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Creates a new KycUpdatedEvent RecordBuilder.
   * @return A new KycUpdatedEvent RecordBuilder
   */
  public static com.networknt.taiji.kyc.KycUpdatedEvent.Builder newBuilder() {
    return new com.networknt.taiji.kyc.KycUpdatedEvent.Builder();
  }

  /**
   * Creates a new KycUpdatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new KycUpdatedEvent RecordBuilder
   */
  public static com.networknt.taiji.kyc.KycUpdatedEvent.Builder newBuilder(com.networknt.taiji.kyc.KycUpdatedEvent.Builder other) {
    if (other == null) {
      return new com.networknt.taiji.kyc.KycUpdatedEvent.Builder();
    } else {
      return new com.networknt.taiji.kyc.KycUpdatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new KycUpdatedEvent RecordBuilder by copying an existing KycUpdatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new KycUpdatedEvent RecordBuilder
   */
  public static com.networknt.taiji.kyc.KycUpdatedEvent.Builder newBuilder(com.networknt.taiji.kyc.KycUpdatedEvent other) {
    if (other == null) {
      return new com.networknt.taiji.kyc.KycUpdatedEvent.Builder();
    } else {
      return new com.networknt.taiji.kyc.KycUpdatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for KycUpdatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<KycUpdatedEvent>
    implements org.apache.avro.data.RecordBuilder<KycUpdatedEvent> {

    private com.networknt.taiji.event.EventId EventId;
    private com.networknt.taiji.event.EventId.Builder EventIdBuilder;
    /** personal or business name */
    private java.lang.String name;
    /** tags to categorize the person or business */
    private java.util.List<java.lang.String> tags;
    /** Description of person or business which can be full text searched */
    private java.lang.String description;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.networknt.taiji.kyc.KycUpdatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.EventId)) {
        this.EventId = data().deepCopy(fields()[0].schema(), other.EventId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasEventIdBuilder()) {
        this.EventIdBuilder = com.networknt.taiji.event.EventId.newBuilder(other.getEventIdBuilder());
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.tags)) {
        this.tags = data().deepCopy(fields()[2].schema(), other.tags);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing KycUpdatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.networknt.taiji.kyc.KycUpdatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.EventId)) {
        this.EventId = data().deepCopy(fields()[0].schema(), other.EventId);
        fieldSetFlags()[0] = true;
      }
      this.EventIdBuilder = null;
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tags)) {
        this.tags = data().deepCopy(fields()[2].schema(), other.tags);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
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
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder setEventId(com.networknt.taiji.event.EventId value) {
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
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder setEventIdBuilder(com.networknt.taiji.event.EventId.Builder value) {
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
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder clearEventId() {
      EventId = null;
      EventIdBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * personal or business name
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * personal or business name
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * personal or business name
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * personal or business name
      * @return This builder.
      */
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tags' field.
      * tags to categorize the person or business
      * @return The value.
      */
    public java.util.List<java.lang.String> getTags() {
      return tags;
    }


    /**
      * Sets the value of the 'tags' field.
      * tags to categorize the person or business
      * @param value The value of 'tags'.
      * @return This builder.
      */
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder setTags(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.tags = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tags' field has been set.
      * tags to categorize the person or business
      * @return True if the 'tags' field has been set, false otherwise.
      */
    public boolean hasTags() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tags' field.
      * tags to categorize the person or business
      * @return This builder.
      */
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder clearTags() {
      tags = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * Description of person or business which can be full text searched
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * Description of person or business which can be full text searched
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder setDescription(java.lang.String value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * Description of person or business which can be full text searched
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'description' field.
      * Description of person or business which can be full text searched
      * @return This builder.
      */
    public com.networknt.taiji.kyc.KycUpdatedEvent.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public KycUpdatedEvent build() {
      try {
        KycUpdatedEvent record = new KycUpdatedEvent();
        if (EventIdBuilder != null) {
          try {
            record.EventId = this.EventIdBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("EventId"));
            throw e;
          }
        } else {
          record.EventId = fieldSetFlags()[0] ? this.EventId : (com.networknt.taiji.event.EventId) defaultValue(fields()[0]);
        }
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.tags = fieldSetFlags()[2] ? this.tags : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<KycUpdatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<KycUpdatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<KycUpdatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<KycUpdatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.EventId.customEncode(out);

    out.writeString(this.name);

    if (this.tags == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.tags.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.lang.String e0: this.tags) {
        actualSize0++;
        out.startItem();
        out.writeString(e0);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    if (this.description == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.description);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.EventId == null) {
        this.EventId = new com.networknt.taiji.event.EventId();
      }
      this.EventId.customDecode(in);

      this.name = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.tags = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<java.lang.String> a0 = this.tags;
        if (a0 == null) {
          a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("tags").schema().getTypes().get(1));
          this.tags = a0;
        } else a0.clear();
        SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
            e0 = in.readString();
            a0.add(e0);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.description = null;
      } else {
        this.description = in.readString();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.EventId == null) {
            this.EventId = new com.networknt.taiji.event.EventId();
          }
          this.EventId.customDecode(in);
          break;

        case 1:
          this.name = in.readString();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.tags = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<java.lang.String> a0 = this.tags;
            if (a0 == null) {
              a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("tags").schema().getTypes().get(1));
              this.tags = a0;
            } else a0.clear();
            SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
                e0 = in.readString();
                a0.add(e0);
              }
            }
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.description = null;
          } else {
            this.description = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










