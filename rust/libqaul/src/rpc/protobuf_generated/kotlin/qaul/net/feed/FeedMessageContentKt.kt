//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: services/feed/feed_net.proto

package qaul.net.feed;

@kotlin.jvm.JvmName("-initializefeedMessageContent")
inline fun feedMessageContent(block: qaul.net.feed.FeedMessageContentKt.Dsl.() -> kotlin.Unit): qaul.net.feed.FeedNet.FeedMessageContent =
  qaul.net.feed.FeedMessageContentKt.Dsl._create(qaul.net.feed.FeedNet.FeedMessageContent.newBuilder()).apply { block() }._build()
object FeedMessageContentKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: qaul.net.feed.FeedNet.FeedMessageContent.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: qaul.net.feed.FeedNet.FeedMessageContent.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): qaul.net.feed.FeedNet.FeedMessageContent = _builder.build()

    /**
     * <pre>
     * sender id
     * </pre>
     *
     * <code>bytes sender = 1;</code>
     */
    var sender: com.google.protobuf.ByteString
      @JvmName("getSender")
      get() = _builder.getSender()
      @JvmName("setSender")
      set(value) {
        _builder.setSender(value)
      }
    /**
     * <pre>
     * sender id
     * </pre>
     *
     * <code>bytes sender = 1;</code>
     */
    fun clearSender() {
      _builder.clearSender()
    }

    /**
     * <pre>
     * message content
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    var content: kotlin.String
      @JvmName("getContent")
      get() = _builder.getContent()
      @JvmName("setContent")
      set(value) {
        _builder.setContent(value)
      }
    /**
     * <pre>
     * message content
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    fun clearContent() {
      _builder.clearContent()
    }

    /**
     * <pre>
     * timestamp in milli seconds
     * </pre>
     *
     * <code>uint64 time = 3;</code>
     */
    var time: kotlin.Long
      @JvmName("getTime")
      get() = _builder.getTime()
      @JvmName("setTime")
      set(value) {
        _builder.setTime(value)
      }
    /**
     * <pre>
     * timestamp in milli seconds
     * </pre>
     *
     * <code>uint64 time = 3;</code>
     */
    fun clearTime() {
      _builder.clearTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun qaul.net.feed.FeedNet.FeedMessageContent.copy(block: qaul.net.feed.FeedMessageContentKt.Dsl.() -> kotlin.Unit): qaul.net.feed.FeedNet.FeedMessageContent =
  qaul.net.feed.FeedMessageContentKt.Dsl._create(this.toBuilder()).apply { block() }._build()

