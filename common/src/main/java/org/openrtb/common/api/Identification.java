/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Identification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Identification\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"organization\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"token\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   public java.lang.CharSequence organization;
   public java.lang.Long timestamp;
   public java.lang.CharSequence token;

  /**
   * Default constructor.
   */
  public Identification() {}

  /**
   * All-args constructor.
   */
  public Identification(java.lang.CharSequence organization, java.lang.Long timestamp, java.lang.CharSequence token) {
    this.organization = organization;
    this.timestamp = timestamp;
    this.token = token;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return organization;
    case 1: return timestamp;
    case 2: return token;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: organization = (java.lang.CharSequence)value$; break;
    case 1: timestamp = (java.lang.Long)value$; break;
    case 2: token = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'organization' field.
   */
  public java.lang.CharSequence getOrganization() {
    return organization;
  }

  /**
   * Sets the value of the 'organization' field.
   * @param value the value to set.
   */
  public void setOrganization(java.lang.CharSequence value) {
    this.organization = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'token' field.
   */
  public java.lang.CharSequence getToken() {
    return token;
  }

  /**
   * Sets the value of the 'token' field.
   * @param value the value to set.
   */
  public void setToken(java.lang.CharSequence value) {
    this.token = value;
  }

  /** Creates a new Identification RecordBuilder */
  public static org.openrtb.common.api.Identification.Builder newBuilder() {
    return new org.openrtb.common.api.Identification.Builder();
  }
  
  /** Creates a new Identification RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Identification.Builder newBuilder(org.openrtb.common.api.Identification.Builder other) {
    return new org.openrtb.common.api.Identification.Builder(other);
  }
  
  /** Creates a new Identification RecordBuilder by copying an existing Identification instance */
  public static org.openrtb.common.api.Identification.Builder newBuilder(org.openrtb.common.api.Identification other) {
    return new org.openrtb.common.api.Identification.Builder(other);
  }
  
  /**
   * RecordBuilder for Identification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Identification>
    implements org.apache.avro.data.RecordBuilder<Identification> {

    private java.lang.CharSequence organization;
    private java.lang.Long timestamp;
    private java.lang.CharSequence token;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Identification.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Identification.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Identification instance */
    private Builder(org.openrtb.common.api.Identification other) {
            super(org.openrtb.common.api.Identification.SCHEMA$);
      if (isValidValue(fields()[0], other.organization)) {
        this.organization = data().deepCopy(fields()[0].schema(), other.organization);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.token)) {
        this.token = data().deepCopy(fields()[2].schema(), other.token);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'organization' field */
    public java.lang.CharSequence getOrganization() {
      return organization;
    }
    
    /** Sets the value of the 'organization' field */
    public org.openrtb.common.api.Identification.Builder setOrganization(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.organization = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'organization' field has been set */
    public boolean hasOrganization() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'organization' field */
    public org.openrtb.common.api.Identification.Builder clearOrganization() {
      organization = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public org.openrtb.common.api.Identification.Builder setTimestamp(java.lang.Long value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timestamp' field */
    public org.openrtb.common.api.Identification.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'token' field */
    public java.lang.CharSequence getToken() {
      return token;
    }
    
    /** Sets the value of the 'token' field */
    public org.openrtb.common.api.Identification.Builder setToken(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.token = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'token' field has been set */
    public boolean hasToken() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'token' field */
    public org.openrtb.common.api.Identification.Builder clearToken() {
      token = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Identification build() {
      try {
        Identification record = new Identification();
        record.organization = fieldSetFlags()[0] ? this.organization : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.token = fieldSetFlags()[2] ? this.token : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
