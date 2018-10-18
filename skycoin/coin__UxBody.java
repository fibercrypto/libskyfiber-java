/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class coin__UxBody {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__UxBody(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__UxBody obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__UxBody(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void SetSrcTransaction(cipher_SHA256 o) {
    skycoinJNI.coin__UxBody_SetSrcTransaction(swigCPtr, this, cipher_SHA256.getCPtr(o), o);
  }

  public void setSrcTransaction(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.set_coin__UxBody_SrcTransaction(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ getSrcTransaction() {
    long cPtr = skycoinJNI.get_coin__UxBody_SrcTransaction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public void setAddress(cipher__Address value) {
    skycoinJNI.set_coin__UxBody_Address(swigCPtr, this, cipher__Address.getCPtr(value), value);
  }

  public cipher__Address getAddress() {
    long cPtr = skycoinJNI.get_coin__UxBody_Address(swigCPtr, this);
    return (cPtr == 0) ? null : new cipher__Address(cPtr, false);
  }

  public void setCoins(SWIGTYPE_p_GoUint64_ value) {
    skycoinJNI.set_coin__UxBody_Coins(swigCPtr, this, SWIGTYPE_p_GoUint64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint64_ getCoins() {
    return new SWIGTYPE_p_GoUint64_(skycoinJNI.get_coin__UxBody_Coins(swigCPtr, this), true);
  }

  public void setHours(SWIGTYPE_p_GoUint64_ value) {
    skycoinJNI.set_coin__UxBody_Hours(swigCPtr, this, SWIGTYPE_p_GoUint64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint64_ getHours() {
    return new SWIGTYPE_p_GoUint64_(skycoinJNI.get_coin__UxBody_Hours(swigCPtr, this), true);
  }

  public coin__UxBody() {
    this(skycoinJNI.new_coin__UxBody(), true);
  }

}
