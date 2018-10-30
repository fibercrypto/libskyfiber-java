/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class coin__TransactionOutput {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__TransactionOutput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__TransactionOutput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__TransactionOutput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(coin__TransactionOutput t) {
    return skycoinJNI.coin__TransactionOutput_isEqual(swigCPtr, this, coin__TransactionOutput.getCPtr(t), t);
  }

  public void setAddress(cipher__Address value) {
    skycoinJNI.coin__TransactionOutput_Address_set(swigCPtr, this, cipher__Address.getCPtr(value), value);
  }

  public cipher__Address getAddress() {
    long cPtr = skycoinJNI.coin__TransactionOutput_Address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new cipher__Address(cPtr, false);
  }

  public void setCoins(java.math.BigInteger value) {
    skycoinJNI.coin__TransactionOutput_Coins_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getCoins() {
    return skycoinJNI.coin__TransactionOutput_Coins_get(swigCPtr, this);
  }

  public void setHours(java.math.BigInteger value) {
    skycoinJNI.coin__TransactionOutput_Hours_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getHours() {
    return skycoinJNI.coin__TransactionOutput_Hours_get(swigCPtr, this);
  }

  public coin__TransactionOutput() {
    this(skycoinJNI.new_coin__TransactionOutput(), true);
  }

}