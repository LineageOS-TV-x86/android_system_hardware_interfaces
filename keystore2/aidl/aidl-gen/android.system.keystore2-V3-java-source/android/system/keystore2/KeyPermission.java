/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl-gen/android.system.keystore2-V3-java-source -I/home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3/android/system/keystore2/KeyPermission.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.system.keystore2;
/** @hide */
public @interface KeyPermission {
  public static final int NONE = 0;
  public static final int DELETE = 1;
  public static final int GEN_UNIQUE_ID = 2;
  public static final int GET_INFO = 4;
  public static final int GRANT = 8;
  public static final int MANAGE_BLOB = 16;
  public static final int REBIND = 32;
  public static final int REQ_FORCED_OP = 64;
  public static final int UPDATE = 128;
  public static final int USE = 256;
  public static final int USE_DEV_ID = 512;
  public static final int USE_NO_LSKF_BINDING = 1024;
  public static final int CONVERT_STORAGE_KEY_TO_EPHEMERAL = 2048;
}
