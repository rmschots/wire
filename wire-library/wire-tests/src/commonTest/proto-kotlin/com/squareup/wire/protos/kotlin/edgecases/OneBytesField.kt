// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.edgecases.OneBytesField in edge_cases.proto
package com.squareup.wire.protos.kotlin.edgecases

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
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
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

public class OneBytesField(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public val opt_bytes: ByteString? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<OneBytesField, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  public override fun newBuilder(): Nothing = throw AssertionError()

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OneBytesField) return false
    if (unknownFields != other.unknownFields) return false
    if (opt_bytes != other.opt_bytes) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + opt_bytes.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (opt_bytes != null) result += """opt_bytes=$opt_bytes"""
    return result.joinToString(prefix = "OneBytesField{", separator = ", ", postfix = "}")
  }

  public fun copy(opt_bytes: ByteString? = this.opt_bytes, unknownFields: ByteString =
      this.unknownFields): OneBytesField = OneBytesField(opt_bytes, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OneBytesField> = object : ProtoAdapter<OneBytesField>(
      FieldEncoding.LENGTH_DELIMITED, 
      OneBytesField::class, 
      "type.googleapis.com/squareup.protos.kotlin.edgecases.OneBytesField", 
      PROTO_2, 
      null
    ) {
      public override fun encodedSize(value: OneBytesField): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.opt_bytes)
        return size
      }

      public override fun encode(writer: ProtoWriter, value: OneBytesField): Unit {
        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.opt_bytes)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): OneBytesField {
        var opt_bytes: ByteString? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> opt_bytes = ProtoAdapter.BYTES.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OneBytesField(
          opt_bytes = opt_bytes,
          unknownFields = unknownFields
        )
      }

      public override fun redact(value: OneBytesField): OneBytesField = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
