/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class coin__Transaction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__Transaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__Transaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__Transaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(coin__Transaction t) {
    return skycoinJNI.coin__Transaction_isEqual(swigCPtr, this, coin__Transaction.getCPtr(t), t);
  }

  public cipher_SHA256 getInnerHash() {
    return new cipher_SHA256(skycoinJNI.coin__Transaction_getInnerHash(swigCPtr, this), true);
  }

  public void setLength(SWIGTYPE_p_GoInt32_ value) {
    skycoinJNI.set_coin__Transaction_Length(swigCPtr, this, SWIGTYPE_p_GoInt32_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt32_ getLength() {
    return new SWIGTYPE_p_GoInt32_(skycoinJNI.get_coin__Transaction_Length(swigCPtr, this), true);
  }

  public void setType(SWIGTYPE_p_GoInt8_ value) {
    skycoinJNI.set_coin__Transaction_Type(swigCPtr, this, SWIGTYPE_p_GoInt8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt8_ getType() {
    return new SWIGTYPE_p_GoInt8_(skycoinJNI.get_coin__Transaction_Type(swigCPtr, this), true);
  }

  public void setInnerHash(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.set_coin__Transaction_InnerHash(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ getInnerHash() {
    long cPtr = skycoinJNI.get_coin__Transaction_InnerHash(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public void setSigs(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.set_coin__Transaction_Sigs(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getSigs() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.get_coin__Transaction_Sigs(swigCPtr, this), true);
  }

  public void setIn(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.set_coin__Transaction_In(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getIn() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.get_coin__Transaction_In(swigCPtr, this), true);
  }

  public void setOut(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.set_coin__Transaction_Out(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getOut() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.get_coin__Transaction_Out(swigCPtr, this), true);
  }

  public coin__Transaction() {
    this(skycoinJNI.new_coin__Transaction(), true);
  }

}
