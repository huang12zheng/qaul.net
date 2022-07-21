//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/messaging/messaging.proto

package qaul.net.messaging;

@kotlin.jvm.JvmName("-initializecontainer")
inline fun container(block: qaul.net.messaging.ContainerKt.Dsl.() -> kotlin.Unit): qaul.net.messaging.MessagingOuterClass.Container =
  qaul.net.messaging.ContainerKt.Dsl._create(qaul.net.messaging.MessagingOuterClass.Container.newBuilder()).apply { block() }._build()
object ContainerKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.messaging.MessagingOuterClass.Container.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.messaging.MessagingOuterClass.Container.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.messaging.MessagingOuterClass.Container = _builder.build()

    /**
     * <pre>
     * signed by sending user
     * </pre>
     *
     * <code>bytes signature = 1;</code>
     */
    var signature: com.google.protobuf.ByteString
      @JvmName("getSignature")
      get() = _builder.getSignature()
      @JvmName("setSignature")
      set(value) {
        _builder.setSignature(value)
      }
    /**
     * <pre>
     * signed by sending user
     * </pre>
     *
     * <code>bytes signature = 1;</code>
     */
    fun clearSignature() {
      _builder.clearSignature()
    }

    /**
     * <pre>
     * Message envelope
     * </pre>
     *
     * <code>.qaul.net.messaging.Envelope envelope = 2;</code>
     */
    var envelope: qaul.net.messaging.MessagingOuterClass.Envelope
      @JvmName("getEnvelope")
      get() = _builder.getEnvelope()
      @JvmName("setEnvelope")
      set(value) {
        _builder.setEnvelope(value)
      }
    /**
     * <pre>
     * Message envelope
     * </pre>
     *
     * <code>.qaul.net.messaging.Envelope envelope = 2;</code>
     */
    fun clearEnvelope() {
      _builder.clearEnvelope()
    }
    /**
     * <pre>
     * Message envelope
     * </pre>
     *
     * <code>.qaul.net.messaging.Envelope envelope = 2;</code>
     * @return Whether the envelope field is set.
     */
    fun hasEnvelope(): kotlin.Boolean {
      return _builder.hasEnvelope()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.messaging.MessagingOuterClass.Container.copy(block: qaul.net.messaging.ContainerKt.Dsl.() -> kotlin.Unit): qaul.net.messaging.MessagingOuterClass.Container =
  qaul.net.messaging.ContainerKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val qaul.net.messaging.MessagingOuterClass.ContainerOrBuilder.envelopeOrNull: qaul.net.messaging.MessagingOuterClass.Envelope?
  get() = if (hasEnvelope()) getEnvelope() else null

