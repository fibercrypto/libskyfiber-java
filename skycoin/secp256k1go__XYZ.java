/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class secp256k1go__XYZ {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected secp256k1go__XYZ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(secp256k1go__XYZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_secp256k1go__XYZ(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(secp256k1go__Field value) {
    skycoinJNI.set_secp256k1go__XYZ_X(swigCPtr, this, secp256k1go__Field.getCPtr(value), value);
  }

  public secp256k1go__Field getX() {
    long cPtr = skycoinJNI.get_secp256k1go__XYZ_X(swigCPtr, this);
    return (cPtr == 0) ? null : new secp256k1go__Field(cPtr, false);
  }

  public void setY(secp256k1go__Field value) {
    skycoinJNI.set_secp256k1go__XYZ_Y(swigCPtr, this, secp256k1go__Field.getCPtr(value), value);
  }

  public secp256k1go__Field getY() {
    long cPtr = skycoinJNI.get_secp256k1go__XYZ_Y(swigCPtr, this);
    return (cPtr == 0) ? null : new secp256k1go__Field(cPtr, false);
  }

  public void setZ(secp256k1go__Field value) {
    skycoinJNI.set_secp256k1go__XYZ_Z(swigCPtr, this, secp256k1go__Field.getCPtr(value), value);
  }

  public secp256k1go__Field getZ() {
    long cPtr = skycoinJNI.get_secp256k1go__XYZ_Z(swigCPtr, this);
    return (cPtr == 0) ? null : new secp256k1go__Field(cPtr, false);
  }

  public void setInfinity(SWIGTYPE_p_BOOL value) {
    skycoinJNI.set_secp256k1go__XYZ_Infinity(swigCPtr, this, SWIGTYPE_p_BOOL.getCPtr(value));
  }

  public SWIGTYPE_p_BOOL getInfinity() {
    return new SWIGTYPE_p_BOOL(skycoinJNI.get_secp256k1go__XYZ_Infinity(swigCPtr, this), true);
  }

  public secp256k1go__XYZ() {
    this(skycoinJNI.new_secp256k1go__XYZ(), true);
  }

}
