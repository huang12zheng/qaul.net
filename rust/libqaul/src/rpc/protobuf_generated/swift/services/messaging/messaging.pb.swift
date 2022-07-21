// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: services/messaging/messaging.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// qaul network messaging service
///
/// is responsible to distribute messages to users
/// the container contains the entire message with signature
struct Qaul_Net_Messaging_Container {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// signed by sending user
  var signature: Data = Data()

  /// Message envelope
  var envelope: Qaul_Net_Messaging_Envelope {
    get {return _envelope ?? Qaul_Net_Messaging_Envelope()}
    set {_envelope = newValue}
  }
  /// Returns true if `envelope` has been explicitly set.
  var hasEnvelope: Bool {return self._envelope != nil}
  /// Clears the value of `envelope`. Subsequent reads from it will return its default value.
  mutating func clearEnvelope() {self._envelope = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _envelope: Qaul_Net_Messaging_Envelope? = nil
}

/// message envelop with sender and receiver
struct Qaul_Net_Messaging_Envelope {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the qaul ID of the sender
  var senderID: Data = Data()

  /// the qaul ID of the receiver
  var receiverID: Data = Data()

  /// encrypted message data
  var data: [Qaul_Net_Messaging_Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// encrypted message data
struct Qaul_Net_Messaging_Data {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// message nonce for encryption
  var nonce: UInt64 = 0

  /// the encrypted message data
  var data: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// messaging unified message
struct Qaul_Net_Messaging_Messaging {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var message: Qaul_Net_Messaging_Messaging.OneOf_Message? = nil

  var confirmationMessage: Qaul_Net_Messaging_Confirmation {
    get {
      if case .confirmationMessage(let v)? = message {return v}
      return Qaul_Net_Messaging_Confirmation()
    }
    set {message = .confirmationMessage(newValue)}
  }

  var cryptoService: Qaul_Net_Messaging_CryptoService {
    get {
      if case .cryptoService(let v)? = message {return v}
      return Qaul_Net_Messaging_CryptoService()
    }
    set {message = .cryptoService(newValue)}
  }

  var chatMessage: Qaul_Net_Messaging_ChatMessage {
    get {
      if case .chatMessage(let v)? = message {return v}
      return Qaul_Net_Messaging_ChatMessage()
    }
    set {message = .chatMessage(newValue)}
  }

  var fileMessage: Qaul_Net_Messaging_FileMessage {
    get {
      if case .fileMessage(let v)? = message {return v}
      return Qaul_Net_Messaging_FileMessage()
    }
    set {message = .fileMessage(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  enum OneOf_Message: Equatable {
    case confirmationMessage(Qaul_Net_Messaging_Confirmation)
    case cryptoService(Qaul_Net_Messaging_CryptoService)
    case chatMessage(Qaul_Net_Messaging_ChatMessage)
    case fileMessage(Qaul_Net_Messaging_FileMessage)

  #if !swift(>=4.1)
    static func ==(lhs: Qaul_Net_Messaging_Messaging.OneOf_Message, rhs: Qaul_Net_Messaging_Messaging.OneOf_Message) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.confirmationMessage, .confirmationMessage): return {
        guard case .confirmationMessage(let l) = lhs, case .confirmationMessage(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.cryptoService, .cryptoService): return {
        guard case .cryptoService(let l) = lhs, case .cryptoService(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.chatMessage, .chatMessage): return {
        guard case .chatMessage(let l) = lhs, case .chatMessage(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.fileMessage, .fileMessage): return {
        guard case .fileMessage(let l) = lhs, case .fileMessage(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  init() {}
}

/// Crypto Service Message
///
/// This message is for crypto specific tasks,
/// such as completing a handshake.
struct Qaul_Net_Messaging_CryptoService {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// message received confirmation
/// 
/// every message that was received by a user
/// sends an acknowledgment package, to the sender
/// to confirm the receive.
struct Qaul_Net_Messaging_Confirmation {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// message ID
  var messageID: Data = Data()

  /// receveived at timestamp
  var receivedAt: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// chat message
struct Qaul_Net_Messaging_ChatMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// group chat
  var group: Bool = false

  /// conversation id 
  /// (only for group chat messages)
  var conversationID: Data = Data()

  /// sent timestamp
  var sentAt: UInt64 = 0

  /// message
  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// chat message
struct Qaul_Net_Messaging_FileMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "qaul.net.messaging"

extension Qaul_Net_Messaging_Container: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Container"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "signature"),
    2: .same(proto: "envelope"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.signature) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._envelope) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.signature.isEmpty {
      try visitor.visitSingularBytesField(value: self.signature, fieldNumber: 1)
    }
    try { if let v = self._envelope {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_Container, rhs: Qaul_Net_Messaging_Container) -> Bool {
    if lhs.signature != rhs.signature {return false}
    if lhs._envelope != rhs._envelope {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_Envelope: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Envelope"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "sender_id"),
    2: .standard(proto: "receiver_id"),
    3: .same(proto: "data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.senderID) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.receiverID) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.data) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.senderID.isEmpty {
      try visitor.visitSingularBytesField(value: self.senderID, fieldNumber: 1)
    }
    if !self.receiverID.isEmpty {
      try visitor.visitSingularBytesField(value: self.receiverID, fieldNumber: 2)
    }
    if !self.data.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.data, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_Envelope, rhs: Qaul_Net_Messaging_Envelope) -> Bool {
    if lhs.senderID != rhs.senderID {return false}
    if lhs.receiverID != rhs.receiverID {return false}
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_Data: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Data"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "nonce"),
    2: .same(proto: "data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.nonce) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.data) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.nonce != 0 {
      try visitor.visitSingularUInt64Field(value: self.nonce, fieldNumber: 1)
    }
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_Data, rhs: Qaul_Net_Messaging_Data) -> Bool {
    if lhs.nonce != rhs.nonce {return false}
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_Messaging: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Messaging"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "confirmation_message"),
    2: .standard(proto: "crypto_service"),
    3: .standard(proto: "chat_message"),
    4: .standard(proto: "file_message"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try {
        var v: Qaul_Net_Messaging_Confirmation?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .confirmationMessage(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .confirmationMessage(v)
        }
      }()
      case 2: try {
        var v: Qaul_Net_Messaging_CryptoService?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .cryptoService(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .cryptoService(v)
        }
      }()
      case 3: try {
        var v: Qaul_Net_Messaging_ChatMessage?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .chatMessage(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .chatMessage(v)
        }
      }()
      case 4: try {
        var v: Qaul_Net_Messaging_FileMessage?
        var hadOneofValue = false
        if let current = self.message {
          hadOneofValue = true
          if case .fileMessage(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.message = .fileMessage(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    switch self.message {
    case .confirmationMessage?: try {
      guard case .confirmationMessage(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }()
    case .cryptoService?: try {
      guard case .cryptoService(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }()
    case .chatMessage?: try {
      guard case .chatMessage(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }()
    case .fileMessage?: try {
      guard case .fileMessage(let v)? = self.message else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_Messaging, rhs: Qaul_Net_Messaging_Messaging) -> Bool {
    if lhs.message != rhs.message {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_CryptoService: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CryptoService"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_CryptoService, rhs: Qaul_Net_Messaging_CryptoService) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_Confirmation: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Confirmation"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "message_id"),
    2: .standard(proto: "received_at"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.messageID) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.receivedAt) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.messageID.isEmpty {
      try visitor.visitSingularBytesField(value: self.messageID, fieldNumber: 1)
    }
    if self.receivedAt != 0 {
      try visitor.visitSingularUInt64Field(value: self.receivedAt, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_Confirmation, rhs: Qaul_Net_Messaging_Confirmation) -> Bool {
    if lhs.messageID != rhs.messageID {return false}
    if lhs.receivedAt != rhs.receivedAt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_ChatMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ChatMessage"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "group"),
    2: .standard(proto: "conversation_id"),
    3: .standard(proto: "sent_at"),
    4: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.group) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.conversationID) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.sentAt) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.content) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.group != false {
      try visitor.visitSingularBoolField(value: self.group, fieldNumber: 1)
    }
    if !self.conversationID.isEmpty {
      try visitor.visitSingularBytesField(value: self.conversationID, fieldNumber: 2)
    }
    if self.sentAt != 0 {
      try visitor.visitSingularUInt64Field(value: self.sentAt, fieldNumber: 3)
    }
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_ChatMessage, rhs: Qaul_Net_Messaging_ChatMessage) -> Bool {
    if lhs.group != rhs.group {return false}
    if lhs.conversationID != rhs.conversationID {return false}
    if lhs.sentAt != rhs.sentAt {return false}
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Qaul_Net_Messaging_FileMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FileMessage"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.content) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularBytesField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Qaul_Net_Messaging_FileMessage, rhs: Qaul_Net_Messaging_FileMessage) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
