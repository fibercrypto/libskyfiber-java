/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class GoInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GoInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GoInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_GoInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setT(SWIGTYPE_p_void value) {
    skycoinJNI.set_GoInterface_t(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getT() {
    long cPtr = skycoinJNI.get_GoInterface_t(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setV(SWIGTYPE_p_void value) {
    skycoinJNI.set_GoInterface_v(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getV() {
    long cPtr = skycoinJNI.get_GoInterface_v(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public GoInterface() {
    this(skycoinJNI.new_GoInterface(), true);
  }

}
