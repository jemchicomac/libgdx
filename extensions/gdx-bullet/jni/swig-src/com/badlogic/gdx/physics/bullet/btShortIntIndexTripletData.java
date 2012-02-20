/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btShortIntIndexTripletData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btShortIntIndexTripletData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btShortIntIndexTripletData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btShortIntIndexTripletData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void setM_values(short[] value) {
    gdxBulletJNI.btShortIntIndexTripletData_m_values_set(swigCPtr, this, value);
  }

  public short[] getM_values() {
    return gdxBulletJNI.btShortIntIndexTripletData_m_values_get(swigCPtr, this);
  }

  public void setM_pad(String value) {
    gdxBulletJNI.btShortIntIndexTripletData_m_pad_set(swigCPtr, this, value);
  }

  public String getM_pad() {
    return gdxBulletJNI.btShortIntIndexTripletData_m_pad_get(swigCPtr, this);
  }

  public btShortIntIndexTripletData() {
    this(gdxBulletJNI.new_btShortIntIndexTripletData(), true);
  }

}
