// Code generated by Wire protocol buffer compiler, do not edit.
// Source: com.squareup.wire.protos.kotlin.repeated.Thing in repeated.proto
package com.squareup.wire.protos.kotlin.repeated

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

public class Thing(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  public val name: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<Thing, Thing.Builder>(ADAPTER, unknownFields) {
  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Thing) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    return result.joinToString(prefix = "Thing{", separator = ", ", postfix = "}")
  }

  public fun copy(name: String? = this.name, unknownFields: ByteString = this.unknownFields): Thing
      = Thing(name, unknownFields)

  public class Builder : Message.Builder<Thing, Builder>() {
    @JvmField
    public var name: String? = null

    public fun name(name: String?): Builder {
      this.name = name
      return this
    }

    public override fun build(): Thing = Thing(
      name = name,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Thing> = object : ProtoAdapter<Thing>(
      FieldEncoding.LENGTH_DELIMITED, 
      Thing::class, 
      "type.googleapis.com/com.squareup.wire.protos.kotlin.repeated.Thing", 
      PROTO_2, 
      null
    ) {
      public override fun encodedSize(value: Thing): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        return size
      }

      public override fun encode(writer: ProtoWriter, value: Thing): Unit {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): Thing {
        var name: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Thing(
          name = name,
          unknownFields = unknownFields
        )
      }

      public override fun redact(value: Thing): Thing = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
