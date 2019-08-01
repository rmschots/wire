// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: optional_enum.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

class OptionalEnumUser(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.protos.kotlin.OptionalEnumUser${'$'}OptionalEnum#ADAPTER"
  )
  val optional_enum: OptionalEnum? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<OptionalEnumUser, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing {
    throw AssertionError()
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OptionalEnumUser) return false
    return unknownFields == other.unknownFields
        && optional_enum == other.optional_enum
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = optional_enum.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (optional_enum != null) result += """optional_enum=$optional_enum"""
    return result.joinToString(prefix = "OptionalEnumUser{", separator = ", ", postfix = "}")
  }

  fun copy(optional_enum: OptionalEnum? = this.optional_enum, unknownFields: ByteString =
      this.unknownFields): OptionalEnumUser = OptionalEnumUser(optional_enum, unknownFields)

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<OptionalEnumUser> = object : ProtoAdapter<OptionalEnumUser>(
      FieldEncoding.LENGTH_DELIMITED, 
      OptionalEnumUser::class
    ) {
      override fun encodedSize(value: OptionalEnumUser): Int = 
        OptionalEnum.ADAPTER.encodedSizeWithTag(1, value.optional_enum) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: OptionalEnumUser) {
        OptionalEnum.ADAPTER.encodeWithTag(writer, 1, value.optional_enum)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): OptionalEnumUser {
        var optional_enum: OptionalEnum? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> optional_enum = OptionalEnum.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OptionalEnumUser(
          optional_enum = optional_enum,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: OptionalEnumUser): OptionalEnumUser = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }

  enum class OptionalEnum(
    override val value: Int
  ) : WireEnum {
    FOO(1),

    BAR(2);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<OptionalEnum> = object : EnumAdapter<OptionalEnum>(
        OptionalEnum::class
      ) {
        override fun fromValue(value: Int): OptionalEnum = OptionalEnum.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): OptionalEnum = when (value) {
        1 -> FOO
        2 -> BAR
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }
}
