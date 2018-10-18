/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class wallet__Balance {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected wallet__Balance(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(wallet__Balance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_wallet__Balance(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCoins(SWIGTYPE_p_GoUint64_ value) {
    skycoinJNI.set_wallet__Balance_Coins(swigCPtr, this, SWIGTYPE_p_GoUint64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint64_ getCoins() {
    return new SWIGTYPE_p_GoUint64_(skycoinJNI.get_wallet__Balance_Coins(swigCPtr, this), true);
  }

  public void setHours(SWIGTYPE_p_GoUint64_ value) {
    skycoinJNI.set_wallet__Balance_Hours(swigCPtr, this, SWIGTYPE_p_GoUint64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint64_ getHours() {
    return new SWIGTYPE_p_GoUint64_(skycoinJNI.get_wallet__Balance_Hours(swigCPtr, this), true);
  }

  public wallet__Balance() {
    this(skycoinJNI.new_wallet__Balance(), true);
  }

}
