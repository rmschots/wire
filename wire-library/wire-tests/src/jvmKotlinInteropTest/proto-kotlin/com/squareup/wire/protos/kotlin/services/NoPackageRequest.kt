// Code generated by Wire protocol buffer compiler, do not edit.
// Source: NoPackageRequest in service_without_package.proto
package com.squareup.wire.protos.kotlin.services

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmField
import okio.ByteString

public class NoPackageRequest(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NoPackageRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NoPackageRequest) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  public override fun hashCode(): Int = unknownFields.hashCode()

  public override fun toString(): String = "NoPackageRequest{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): NoPackageRequest =
      NoPackageRequest(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NoPackageRequest> = object : ProtoAdapter<NoPackageRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      NoPackageRequest::class, 
      "type.googleapis.com/NoPackageRequest", 
      PROTO_2, 
      null, 
      "service_without_package.proto"
    ) {
      public override fun encodedSize(`value`: NoPackageRequest): Int {
        var size = value.unknownFields.size
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: NoPackageRequest): Unit {
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: NoPackageRequest): Unit {
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): NoPackageRequest {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return NoPackageRequest(
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: NoPackageRequest): NoPackageRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
