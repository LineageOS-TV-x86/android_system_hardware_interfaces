/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl-gen/android.system.keystore2-V3-java-source -I/home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3/android/system/keystore2/IKeystoreSecurityLevel.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.system.keystore2;
/** @hide */
public interface IKeystoreSecurityLevel extends android.os.IInterface
{
  /** Default implementation for IKeystoreSecurityLevel. */
  public static class Default implements android.system.keystore2.IKeystoreSecurityLevel
  {
    @Override public android.system.keystore2.CreateOperationResponse createOperation(android.system.keystore2.KeyDescriptor key, android.hardware.security.keymint.KeyParameter[] operationParameters, boolean forced) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor attestationKey, android.hardware.security.keymint.KeyParameter[] params, int flags, byte[] entropy) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor attestationKey, android.hardware.security.keymint.KeyParameter[] params, int flags, byte[] keyData) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor wrappingKey, byte[] maskingKey, android.hardware.security.keymint.KeyParameter[] params, android.system.keystore2.AuthenticatorSpec[] authenticators) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.system.keystore2.EphemeralStorageKeyResponse convertStorageKeyToEphemeral(android.system.keystore2.KeyDescriptor storageKey) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void deleteKey(android.system.keystore2.KeyDescriptor key) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.system.keystore2.IKeystoreSecurityLevel
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.system.keystore2.IKeystoreSecurityLevel interface,
     * generating a proxy if needed.
     */
    public static android.system.keystore2.IKeystoreSecurityLevel asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.system.keystore2.IKeystoreSecurityLevel))) {
        return ((android.system.keystore2.IKeystoreSecurityLevel)iin);
      }
      return new android.system.keystore2.IKeystoreSecurityLevel.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_createOperation:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          android.hardware.security.keymint.KeyParameter[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.security.keymint.KeyParameter.CREATOR);
          boolean _arg2;
          _arg2 = data.readBoolean();
          data.enforceNoDataAvail();
          android.system.keystore2.CreateOperationResponse _result = this.createOperation(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_generateKey:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          android.system.keystore2.KeyDescriptor _arg1;
          _arg1 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          android.hardware.security.keymint.KeyParameter[] _arg2;
          _arg2 = data.createTypedArray(android.hardware.security.keymint.KeyParameter.CREATOR);
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          data.enforceNoDataAvail();
          android.system.keystore2.KeyMetadata _result = this.generateKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_importKey:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          android.system.keystore2.KeyDescriptor _arg1;
          _arg1 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          android.hardware.security.keymint.KeyParameter[] _arg2;
          _arg2 = data.createTypedArray(android.hardware.security.keymint.KeyParameter.CREATOR);
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          data.enforceNoDataAvail();
          android.system.keystore2.KeyMetadata _result = this.importKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_importWrappedKey:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          android.system.keystore2.KeyDescriptor _arg1;
          _arg1 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          byte[] _arg2;
          _arg2 = data.createByteArray();
          android.hardware.security.keymint.KeyParameter[] _arg3;
          _arg3 = data.createTypedArray(android.hardware.security.keymint.KeyParameter.CREATOR);
          android.system.keystore2.AuthenticatorSpec[] _arg4;
          _arg4 = data.createTypedArray(android.system.keystore2.AuthenticatorSpec.CREATOR);
          data.enforceNoDataAvail();
          android.system.keystore2.KeyMetadata _result = this.importWrappedKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_convertStorageKeyToEphemeral:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          data.enforceNoDataAvail();
          android.system.keystore2.EphemeralStorageKeyResponse _result = this.convertStorageKeyToEphemeral(_arg0);
          reply.writeNoException();
          reply.writeTypedObject(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_deleteKey:
        {
          android.system.keystore2.KeyDescriptor _arg0;
          _arg0 = data.readTypedObject(android.system.keystore2.KeyDescriptor.CREATOR);
          data.enforceNoDataAvail();
          this.deleteKey(_arg0);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.system.keystore2.IKeystoreSecurityLevel
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public android.system.keystore2.CreateOperationResponse createOperation(android.system.keystore2.KeyDescriptor key, android.hardware.security.keymint.KeyParameter[] operationParameters, boolean forced) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.system.keystore2.CreateOperationResponse _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(key, 0);
          _data.writeTypedArray(operationParameters, 0);
          _data.writeBoolean(forced);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createOperation, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.readTypedObject(android.system.keystore2.CreateOperationResponse.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor attestationKey, android.hardware.security.keymint.KeyParameter[] params, int flags, byte[] entropy) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.system.keystore2.KeyMetadata _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(key, 0);
          _data.writeTypedObject(attestationKey, 0);
          _data.writeTypedArray(params, 0);
          _data.writeInt(flags);
          _data.writeByteArray(entropy);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateKey, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.readTypedObject(android.system.keystore2.KeyMetadata.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor attestationKey, android.hardware.security.keymint.KeyParameter[] params, int flags, byte[] keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.system.keystore2.KeyMetadata _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(key, 0);
          _data.writeTypedObject(attestationKey, 0);
          _data.writeTypedArray(params, 0);
          _data.writeInt(flags);
          _data.writeByteArray(keyData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importKey, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.readTypedObject(android.system.keystore2.KeyMetadata.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor wrappingKey, byte[] maskingKey, android.hardware.security.keymint.KeyParameter[] params, android.system.keystore2.AuthenticatorSpec[] authenticators) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.system.keystore2.KeyMetadata _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(key, 0);
          _data.writeTypedObject(wrappingKey, 0);
          _data.writeByteArray(maskingKey);
          _data.writeTypedArray(params, 0);
          _data.writeTypedArray(authenticators, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importWrappedKey, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.readTypedObject(android.system.keystore2.KeyMetadata.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.system.keystore2.EphemeralStorageKeyResponse convertStorageKeyToEphemeral(android.system.keystore2.KeyDescriptor storageKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.system.keystore2.EphemeralStorageKeyResponse _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(storageKey, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_convertStorageKeyToEphemeral, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.readTypedObject(android.system.keystore2.EphemeralStorageKeyResponse.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void deleteKey(android.system.keystore2.KeyDescriptor key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(key, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKey, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_createOperation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_generateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_importKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_importWrappedKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_convertStorageKeyToEphemeral = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_deleteKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$system$keystore2$IKeystoreSecurityLevel".replace('$', '.');
  public static final int KEY_FLAG_AUTH_BOUND_WITHOUT_CRYPTOGRAPHIC_LSKF_BINDING = 1;
  public android.system.keystore2.CreateOperationResponse createOperation(android.system.keystore2.KeyDescriptor key, android.hardware.security.keymint.KeyParameter[] operationParameters, boolean forced) throws android.os.RemoteException;
  public android.system.keystore2.KeyMetadata generateKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor attestationKey, android.hardware.security.keymint.KeyParameter[] params, int flags, byte[] entropy) throws android.os.RemoteException;
  public android.system.keystore2.KeyMetadata importKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor attestationKey, android.hardware.security.keymint.KeyParameter[] params, int flags, byte[] keyData) throws android.os.RemoteException;
  public android.system.keystore2.KeyMetadata importWrappedKey(android.system.keystore2.KeyDescriptor key, android.system.keystore2.KeyDescriptor wrappingKey, byte[] maskingKey, android.hardware.security.keymint.KeyParameter[] params, android.system.keystore2.AuthenticatorSpec[] authenticators) throws android.os.RemoteException;
  public android.system.keystore2.EphemeralStorageKeyResponse convertStorageKeyToEphemeral(android.system.keystore2.KeyDescriptor storageKey) throws android.os.RemoteException;
  public void deleteKey(android.system.keystore2.KeyDescriptor key) throws android.os.RemoteException;
}
