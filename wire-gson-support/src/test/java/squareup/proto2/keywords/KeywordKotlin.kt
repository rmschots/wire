// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto2.keywords.KeywordKotlin in keyword_kotlin.proto
package squareup.proto2.keywords

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireEnumConstant
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.missingRequiredFields
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.lazy
import okio.ByteString

public class KeywordKotlin(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    declaredName = "object",
    schemaIndex = 0,
  )
  @JvmField
  public val object_: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.REQUIRED,
    declaredName = "when",
    schemaIndex = 1,
  )
  @JvmField
  public val when_: Int,
  fun_: Map<String, String> = emptyMap(),
  return_: List<Boolean> = emptyList(),
  enums: List<KeywordKotlinEnum> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<KeywordKotlin, KeywordKotlin.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 3,
    keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    declaredName = "fun",
    schemaIndex = 2,
  )
  @JvmField
  public val fun_: Map<String, String> = immutableCopyOf("fun_", fun_)

  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.REPEATED,
    declaredName = "return",
    schemaIndex = 3,
  )
  @JvmField
  public val return_: List<Boolean> = immutableCopyOf("return_", return_)

  @field:WireField(
    tag = 5,
    adapter = "squareup.proto2.keywords.KeywordKotlin${'$'}KeywordKotlinEnum#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 4,
  )
  @JvmField
  public val enums: List<KeywordKotlinEnum> = immutableCopyOf("enums", enums)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.object_ = object_
    builder.when_ = when_
    builder.fun_ = fun_
    builder.return_ = return_
    builder.enums = enums
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is KeywordKotlin) return false
    if (unknownFields != other.unknownFields) return false
    if (object_ != other.object_) return false
    if (when_ != other.when_) return false
    if (fun_ != other.fun_) return false
    if (return_ != other.return_) return false
    if (enums != other.enums) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (object_?.hashCode() ?: 0)
      result = result * 37 + when_.hashCode()
      result = result * 37 + fun_.hashCode()
      result = result * 37 + return_.hashCode()
      result = result * 37 + enums.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (object_ != null) result += """object_=${sanitize(object_)}"""
    result += """when_=$when_"""
    if (fun_.isNotEmpty()) result += """fun_=$fun_"""
    if (return_.isNotEmpty()) result += """return_=$return_"""
    if (enums.isNotEmpty()) result += """enums=$enums"""
    return result.joinToString(prefix = "KeywordKotlin{", separator = ", ", postfix = "}")
  }

  public fun copy(
    object_: String? = this.object_,
    when_: Int = this.when_,
    fun_: Map<String, String> = this.fun_,
    return_: List<Boolean> = this.return_,
    enums: List<KeywordKotlinEnum> = this.enums,
    unknownFields: ByteString = this.unknownFields,
  ): KeywordKotlin = KeywordKotlin(object_, when_, fun_, return_, enums, unknownFields)

  public class Builder : Message.Builder<KeywordKotlin, Builder>() {
    @JvmField
    public var object_: String? = null

    @JvmField
    public var when_: Int? = null

    @JvmField
    public var fun_: Map<String, String> = emptyMap()

    @JvmField
    public var return_: List<Boolean> = emptyList()

    @JvmField
    public var enums: List<KeywordKotlinEnum> = emptyList()

    public fun object_(object_: String?): Builder {
      this.object_ = object_
      return this
    }

    public fun when_(when_: Int): Builder {
      this.when_ = when_
      return this
    }

    public fun fun_(fun_: Map<String, String>): Builder {
      this.fun_ = fun_
      return this
    }

    public fun return_(return_: List<Boolean>): Builder {
      checkElementsNotNull(return_)
      this.return_ = return_
      return this
    }

    public fun enums(enums: List<KeywordKotlinEnum>): Builder {
      checkElementsNotNull(enums)
      this.enums = enums
      return this
    }

    override fun build(): KeywordKotlin = KeywordKotlin(
      object_ = object_,
      when_ = when_ ?: throw missingRequiredFields(when_, "when_"),
      fun_ = fun_,
      return_ = return_,
      enums = enums,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<KeywordKotlin> = object : ProtoAdapter<KeywordKotlin>(
      FieldEncoding.LENGTH_DELIMITED, 
      KeywordKotlin::class, 
      "type.googleapis.com/squareup.proto2.keywords.KeywordKotlin", 
      PROTO_2, 
      null, 
      "keyword_kotlin.proto"
    ) {
      private val funAdapter: ProtoAdapter<Map<String, String>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING) }

      override fun encodedSize(`value`: KeywordKotlin): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.object_)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.when_)
        size += funAdapter.encodedSizeWithTag(3, value.fun_)
        size += ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(4, value.return_)
        size += KeywordKotlinEnum.ADAPTER.asRepeated().encodedSizeWithTag(5, value.enums)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: KeywordKotlin) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.object_)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.when_)
        funAdapter.encodeWithTag(writer, 3, value.fun_)
        ProtoAdapter.BOOL.asRepeated().encodeWithTag(writer, 4, value.return_)
        KeywordKotlinEnum.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.enums)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: KeywordKotlin) {
        writer.writeBytes(value.unknownFields)
        KeywordKotlinEnum.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.enums)
        ProtoAdapter.BOOL.asRepeated().encodeWithTag(writer, 4, value.return_)
        funAdapter.encodeWithTag(writer, 3, value.fun_)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.when_)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.object_)
      }

      override fun decode(reader: ProtoReader): KeywordKotlin {
        var object_: String? = null
        var when_: Int? = null
        val fun_ = mutableMapOf<String, String>()
        val return_ = mutableListOf<Boolean>()
        val enums = mutableListOf<KeywordKotlinEnum>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> object_ = ProtoAdapter.STRING.decode(reader)
            2 -> when_ = ProtoAdapter.INT32.decode(reader)
            3 -> fun_.putAll(funAdapter.decode(reader))
            4 -> return_.add(ProtoAdapter.BOOL.decode(reader))
            5 -> try {
              KeywordKotlinEnum.ADAPTER.tryDecode(reader, enums)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return KeywordKotlin(
          object_ = object_,
          when_ = when_ ?: throw missingRequiredFields(when_, "when"),
          fun_ = fun_,
          return_ = return_,
          enums = enums,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: KeywordKotlin): KeywordKotlin = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    public inline fun build(body: Builder.() -> Unit): KeywordKotlin = Builder().apply(body).build()
  }

  public enum class KeywordKotlinEnum(
    override val `value`: Int,
  ) : WireEnum {
    @WireEnumConstant(declaredName = "object")
    object_(0),
    @WireEnumConstant(declaredName = "when")
    when_(1),
    @WireEnumConstant(declaredName = "fun")
    fun_(2),
    @WireEnumConstant(declaredName = "return")
    return_(3),
    @WireEnumConstant(declaredName = "open")
    open_(4),
    @WireEnumConstant(declaredName = "name")
    name_(5),
    @WireEnumConstant(declaredName = "ordinal")
    ordinal_(6),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<KeywordKotlinEnum> = object : EnumAdapter<KeywordKotlinEnum>(
        KeywordKotlinEnum::class, 
        PROTO_2, 
        KeywordKotlinEnum.object_
      ) {
        override fun fromValue(`value`: Int): KeywordKotlinEnum? =
            KeywordKotlinEnum.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): KeywordKotlinEnum? = when (value) {
        0 -> object_
        1 -> when_
        2 -> fun_
        3 -> return_
        4 -> open_
        5 -> name_
        6 -> ordinal_
        else -> null
      }
    }
  }
}
