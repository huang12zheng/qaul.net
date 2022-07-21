//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble.proto

package qaul.sys.ble;

@kotlin.jvm.JvmName("-initializeble")
inline fun ble(block: qaul.sys.ble.BleKt.Dsl.() -> kotlin.Unit): qaul.sys.ble.BleOuterClass.Ble =
  qaul.sys.ble.BleKt.Dsl._create(qaul.sys.ble.BleOuterClass.Ble.newBuilder()).apply { block() }._build()
object BleKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.sys.ble.BleOuterClass.Ble.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.sys.ble.BleOuterClass.Ble.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.sys.ble.BleOuterClass.Ble = _builder.build()

    /**
     * <pre>
     * device information request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleInfoRequest info_request = 1;</code>
     */
    var infoRequest: qaul.sys.ble.BleOuterClass.BleInfoRequest
      @JvmName("getInfoRequest")
      get() = _builder.getInfoRequest()
      @JvmName("setInfoRequest")
      set(value) {
        _builder.setInfoRequest(value)
      }
    /**
     * <pre>
     * device information request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleInfoRequest info_request = 1;</code>
     */
    fun clearInfoRequest() {
      _builder.clearInfoRequest()
    }
    /**
     * <pre>
     * device information request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleInfoRequest info_request = 1;</code>
     * @return Whether the infoRequest field is set.
     */
    fun hasInfoRequest(): kotlin.Boolean {
      return _builder.hasInfoRequest()
    }

    /**
     * <pre>
     * device information response
     * </pre>
     *
     * <code>.qaul.sys.ble.BleInfoResponse info_response = 2;</code>
     */
    var infoResponse: qaul.sys.ble.BleOuterClass.BleInfoResponse
      @JvmName("getInfoResponse")
      get() = _builder.getInfoResponse()
      @JvmName("setInfoResponse")
      set(value) {
        _builder.setInfoResponse(value)
      }
    /**
     * <pre>
     * device information response
     * </pre>
     *
     * <code>.qaul.sys.ble.BleInfoResponse info_response = 2;</code>
     */
    fun clearInfoResponse() {
      _builder.clearInfoResponse()
    }
    /**
     * <pre>
     * device information response
     * </pre>
     *
     * <code>.qaul.sys.ble.BleInfoResponse info_response = 2;</code>
     * @return Whether the infoResponse field is set.
     */
    fun hasInfoResponse(): kotlin.Boolean {
      return _builder.hasInfoResponse()
    }

    /**
     * <pre>
     * start device request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStartRequest start_request = 3;</code>
     */
    var startRequest: qaul.sys.ble.BleOuterClass.BleStartRequest
      @JvmName("getStartRequest")
      get() = _builder.getStartRequest()
      @JvmName("setStartRequest")
      set(value) {
        _builder.setStartRequest(value)
      }
    /**
     * <pre>
     * start device request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStartRequest start_request = 3;</code>
     */
    fun clearStartRequest() {
      _builder.clearStartRequest()
    }
    /**
     * <pre>
     * start device request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStartRequest start_request = 3;</code>
     * @return Whether the startRequest field is set.
     */
    fun hasStartRequest(): kotlin.Boolean {
      return _builder.hasStartRequest()
    }

    /**
     * <pre>
     * start device result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStartResult start_result = 4;</code>
     */
    var startResult: qaul.sys.ble.BleOuterClass.BleStartResult
      @JvmName("getStartResult")
      get() = _builder.getStartResult()
      @JvmName("setStartResult")
      set(value) {
        _builder.setStartResult(value)
      }
    /**
     * <pre>
     * start device result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStartResult start_result = 4;</code>
     */
    fun clearStartResult() {
      _builder.clearStartResult()
    }
    /**
     * <pre>
     * start device result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStartResult start_result = 4;</code>
     * @return Whether the startResult field is set.
     */
    fun hasStartResult(): kotlin.Boolean {
      return _builder.hasStartResult()
    }

    /**
     * <pre>
     * stop device request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStopRequest stop_request = 5;</code>
     */
    var stopRequest: qaul.sys.ble.BleOuterClass.BleStopRequest
      @JvmName("getStopRequest")
      get() = _builder.getStopRequest()
      @JvmName("setStopRequest")
      set(value) {
        _builder.setStopRequest(value)
      }
    /**
     * <pre>
     * stop device request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStopRequest stop_request = 5;</code>
     */
    fun clearStopRequest() {
      _builder.clearStopRequest()
    }
    /**
     * <pre>
     * stop device request
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStopRequest stop_request = 5;</code>
     * @return Whether the stopRequest field is set.
     */
    fun hasStopRequest(): kotlin.Boolean {
      return _builder.hasStopRequest()
    }

    /**
     * <pre>
     * stop device result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStopResult stop_result = 6;</code>
     */
    var stopResult: qaul.sys.ble.BleOuterClass.BleStopResult
      @JvmName("getStopResult")
      get() = _builder.getStopResult()
      @JvmName("setStopResult")
      set(value) {
        _builder.setStopResult(value)
      }
    /**
     * <pre>
     * stop device result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStopResult stop_result = 6;</code>
     */
    fun clearStopResult() {
      _builder.clearStopResult()
    }
    /**
     * <pre>
     * stop device result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleStopResult stop_result = 6;</code>
     * @return Whether the stopResult field is set.
     */
    fun hasStopResult(): kotlin.Boolean {
      return _builder.hasStopResult()
    }

    /**
     * <pre>
     * device discovered
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDeviceDiscovered device_discovered = 7;</code>
     */
    var deviceDiscovered: qaul.sys.ble.BleOuterClass.BleDeviceDiscovered
      @JvmName("getDeviceDiscovered")
      get() = _builder.getDeviceDiscovered()
      @JvmName("setDeviceDiscovered")
      set(value) {
        _builder.setDeviceDiscovered(value)
      }
    /**
     * <pre>
     * device discovered
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDeviceDiscovered device_discovered = 7;</code>
     */
    fun clearDeviceDiscovered() {
      _builder.clearDeviceDiscovered()
    }
    /**
     * <pre>
     * device discovered
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDeviceDiscovered device_discovered = 7;</code>
     * @return Whether the deviceDiscovered field is set.
     */
    fun hasDeviceDiscovered(): kotlin.Boolean {
      return _builder.hasDeviceDiscovered()
    }

    /**
     * <pre>
     * device became unavailable
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDeviceUnavailable device_unavailable = 8;</code>
     */
    var deviceUnavailable: qaul.sys.ble.BleOuterClass.BleDeviceUnavailable
      @JvmName("getDeviceUnavailable")
      get() = _builder.getDeviceUnavailable()
      @JvmName("setDeviceUnavailable")
      set(value) {
        _builder.setDeviceUnavailable(value)
      }
    /**
     * <pre>
     * device became unavailable
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDeviceUnavailable device_unavailable = 8;</code>
     */
    fun clearDeviceUnavailable() {
      _builder.clearDeviceUnavailable()
    }
    /**
     * <pre>
     * device became unavailable
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDeviceUnavailable device_unavailable = 8;</code>
     * @return Whether the deviceUnavailable field is set.
     */
    fun hasDeviceUnavailable(): kotlin.Boolean {
      return _builder.hasDeviceUnavailable()
    }

    /**
     * <pre>
     * send a direct message
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectSend direct_send = 9;</code>
     */
    var directSend: qaul.sys.ble.BleOuterClass.BleDirectSend
      @JvmName("getDirectSend")
      get() = _builder.getDirectSend()
      @JvmName("setDirectSend")
      set(value) {
        _builder.setDirectSend(value)
      }
    /**
     * <pre>
     * send a direct message
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectSend direct_send = 9;</code>
     */
    fun clearDirectSend() {
      _builder.clearDirectSend()
    }
    /**
     * <pre>
     * send a direct message
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectSend direct_send = 9;</code>
     * @return Whether the directSend field is set.
     */
    fun hasDirectSend(): kotlin.Boolean {
      return _builder.hasDirectSend()
    }

    /**
     * <pre>
     * direct message send result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectSendResult direct_send_result = 10;</code>
     */
    var directSendResult: qaul.sys.ble.BleOuterClass.BleDirectSendResult
      @JvmName("getDirectSendResult")
      get() = _builder.getDirectSendResult()
      @JvmName("setDirectSendResult")
      set(value) {
        _builder.setDirectSendResult(value)
      }
    /**
     * <pre>
     * direct message send result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectSendResult direct_send_result = 10;</code>
     */
    fun clearDirectSendResult() {
      _builder.clearDirectSendResult()
    }
    /**
     * <pre>
     * direct message send result
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectSendResult direct_send_result = 10;</code>
     * @return Whether the directSendResult field is set.
     */
    fun hasDirectSendResult(): kotlin.Boolean {
      return _builder.hasDirectSendResult()
    }

    /**
     * <pre>
     * direct message received
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectReceived direct_received = 11;</code>
     */
    var directReceived: qaul.sys.ble.BleOuterClass.BleDirectReceived
      @JvmName("getDirectReceived")
      get() = _builder.getDirectReceived()
      @JvmName("setDirectReceived")
      set(value) {
        _builder.setDirectReceived(value)
      }
    /**
     * <pre>
     * direct message received
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectReceived direct_received = 11;</code>
     */
    fun clearDirectReceived() {
      _builder.clearDirectReceived()
    }
    /**
     * <pre>
     * direct message received
     * </pre>
     *
     * <code>.qaul.sys.ble.BleDirectReceived direct_received = 11;</code>
     * @return Whether the directReceived field is set.
     */
    fun hasDirectReceived(): kotlin.Boolean {
      return _builder.hasDirectReceived()
    }
    val messageCase: qaul.sys.ble.BleOuterClass.Ble.MessageCase
      @JvmName("getMessageCase")
      get() = _builder.getMessageCase()

    fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.sys.ble.BleOuterClass.Ble.copy(block: qaul.sys.ble.BleKt.Dsl.() -> kotlin.Unit): qaul.sys.ble.BleOuterClass.Ble =
  qaul.sys.ble.BleKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val qaul.sys.ble.BleOuterClass.BleOrBuilder.infoRequestOrNull: qaul.sys.ble.BleOuterClass.BleInfoRequest?
  get() = if (hasInfoRequest()) getInfoRequest() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.infoResponseOrNull: qaul.sys.ble.BleOuterClass.BleInfoResponse?
  get() = if (hasInfoResponse()) getInfoResponse() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.startRequestOrNull: qaul.sys.ble.BleOuterClass.BleStartRequest?
  get() = if (hasStartRequest()) getStartRequest() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.startResultOrNull: qaul.sys.ble.BleOuterClass.BleStartResult?
  get() = if (hasStartResult()) getStartResult() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.stopRequestOrNull: qaul.sys.ble.BleOuterClass.BleStopRequest?
  get() = if (hasStopRequest()) getStopRequest() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.stopResultOrNull: qaul.sys.ble.BleOuterClass.BleStopResult?
  get() = if (hasStopResult()) getStopResult() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.deviceDiscoveredOrNull: qaul.sys.ble.BleOuterClass.BleDeviceDiscovered?
  get() = if (hasDeviceDiscovered()) getDeviceDiscovered() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.deviceUnavailableOrNull: qaul.sys.ble.BleOuterClass.BleDeviceUnavailable?
  get() = if (hasDeviceUnavailable()) getDeviceUnavailable() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.directSendOrNull: qaul.sys.ble.BleOuterClass.BleDirectSend?
  get() = if (hasDirectSend()) getDirectSend() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.directSendResultOrNull: qaul.sys.ble.BleOuterClass.BleDirectSendResult?
  get() = if (hasDirectSendResult()) getDirectSendResult() else null

val qaul.sys.ble.BleOuterClass.BleOrBuilder.directReceivedOrNull: qaul.sys.ble.BleOuterClass.BleDirectReceived?
  get() = if (hasDirectReceived()) getDirectReceived() else null

