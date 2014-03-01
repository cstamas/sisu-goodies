/*
 * Copyright (c) 2007-2014 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.sisu.goodies.jmx;

import javax.inject.Named;

import org.weakref.jmx.Managed;

@Named
public class SimpleObject
{
  private boolean booleanValue;

  private Boolean booleanBoxedValue;

  private byte byteValue;

  private Byte byteBoxedValue;

  private short shortValue;

  private Short shortBoxedValue;

  private int integerValue;

  private Integer integerBoxedValue;

  private long longValue;

  private Long longBoxedValue;

  private float floatValue;

  private Float floatBoxedValue;

  private double doubleValue;

  private Double doubleBoxedValue;

  private String stringValue;

  private Object objectValue;

  private int notManaged;

  private int writeOnly;

  private int readOnly;

  @Managed(description = "is a boolean value")
  public boolean isBooleanValue() {
    return booleanValue;
  }

  @Managed
  public void setBooleanValue(boolean booleanValue) {
    this.booleanValue = booleanValue;
  }

  @Managed
  public Boolean isBooleanBoxedValue() {
    return booleanBoxedValue;
  }

  @Managed
  public void setBooleanBoxedValue(Boolean booleanBoxedValue) {
    this.booleanBoxedValue = booleanBoxedValue;
  }

  @Managed
  public byte getByteValue() {
    return byteValue;
  }

  @Managed
  public void setByteValue(byte byteValue) {
    this.byteValue = byteValue;
  }

  @Managed
  public Byte getByteBoxedValue() {
    return byteBoxedValue;
  }

  @Managed
  public void setByteBoxedValue(Byte byteBoxedValue) {
    this.byteBoxedValue = byteBoxedValue;
  }

  @Managed
  public short getShortValue() {
    return shortValue;
  }

  @Managed
  public void setShortValue(short shortValue) {
    this.shortValue = shortValue;
  }

  @Managed
  public Short getShortBoxedValue() {
    return shortBoxedValue;
  }

  @Managed
  public void setShortBoxedValue(Short shortBoxedValue) {
    this.shortBoxedValue = shortBoxedValue;
  }

  @Managed
  public int getIntegerValue() {
    return integerValue;
  }

  @Managed
  public void setIntegerValue(int integerValue) {
    this.integerValue = integerValue;
  }

  @Managed
  public Integer getIntegerBoxedValue() {
    return integerBoxedValue;
  }

  @Managed
  public void setIntegerBoxedValue(Integer integerBoxedValue) {
    this.integerBoxedValue = integerBoxedValue;
  }

  @Managed
  public long getLongValue() {
    return longValue;
  }

  @Managed
  public void setLongValue(long longValue) {
    this.longValue = longValue;
  }

  @Managed
  public Long getLongBoxedValue() {
    return longBoxedValue;
  }

  @Managed
  public void setLongBoxedValue(Long longBoxedValue) {
    this.longBoxedValue = longBoxedValue;
  }

  @Managed
  public float getFloatValue() {
    return floatValue;
  }

  @Managed
  public void setFloatValue(float floatValue) {
    this.floatValue = floatValue;
  }

  @Managed
  public Float getFloatBoxedValue() {
    return floatBoxedValue;
  }

  @Managed
  public void setFloatBoxedValue(Float floatBoxedValue) {
    this.floatBoxedValue = floatBoxedValue;
  }

  @Managed
  public double getDoubleValue() {
    return doubleValue;
  }

  @Managed
  public void setDoubleValue(double doubleValue) {
    this.doubleValue = doubleValue;
  }

  @Managed
  public Double getDoubleBoxedValue() {
    return doubleBoxedValue;
  }

  @Managed
  public void setDoubleBoxedValue(Double doubleBoxedValue) {
    this.doubleBoxedValue = doubleBoxedValue;
  }

  @Managed
  public String getStringValue() {
    return stringValue;
  }

  @Managed
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public void setNotManaged(int value) {
    this.notManaged = value;
  }

  public int getNotManaged() {
    return notManaged;
  }

  @Managed
  public Object echo(Object value) {
    return value;
  }

  @Managed
  public Object getObjectValue() {
    return objectValue;
  }

  @Managed
  public void setObjectValue(Object objectValue) {
    this.objectValue = objectValue;
  }

  public int getWriteOnly() {
    return writeOnly;
  }

  @Managed
  public void setWriteOnly(int writeOnly) {
    this.writeOnly = writeOnly;
  }

  @Managed
  public int getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(int readOnly) {
    this.readOnly = readOnly;
  }

  @Managed(description = "epic description")
  public int getDescribedInt() {
    return 1;
  }

  // NOTE: The name here does not propagate, jmxutils does not appear to support param names :-(

  @Managed
  public void doSomething(final @Named("VALUE_GOES_HERE") String value) {
    //nop
  }
}