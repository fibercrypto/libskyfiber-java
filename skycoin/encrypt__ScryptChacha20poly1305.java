/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class encrypt__ScryptChacha20poly1305 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected encrypt__ScryptChacha20poly1305(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(encrypt__ScryptChacha20poly1305 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_encrypt__ScryptChacha20poly1305(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setN(SWIGTYPE_p_GoInt_ value) {
    skycoinJNI.set_encrypt__ScryptChacha20poly1305_N(swigCPtr, this, SWIGTYPE_p_GoInt_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt_ getN() {
    return new SWIGTYPE_p_GoInt_(skycoinJNI.get_encrypt__ScryptChacha20poly1305_N(swigCPtr, this), true);
  }

  public void setR(SWIGTYPE_p_GoInt_ value) {
    skycoinJNI.set_encrypt__ScryptChacha20poly1305_R(swigCPtr, this, SWIGTYPE_p_GoInt_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt_ getR() {
    return new SWIGTYPE_p_GoInt_(skycoinJNI.get_encrypt__ScryptChacha20poly1305_R(swigCPtr, this), true);
  }

  public void setP(SWIGTYPE_p_GoInt_ value) {
    skycoinJNI.set_encrypt__ScryptChacha20poly1305_P(swigCPtr, this, SWIGTYPE_p_GoInt_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt_ getP() {
    return new SWIGTYPE_p_GoInt_(skycoinJNI.get_encrypt__ScryptChacha20poly1305_P(swigCPtr, this), true);
  }

  public void setKeyLen(SWIGTYPE_p_GoInt_ value) {
    skycoinJNI.set_encrypt__ScryptChacha20poly1305_KeyLen(swigCPtr, this, SWIGTYPE_p_GoInt_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt_ getKeyLen() {
    return new SWIGTYPE_p_GoInt_(skycoinJNI.get_encrypt__ScryptChacha20poly1305_KeyLen(swigCPtr, this), true);
  }

  public encrypt__ScryptChacha20poly1305() {
    this(skycoinJNI.new_encrypt__ScryptChacha20poly1305(), true);
  }

}
