/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ee.ria.libdigidocpp;

public class ConfV2 extends Conf {
  private transient long swigCPtr;

  protected ConfV2(long cPtr, boolean cMemoryOwn) {
    super(digidocJNI.ConfV2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConfV2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        digidocJNI.delete_ConfV2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ConfV2() {
    this(digidocJNI.new_ConfV2(), true);
  }

  public static ConfV2 instance() {
    long cPtr = digidocJNI.ConfV2_instance();
    return (cPtr == 0) ? null : new ConfV2(cPtr, false);
  }

}
