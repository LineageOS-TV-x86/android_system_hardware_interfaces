/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl-gen/android.system.keystore2-V3-java-source -I/home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/3/android/system/keystore2/CreateOperationResponse.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.system.keystore2;
/** @hide */
public class CreateOperationResponse implements android.os.Parcelable
{
  public android.system.keystore2.IKeystoreOperation iOperation;
  public android.system.keystore2.OperationChallenge operationChallenge;
  public android.system.keystore2.KeyParameters parameters;
  public byte[] upgradedBlob;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CreateOperationResponse> CREATOR = new android.os.Parcelable.Creator<CreateOperationResponse>() {
    @Override
    public CreateOperationResponse createFromParcel(android.os.Parcel _aidl_source) {
      CreateOperationResponse _aidl_out = new CreateOperationResponse();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CreateOperationResponse[] newArray(int _aidl_size) {
      return new CreateOperationResponse[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeStrongInterface(iOperation);
    _aidl_parcel.writeTypedObject(operationChallenge, _aidl_flag);
    _aidl_parcel.writeTypedObject(parameters, _aidl_flag);
    _aidl_parcel.writeByteArray(upgradedBlob);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      iOperation = android.system.keystore2.IKeystoreOperation.Stub.asInterface(_aidl_parcel.readStrongBinder());
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      operationChallenge = _aidl_parcel.readTypedObject(android.system.keystore2.OperationChallenge.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      parameters = _aidl_parcel.readTypedObject(android.system.keystore2.KeyParameters.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      upgradedBlob = _aidl_parcel.createByteArray();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(operationChallenge);
    _mask |= describeContents(parameters);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
