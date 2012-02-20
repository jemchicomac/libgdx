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

public class btBvhTriangleMeshShape extends btTriangleMeshShape {
  private long swigCPtr;

  protected btBvhTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btBvhTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btBvhTriangleMeshShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btBvhTriangleMeshShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_0(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, buildBvh), true);
  }

  public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_1(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression), true);
  }

  public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_2(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh), true);
  }

  public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_3(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax), true);
  }

  public boolean getOwnsBvh() {
    return gdxBulletJNI.btBvhTriangleMeshShape_getOwnsBvh(swigCPtr, this);
  }

  public void performRaycast(btTriangleCallback callback, Vector3 raySource, Vector3 rayTarget) {
    gdxBulletJNI.btBvhTriangleMeshShape_performRaycast(swigCPtr, this, btTriangleCallback.getCPtr(callback), callback, raySource, rayTarget);
  }

  public void performConvexcast(btTriangleCallback callback, Vector3 boxSource, Vector3 boxTarget, Vector3 boxMin, Vector3 boxMax) {
    gdxBulletJNI.btBvhTriangleMeshShape_performConvexcast(swigCPtr, this, btTriangleCallback.getCPtr(callback), callback, boxSource, boxTarget, boxMin, boxMax);
  }

  public void refitTree(Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btBvhTriangleMeshShape_refitTree(swigCPtr, this, aabbMin, aabbMax);
  }

  public void partialRefitTree(Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btBvhTriangleMeshShape_partialRefitTree(swigCPtr, this, aabbMin, aabbMax);
  }

  public btOptimizedBvh getOptimizedBvh() {
    long cPtr = gdxBulletJNI.btBvhTriangleMeshShape_getOptimizedBvh(swigCPtr, this);
    return (cPtr == 0) ? null : new btOptimizedBvh(cPtr, false);
  }

  public void setOptimizedBvh(btOptimizedBvh bvh, Vector3 localScaling) {
    gdxBulletJNI.btBvhTriangleMeshShape_setOptimizedBvh__SWIG_0(swigCPtr, this, btOptimizedBvh.getCPtr(bvh), bvh, localScaling);
  }

  public void setOptimizedBvh(btOptimizedBvh bvh) {
    gdxBulletJNI.btBvhTriangleMeshShape_setOptimizedBvh__SWIG_1(swigCPtr, this, btOptimizedBvh.getCPtr(bvh), bvh);
  }

  public void buildOptimizedBvh() {
    gdxBulletJNI.btBvhTriangleMeshShape_buildOptimizedBvh(swigCPtr, this);
  }

  public boolean usesQuantizedAabbCompression() {
    return gdxBulletJNI.btBvhTriangleMeshShape_usesQuantizedAabbCompression(swigCPtr, this);
  }

  public void setTriangleInfoMap(btTriangleInfoMap triangleInfoMap) {
    gdxBulletJNI.btBvhTriangleMeshShape_setTriangleInfoMap(swigCPtr, this, btTriangleInfoMap.getCPtr(triangleInfoMap), triangleInfoMap);
  }

  public btTriangleInfoMap getTriangleInfoMap() {
    long cPtr = gdxBulletJNI.btBvhTriangleMeshShape_getTriangleInfoMap__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btTriangleInfoMap(cPtr, false);
  }

  public void serializeSingleBvh(SWIGTYPE_p_btSerializer serializer) {
    gdxBulletJNI.btBvhTriangleMeshShape_serializeSingleBvh(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void serializeSingleTriangleInfoMap(SWIGTYPE_p_btSerializer serializer) {
    gdxBulletJNI.btBvhTriangleMeshShape_serializeSingleTriangleInfoMap(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

}
