// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.usesany.UsesAny in uses_any.proto
package com.squareup.wire.protos.usesany

import com.squareup.wire.AnyMessage
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.redactElements
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmField
import okio.ByteString

public class UsesAny(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.AnyMessage#ADAPTER",
  )
  @JvmField
  public val just_one: AnyMessage? = null,
  many_anys: List<AnyMessage> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<UsesAny, UsesAny.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.AnyMessage#ADAPTER",
    label = WireField.Label.REPEATED,
  )
  @JvmField
  public val many_anys: List<AnyMessage> = immutableCopyOf("many_anys", many_anys)

  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.just_one = just_one
    builder.many_anys = many_anys
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is UsesAny) return false
    if (unknownFields != other.unknownFields) return false
    if (just_one != other.just_one) return false
    if (many_anys != other.many_anys) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (just_one?.hashCode() ?: 0)
      result = result * 37 + many_anys.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (just_one != null) result += """just_one=$just_one"""
    if (many_anys.isNotEmpty()) result += """many_anys=$many_anys"""
    return result.joinToString(prefix = "UsesAny{", separator = ", ", postfix = "}")
  }

  public fun copy(
    just_one: AnyMessage? = this.just_one,
    many_anys: List<AnyMessage> = this.many_anys,
    unknownFields: ByteString = this.unknownFields,
  ): UsesAny = UsesAny(just_one, many_anys, unknownFields)

  public class Builder : Message.Builder<UsesAny, Builder>() {
    @JvmField
    public var just_one: AnyMessage? = null

    @JvmField
    public var many_anys: List<AnyMessage> = emptyList()

    public fun just_one(just_one: AnyMessage?): Builder {
      this.just_one = just_one
      return this
    }

    public fun many_anys(many_anys: List<AnyMessage>): Builder {
      checkElementsNotNull(many_anys)
      this.many_anys = many_anys
      return this
    }

    public override fun build(): UsesAny = UsesAny(
      just_one = just_one,
      many_anys = many_anys,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<UsesAny> = object : ProtoAdapter<UsesAny>(
      FieldEncoding.LENGTH_DELIMITED, 
      UsesAny::class, 
      "type.googleapis.com/squareup.protos.usesany.UsesAny", 
      PROTO_2, 
      null, 
      "uses_any.proto"
    ) {
      public override fun encodedSize(`value`: UsesAny): Int {
        var size = value.unknownFields.size
        size += AnyMessage.ADAPTER.encodedSizeWithTag(1, value.just_one)
        size += AnyMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, value.many_anys)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: UsesAny): Unit {
        AnyMessage.ADAPTER.encodeWithTag(writer, 1, value.just_one)
        AnyMessage.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.many_anys)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: UsesAny): Unit {
        writer.writeBytes(value.unknownFields)
        AnyMessage.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.many_anys)
        AnyMessage.ADAPTER.encodeWithTag(writer, 1, value.just_one)
      }

      public override fun decode(reader: ProtoReader): UsesAny {
        var just_one: AnyMessage? = null
        val many_anys = mutableListOf<AnyMessage>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> just_one = AnyMessage.ADAPTER.decode(reader)
            2 -> many_anys.add(AnyMessage.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return UsesAny(
          just_one = just_one,
          many_anys = many_anys,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: UsesAny): UsesAny = value.copy(
        just_one = value.just_one?.let(AnyMessage.ADAPTER::redact),
        many_anys = value.many_anys.redactElements(AnyMessage.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
