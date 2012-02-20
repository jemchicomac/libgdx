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

public class btGeneric6DofSpringConstraint extends btGeneric6DofConstraint {
  private long swigCPtr;

  protected btGeneric6DofSpringConstraint(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btGeneric6DofSpringConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btGeneric6DofSpringConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btGeneric6DofSpringConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btGeneric6DofSpringConstraint(btRigidBody rbA, btRigidBody rbB, btTransform frameInA, btTransform frameInB, boolean useLinearReferenceFrameA) {
    this(gdxBulletJNI.new_btGeneric6DofSpringConstraint(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, btTransform.getCPtr(frameInA), frameInA, btTransform.getCPtr(frameInB), frameInB, useLinearReferenceFrameA), true);
  }

  public void enableSpring(int index, boolean onOff) {
    gdxBulletJNI.btGeneric6DofSpringConstraint_enableSpring(swigCPtr, this, index, onOff);
  }

  public void setStiffness(int index, float stiffness) {
    gdxBulletJNI.btGeneric6DofSpringConstraint_setStiffness(swigCPtr, this, index, stiffness);
  }

  public void setDamping(int index, float damping) {
    gdxBulletJNI.btGeneric6DofSpringConstraint_setDamping(swigCPtr, this, index, damping);
  }

  public void setEquilibriumPoint() {
    gdxBulletJNI.btGeneric6DofSpringConstraint_setEquilibriumPoint__SWIG_0(swigCPtr, this);
  }

  public void setEquilibriumPoint(int index) {
    gdxBulletJNI.btGeneric6DofSpringConstraint_setEquilibriumPoint__SWIG_1(swigCPtr, this, index);
  }

  public void setEquilibriumPoint(int index, float val) {
    gdxBulletJNI.btGeneric6DofSpringConstraint_setEquilibriumPoint__SWIG_2(swigCPtr, this, index, val);
  }

  public void setAxis(Vector3 axis1, Vector3 axis2) {
    gdxBulletJNI.btGeneric6DofSpringConstraint_setAxis(swigCPtr, this, axis1, axis2);
  }

}
