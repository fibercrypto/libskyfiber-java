/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class coin__BlockBody {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__BlockBody(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__BlockBody obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__BlockBody(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(coin__BlockBody b) {
    return skycoinJNI.coin__BlockBody_isEqual(swigCPtr, this, coin__BlockBody.getCPtr(b), b);
  }

  public void setTransactions(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.set_coin__BlockBody_Transactions(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getTransactions() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.get_coin__BlockBody_Transactions(swigCPtr, this), true);
  }

  public coin__BlockBody() {
    this(skycoinJNI.new_coin__BlockBody(), true);
  }

}
