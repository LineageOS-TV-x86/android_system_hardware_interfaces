/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl-gen/android.system.keystore2-V3-java-source -I/home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3/android/system/keystore2/IKeystoreOperation.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.system.keystore2;
/** @hide */
public interface IKeystoreOperation extends android.os.IInterface
{
  /** Default implementation for IKeystoreOperation. */
  public static class Default implements android.system.keystore2.IKeystoreOperation
  {
    @Override public void updateAad(byte[] aadInput) throws android.os.RemoteException
    {
    }
    @Override public byte[] update(byte[] input) throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] finish(byte[] input, byte[] signature) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void abort() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.system.keystore2.IKeystoreOperation
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.system.keystore2.IKeystoreOperation interface,
     * generating a proxy if needed.
     */
    public static android.system.keystore2.IKeystoreOperation asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.system.keystore2.IKeystoreOperation))) {
        return ((android.system.keystore2.IKeystoreOperation)iin);
      }
      return new android.system.keystore2.IKeystoreOperation.Stub.Proxy(obj);
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
        case TRANSACTION_updateAad:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          data.enforceNoDataAvail();
          this.updateAad(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_update:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          data.enforceNoDataAvail();
          byte[] _result = this.update(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_finish:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          data.enforceNoDataAvail();
          byte[] _result = this.finish(_arg0, _arg1);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_abort:
        {
          this.abort();
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
    private static final class Proxy implements android.system.keystore2.IKeystoreOperation
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
      @Override public void updateAad(byte[] aadInput) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(aadInput);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAad, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public byte[] update(byte[] input) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(input);
          boolean _status = mRemote.transact(Stub.TRANSACTION_update, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] finish(byte[] input, byte[] signature) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(input);
          _data.writeByteArray(signature);
          boolean _status = mRemote.transact(Stub.TRANSACTION_finish, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void abort() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abort, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_updateAad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_update = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_finish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_abort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$system$keystore2$IKeystoreOperation".replace('$', '.');
  public void updateAad(byte[] aadInput) throws android.os.RemoteException;
  public byte[] update(byte[] input) throws android.os.RemoteException;
  public byte[] finish(byte[] input, byte[] signature) throws android.os.RemoteException;
  public void abort() throws android.os.RemoteException;
}
