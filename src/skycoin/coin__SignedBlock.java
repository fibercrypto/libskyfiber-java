/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin;

public class coin__SignedBlock {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__SignedBlock(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__SignedBlock obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__SignedBlock(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_unnamed(coin__Block value) {
    skycoinJNI.coin__SignedBlock__unnamed_set(swigCPtr, this, coin__Block.getCPtr(value), value);
  }

  public coin__Block get_unnamed() {
    long cPtr = skycoinJNI.coin__SignedBlock__unnamed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new coin__Block(cPtr, false);
  }

  public void setSig(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.coin__SignedBlock_Sig_set(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ getSig() {
    long cPtr = skycoinJNI.coin__SignedBlock_Sig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public coin__SignedBlock() {
    this(skycoinJNI.new_coin__SignedBlock(), true);
  }

}