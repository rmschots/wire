// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.wire.boxedoneof.BoxedOneOfs in squareup/wire/boxed_oneof.proto
package squareup.wire.boxedoneof

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.OneOf
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.Set
import okio.ByteString

public class BoxedOneOfs(
  @JvmField
  public val value_: OneOf<Value<*>, *>? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<BoxedOneOfs, BoxedOneOfs.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.value_ = value_
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is BoxedOneOfs) return false
    if (unknownFields != other.unknownFields) return false
    if (value_ != other.value_) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (value_?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (value_ != null) result += """value_=$value_"""
    return result.joinToString(prefix = "BoxedOneOfs{", separator = ", ", postfix = "}")
  }

  public fun copy(value_: OneOf<Value<*>, *>? = this.value_, unknownFields: ByteString =
      this.unknownFields): BoxedOneOfs = BoxedOneOfs(value_, unknownFields)

  public class Builder : Message.Builder<BoxedOneOfs, Builder>() {
    @JvmField
    public var value_: OneOf<Value<*>, *>? = null

    public fun value_(value_: OneOf<Value<*>, *>?): Builder {
      this.value_ = value_
      return this
    }

    override fun build(): BoxedOneOfs = BoxedOneOfs(
      value_ = value_,
      unknownFields = buildUnknownFields()
    )
  }

  public class Value<T>(
    tag: Int,
    adapter: ProtoAdapter<T>,
    declaredName: String,
  ) : OneOf.Key<T>(tag, adapter, declaredName) {
    public fun create(`value`: T): OneOf<Value<T>, T> = OneOf(this, value)

    public fun decode(reader: ProtoReader): OneOf<Value<T>, T> = create(adapter.decode(reader))
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<BoxedOneOfs> = object : ProtoAdapter<BoxedOneOfs>(
      FieldEncoding.LENGTH_DELIMITED, 
      BoxedOneOfs::class, 
      "type.googleapis.com/squareup.wire.boxedoneof.BoxedOneOfs", 
      PROTO_2, 
      null, 
      "squareup/wire/boxed_oneof.proto"
    ) {
      override fun encodedSize(`value`: BoxedOneOfs): Int {
        var size = value.unknownFields.size
        if (value.value_ != null) size += value.value_.encodedSizeWithTag()
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: BoxedOneOfs) {
        if (value.value_ != null) value.value_.encodeWithTag(writer)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: BoxedOneOfs) {
        writer.writeBytes(value.unknownFields)
        if (value.value_ != null) value.value_.encodeWithTag(writer)
      }

      override fun decode(reader: ProtoReader): BoxedOneOfs {
        var value_: OneOf<Value<*>, *>? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            else -> {
              for (choiceKey in VALUE__KEYS) {
                if (tag == choiceKey.tag) {
                  value_ = choiceKey.decode(reader)
                  return@forEachTag Unit
                }
              }
              reader.readUnknownField(tag)
            }
          }
        }
        return BoxedOneOfs(
          value_ = value_,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: BoxedOneOfs): BoxedOneOfs = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    public val VALUE_FIRST_VALUE: Value<String> = Value<String>(tag = 1, adapter =
        ProtoAdapter.STRING, declaredName = "first_value")

    public val VALUE_SECOND_VALUE: Value<String> = Value<String>(tag = 2, adapter =
        ProtoAdapter.STRING, declaredName = "second_value")

    public val VALUE_VALUE: Value<String> = Value<String>(tag = 3, adapter = ProtoAdapter.STRING,
        declaredName = "value")

    @JvmStatic
    public val VALUE__KEYS: Set<Value<*>> = setOf(VALUE_FIRST_VALUE, VALUE_SECOND_VALUE,
        VALUE_VALUE)

    private const val serialVersionUID: Long = 0L

    public inline fun build(body: Builder.() -> Unit): BoxedOneOfs = Builder().apply(body).build()
  }
}
