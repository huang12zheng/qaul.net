//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: connections/ble/ble_rpc.proto

package qaul.rpc.ble;

@kotlin.jvm.JvmName("-initializestartRequest")
inline fun startRequest(block: qaul.rpc.ble.StartRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.StartRequest =
  qaul.rpc.ble.StartRequestKt.Dsl._create(qaul.rpc.ble.BleRpc.StartRequest.newBuilder()).apply { block() }._build()
object StartRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.rpc.ble.BleRpc.StartRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.ble.BleRpc.StartRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.ble.BleRpc.StartRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.ble.BleRpc.StartRequest.copy(block: qaul.rpc.ble.StartRequestKt.Dsl.() -> kotlin.Unit): qaul.rpc.ble.BleRpc.StartRequest =
  qaul.rpc.ble.StartRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

