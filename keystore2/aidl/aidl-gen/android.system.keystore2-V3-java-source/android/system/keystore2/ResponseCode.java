/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl-gen/android.system.keystore2-V3-java-source -I/home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3/android/system/keystore2/ResponseCode.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.system.keystore2;
/** @hide */
public @interface ResponseCode {
  public static final int LOCKED = 2;
  public static final int UNINITIALIZED = 3;
  public static final int SYSTEM_ERROR = 4;
  public static final int PERMISSION_DENIED = 6;
  public static final int KEY_NOT_FOUND = 7;
  public static final int VALUE_CORRUPTED = 8;
  public static final int KEY_PERMANENTLY_INVALIDATED = 17;
  public static final int BACKEND_BUSY = 18;
  public static final int OPERATION_BUSY = 19;
  public static final int INVALID_ARGUMENT = 20;
  public static final int TOO_MUCH_DATA = 21;
  /** @deprecated replaced by other OUT_OF_KEYS_* errors below */
  @Deprecated
  public static final int OUT_OF_KEYS = 22;
  public static final int OUT_OF_KEYS_REQUIRES_SYSTEM_UPGRADE = 23;
  public static final int OUT_OF_KEYS_PENDING_INTERNET_CONNECTIVITY = 24;
  public static final int OUT_OF_KEYS_TRANSIENT_ERROR = 25;
  public static final int OUT_OF_KEYS_PERMANENT_ERROR = 26;
}
