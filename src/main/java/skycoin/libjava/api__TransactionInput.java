/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class api__TransactionInput {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected api__TransactionInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(api__TransactionInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_api__TransactionInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUxOut(coin__UxOut value) {
    skycoinJNI.api__TransactionInput_UxOut_set(swigCPtr, this, coin__UxOut.getCPtr(value), value);
  }

  public coin__UxOut getUxOut() {
    long cPtr = skycoinJNI.api__TransactionInput_UxOut_get(swigCPtr, this);
    return (cPtr == 0) ? null : new coin__UxOut(cPtr, false);
  }

  public void setCalculatedHours(java.math.BigInteger value) {
    skycoinJNI.api__TransactionInput_CalculatedHours_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getCalculatedHours() {
    return skycoinJNI.api__TransactionInput_CalculatedHours_get(swigCPtr, this);
  }

  public api__TransactionInput() {
    this(skycoinJNI.new_api__TransactionInput(), true);
  }

}
