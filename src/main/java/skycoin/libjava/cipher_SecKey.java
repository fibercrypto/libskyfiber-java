/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skyfiber.libjava;

public class cipher_SecKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected cipher_SecKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cipher_SecKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_cipher_SecKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(cipher_SecKey a) {
    return skycoinJNI.cipher_SecKey_isEqual(swigCPtr, this, cipher_SecKey.getCPtr(a), a);
  }

  public void assignFrom(SWIGTYPE_p_void data) {
    skycoinJNI.cipher_SecKey_assignFrom(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data));
  }

  public void assignTo(SWIGTYPE_p_void data) {
    skycoinJNI.cipher_SecKey_assignTo(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data));
  }

  public void setData(short[] value) {
    skycoinJNI.cipher_SecKey_data_set(swigCPtr, this, value);
  }

  public short[] getData() {
    return skycoinJNI.cipher_SecKey_data_get(swigCPtr, this);
  }

  public cipher_SecKey() {
    this(skycoinJNI.new_cipher_SecKey(), true);
  }

}
