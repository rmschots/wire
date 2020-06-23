// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: packed_encoding.proto
import Foundation
import Wire

public struct OuterMessage : Equatable, Proto2Codable, Codable {

    public var outer_number_before: Int32?
    public var embedded_message: EmbeddedMessage?
    public let unknownFields: Data

    public init(outer_number_before: Int32? = nil, embedded_message: EmbeddedMessage? = nil) {
        self.outer_number_before = outer_number_before
        self.embedded_message = embedded_message
        self.unknownFields = .init()
    }

    public init(from reader: ProtoReader) throws {
        var outer_number_before: Int32? = nil
        var embedded_message: EmbeddedMessage? = nil

        let unknownFields = try reader.forEachTag { tag in
            switch tag {
                case 1: outer_number_before = try reader.decode(Int32.self)
                case 2: embedded_message = try reader.decode(EmbeddedMessage.self)
                default: try reader.readUnknownField(tag: tag)
            }
        }

        self.outer_number_before = outer_number_before
        self.embedded_message = embedded_message
        self.unknownFields = unknownFields
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: outer_number_before)
        try writer.encode(tag: 2, value: embedded_message)
        try writer.writeUnknownFields(unknownFields)
    }

}
