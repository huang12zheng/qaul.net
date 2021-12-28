//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/feed/feed.proto

package qaul.rpc.feed;

@kotlin.jvm.JvmSynthetic
inline fun feedMessage(block: qaul.rpc.feed.FeedMessageKt.Dsl.() -> Unit): qaul.rpc.feed.FeedOuterClass.FeedMessage =
  qaul.rpc.feed.FeedMessageKt.Dsl._create(qaul.rpc.feed.FeedOuterClass.FeedMessage.newBuilder()).apply { block() }._build()
object FeedMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: qaul.rpc.feed.FeedOuterClass.FeedMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.rpc.feed.FeedOuterClass.FeedMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.rpc.feed.FeedOuterClass.FeedMessage = _builder.build()

    /**
     * <code>bytes sender_id = 1;</code>
     */
    var senderId: com.google.protobuf.ByteString
      @JvmName("getSenderId")
      get() = _builder.getSenderId()
      @JvmName("setSenderId")
      set(value) {
        _builder.setSenderId(value)
      }
    /**
     * <code>bytes sender_id = 1;</code>
     */
    fun clearSenderId() {
      _builder.clearSenderId()
    }

    /**
     * <pre>
     * DEPRECATED
     * </pre>
     *
     * <code>string sender_id_base58 = 2;</code>
     */
    var senderIdBase58: kotlin.String
      @JvmName("getSenderIdBase58")
      get() = _builder.getSenderIdBase58()
      @JvmName("setSenderIdBase58")
      set(value) {
        _builder.setSenderIdBase58(value)
      }
    /**
     * <pre>
     * DEPRECATED
     * </pre>
     *
     * <code>string sender_id_base58 = 2;</code>
     */
    fun clearSenderIdBase58() {
      _builder.clearSenderIdBase58()
    }

    /**
     * <code>bytes message_id = 3;</code>
     */
    var messageId: com.google.protobuf.ByteString
      @JvmName("getMessageId")
      get() = _builder.getMessageId()
      @JvmName("setMessageId")
      set(value) {
        _builder.setMessageId(value)
      }
    /**
     * <code>bytes message_id = 3;</code>
     */
    fun clearMessageId() {
      _builder.clearMessageId()
    }

    /**
     * <pre>
     * DEPRECATED
     * </pre>
     *
     * <code>string message_id_base58 = 4;</code>
     */
    var messageIdBase58: kotlin.String
      @JvmName("getMessageIdBase58")
      get() = _builder.getMessageIdBase58()
      @JvmName("setMessageIdBase58")
      set(value) {
        _builder.setMessageIdBase58(value)
      }
    /**
     * <pre>
     * DEPRECATED
     * </pre>
     *
     * <code>string message_id_base58 = 4;</code>
     */
    fun clearMessageIdBase58() {
      _builder.clearMessageIdBase58()
    }

    /**
     * <code>string time_sent = 5;</code>
     */
    var timeSent: kotlin.String
      @JvmName("getTimeSent")
      get() = _builder.getTimeSent()
      @JvmName("setTimeSent")
      set(value) {
        _builder.setTimeSent(value)
      }
    /**
     * <code>string time_sent = 5;</code>
     */
    fun clearTimeSent() {
      _builder.clearTimeSent()
    }

    /**
     * <code>string time_received = 6;</code>
     */
    var timeReceived: kotlin.String
      @JvmName("getTimeReceived")
      get() = _builder.getTimeReceived()
      @JvmName("setTimeReceived")
      set(value) {
        _builder.setTimeReceived(value)
      }
    /**
     * <code>string time_received = 6;</code>
     */
    fun clearTimeReceived() {
      _builder.clearTimeReceived()
    }

    /**
     * <code>string content = 7;</code>
     */
    var content: kotlin.String
      @JvmName("getContent")
      get() = _builder.getContent()
      @JvmName("setContent")
      set(value) {
        _builder.setContent(value)
      }
    /**
     * <code>string content = 7;</code>
     */
    fun clearContent() {
      _builder.clearContent()
    }

    /**
     * <code>uint64 index = 8;</code>
     */
    var index: kotlin.Long
      @JvmName("getIndex")
      get() = _builder.getIndex()
      @JvmName("setIndex")
      set(value) {
        _builder.setIndex(value)
      }
    /**
     * <code>uint64 index = 8;</code>
     */
    fun clearIndex() {
      _builder.clearIndex()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.rpc.feed.FeedOuterClass.FeedMessage.copy(block: qaul.rpc.feed.FeedMessageKt.Dsl.() -> Unit): qaul.rpc.feed.FeedOuterClass.FeedMessage =
  qaul.rpc.feed.FeedMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()
