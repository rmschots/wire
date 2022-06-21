// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.Form in form.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.OneOf
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
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
import kotlin.collections.Set
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

public class Form(
  public val choice: OneOf<Choice<*>, *>? = null,
  public val decision: OneOf<Decision<*>, *>? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Form, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Form) return false
    if (unknownFields != other.unknownFields) return false
    if (choice != other.choice) return false
    if (decision != other.decision) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (choice?.hashCode() ?: 0)
      result = result * 37 + (decision?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (choice != null) result += """choice=$choice"""
    if (decision != null) result += """decision=██"""
    return result.joinToString(prefix = "Form{", separator = ", ", postfix = "}")
  }

  public fun copy(
    choice: OneOf<Choice<*>, *>? = this.choice,
    decision: OneOf<Decision<*>, *>? = this.decision,
    unknownFields: ByteString = this.unknownFields,
  ): Form = Form(choice, decision, unknownFields)

  public class Choice<T>(
    tag: Int,
    adapter: ProtoAdapter<T>,
    declaredName: String,
  ) : OneOf.Key<T>(tag, adapter, declaredName) {
    public fun create(`value`: T) = OneOf(this, value)

    public fun decode(reader: ProtoReader): OneOf<Choice<T>, T> = create(adapter.decode(reader))
  }

  public class Decision<T>(
    tag: Int,
    adapter: ProtoAdapter<T>,
    declaredName: String,
  ) : OneOf.Key<T>(tag, adapter, declaredName) {
    public fun create(`value`: T) = OneOf(this, value)

    public fun decode(reader: ProtoReader): OneOf<Decision<T>, T> = create(adapter.decode(reader))
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Form> = object : ProtoAdapter<Form>(
      FieldEncoding.LENGTH_DELIMITED, 
      Form::class, 
      "type.googleapis.com/squareup.protos.kotlin.oneof.Form", 
      PROTO_2, 
      null, 
      "form.proto"
    ) {
      public override fun encodedSize(`value`: Form): Int {
        var size = value.unknownFields.size
        if (value.choice != null) size += value.choice.encodedSizeWithTag()
        if (value.decision != null) size += value.decision.encodedSizeWithTag()
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: Form): Unit {
        if (value.choice != null) value.choice.encodeWithTag(writer)
        if (value.decision != null) value.decision.encodeWithTag(writer)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: Form): Unit {
        writer.writeBytes(value.unknownFields)
        if (value.decision != null) value.decision.encodeWithTag(writer)
        if (value.choice != null) value.choice.encodeWithTag(writer)
      }

      public override fun decode(reader: ProtoReader): Form {
        var choice: OneOf<Choice<*>, *>? = null
        var decision: OneOf<Decision<*>, *>? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            else -> {
              for (choiceKey in CHOICE_KEYS) {
                if (tag == choiceKey.tag) {
                  choice = choiceKey.decode(reader)
                  return@forEachTag Unit
                }
              }
              for (choiceKey in DECISION_KEYS) {
                if (tag == choiceKey.tag) {
                  decision = choiceKey.decode(reader)
                  return@forEachTag Unit
                }
              }
              reader.readUnknownField(tag)
            }
          }
        }
        return Form(
          choice = choice,
          decision = decision,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: Form): Form = value.copy(
        decision = null,
        unknownFields = ByteString.EMPTY
      )
    }

    public val CHOICE_BUTTON_ELEMENT: Choice<ButtonElement> = Choice<ButtonElement>(tag = 1, adapter
        = ButtonElement.ADAPTER, declaredName = "button_element")

    public val CHOICE_LOCAL_IMAGE_ELEMENT: Choice<LocalImageElement> = Choice<LocalImageElement>(tag
        = 2, adapter = LocalImageElement.ADAPTER, declaredName = "local_image_element")

    public val CHOICE_REMOTE_IMAGE_ELEMENT: Choice<RemoteImageElement> =
        Choice<RemoteImageElement>(tag = 3, adapter = RemoteImageElement.ADAPTER, declaredName =
        "remote_image_element")

    public val CHOICE_MONEY_ELEMENT: Choice<MoneyElement> = Choice<MoneyElement>(tag = 4, adapter =
        MoneyElement.ADAPTER, declaredName = "money_element")

    public val CHOICE_SPACER_ELEMENT: Choice<SpacerElement> = Choice<SpacerElement>(tag = 5, adapter
        = SpacerElement.ADAPTER, declaredName = "spacer_element")

    public val CHOICE_TEXT_ELEMENT: Choice<TextElement> = Choice<TextElement>(tag = 6, adapter =
        TextElement.ADAPTER, declaredName = "text_element")

    public val CHOICE_CUSTOMIZED_CARD_ELEMENT: Choice<CustomizedCardElement> =
        Choice<CustomizedCardElement>(tag = 7, adapter = CustomizedCardElement.ADAPTER, declaredName
        = "customized_card_element")

    public val CHOICE_ADDRESS_ELEMENT: Choice<AddressElement> = Choice<AddressElement>(tag = 8,
        adapter = AddressElement.ADAPTER, declaredName = "address_element")

    public val CHOICE_TEXT_INPUT_ELEMENT: Choice<TextInputElement> = Choice<TextInputElement>(tag =
        9, adapter = TextInputElement.ADAPTER, declaredName = "text_input_element")

    @Deprecated(message = "option_picker_element is deprecated")
    public val CHOICE_OPTION_PICKER_ELEMENT: Choice<OptionPickerElement> =
        Choice<OptionPickerElement>(tag = 10, adapter = OptionPickerElement.ADAPTER, declaredName =
        "option_picker_element")

    public val CHOICE_DETAIL_ROW_ELEMENT: Choice<DetailRowElement> = Choice<DetailRowElement>(tag =
        11, adapter = DetailRowElement.ADAPTER, declaredName = "detail_row_element")

    public val CHOICE_CURRENCY_CONVERSION_FLAGS_ELEMENT: Choice<CurrencyConversionFlagsElement> =
        Choice<CurrencyConversionFlagsElement>(tag = 12, adapter =
        CurrencyConversionFlagsElement.ADAPTER, declaredName = "currency_conversion_flags_element")

    @JvmStatic
    public val CHOICE_KEYS: Set<Choice<*>> = setOf(CHOICE_BUTTON_ELEMENT,
        CHOICE_LOCAL_IMAGE_ELEMENT, CHOICE_REMOTE_IMAGE_ELEMENT, CHOICE_MONEY_ELEMENT,
        CHOICE_SPACER_ELEMENT, CHOICE_TEXT_ELEMENT, CHOICE_CUSTOMIZED_CARD_ELEMENT,
        CHOICE_ADDRESS_ELEMENT, CHOICE_TEXT_INPUT_ELEMENT, CHOICE_OPTION_PICKER_ELEMENT,
        CHOICE_DETAIL_ROW_ELEMENT, CHOICE_CURRENCY_CONVERSION_FLAGS_ELEMENT)

    public val DECISION_A: Decision<String> = Decision<String>(tag = 101, adapter =
        ProtoAdapter.STRING, declaredName = "a")

    public val DECISION_B: Decision<String> = Decision<String>(tag = 102, adapter =
        ProtoAdapter.STRING, declaredName = "b")

    public val DECISION_C: Decision<String> = Decision<String>(tag = 103, adapter =
        ProtoAdapter.STRING, declaredName = "c")

    public val DECISION_D: Decision<String> = Decision<String>(tag = 104, adapter =
        ProtoAdapter.STRING, declaredName = "d")

    public val DECISION_E: Decision<String> = Decision<String>(tag = 105, adapter =
        ProtoAdapter.STRING, declaredName = "e")

    public val DECISION_F: Decision<String> = Decision<String>(tag = 106, adapter =
        ProtoAdapter.STRING, declaredName = "f")

    public val DECISION_G: Decision<String> = Decision<String>(tag = 107, adapter =
        ProtoAdapter.STRING, declaredName = "g")

    public val DECISION_H: Decision<String> = Decision<String>(tag = 108, adapter =
        ProtoAdapter.STRING, declaredName = "h")

    @JvmStatic
    public val DECISION_KEYS: Set<Decision<*>> = setOf(DECISION_A, DECISION_B, DECISION_C,
        DECISION_D, DECISION_E, DECISION_F, DECISION_G, DECISION_H)

    private const val serialVersionUID: Long = 0L
  }

  public class ButtonElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<ButtonElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is ButtonElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "ButtonElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): ButtonElement =
        ButtonElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<ButtonElement> = object : ProtoAdapter<ButtonElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        ButtonElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.ButtonElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: ButtonElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: ButtonElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: ButtonElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): ButtonElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return ButtonElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: ButtonElement): ButtonElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class LocalImageElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<LocalImageElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is LocalImageElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "LocalImageElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): LocalImageElement =
        LocalImageElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<LocalImageElement> = object :
          ProtoAdapter<LocalImageElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        LocalImageElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.LocalImageElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: LocalImageElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: LocalImageElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: LocalImageElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): LocalImageElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return LocalImageElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: LocalImageElement): LocalImageElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class RemoteImageElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<RemoteImageElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is RemoteImageElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "RemoteImageElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): RemoteImageElement =
        RemoteImageElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<RemoteImageElement> = object :
          ProtoAdapter<RemoteImageElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        RemoteImageElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.RemoteImageElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: RemoteImageElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: RemoteImageElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: RemoteImageElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): RemoteImageElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return RemoteImageElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: RemoteImageElement): RemoteImageElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class MoneyElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<MoneyElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is MoneyElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "MoneyElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): MoneyElement =
        MoneyElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<MoneyElement> = object : ProtoAdapter<MoneyElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        MoneyElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.MoneyElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: MoneyElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: MoneyElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: MoneyElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): MoneyElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return MoneyElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: MoneyElement): MoneyElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class SpacerElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<SpacerElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is SpacerElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "SpacerElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): SpacerElement =
        SpacerElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<SpacerElement> = object : ProtoAdapter<SpacerElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        SpacerElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.SpacerElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: SpacerElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: SpacerElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: SpacerElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): SpacerElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return SpacerElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: SpacerElement): SpacerElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class TextElement(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
    )
    public val text: String? = null,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<TextElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is TextElement) return false
      if (unknownFields != other.unknownFields) return false
      if (text != other.text) return false
      return true
    }

    public override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + (text?.hashCode() ?: 0)
        super.hashCode = result
      }
      return result
    }

    public override fun toString(): String {
      val result = mutableListOf<String>()
      if (text != null) result += """text=${sanitize(text)}"""
      return result.joinToString(prefix = "TextElement{", separator = ", ", postfix = "}")
    }

    public fun copy(text: String? = this.text, unknownFields: ByteString = this.unknownFields):
        TextElement = TextElement(text, unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<TextElement> = object : ProtoAdapter<TextElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        TextElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.TextElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: TextElement): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.text)
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: TextElement): Unit {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text)
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: TextElement): Unit {
          writer.writeBytes(value.unknownFields)
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text)
        }

        public override fun decode(reader: ProtoReader): TextElement {
          var text: String? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> text = ProtoAdapter.STRING.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return TextElement(
            text = text,
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: TextElement): TextElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class CustomizedCardElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<CustomizedCardElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is CustomizedCardElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "CustomizedCardElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): CustomizedCardElement =
        CustomizedCardElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<CustomizedCardElement> = object :
          ProtoAdapter<CustomizedCardElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        CustomizedCardElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.CustomizedCardElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: CustomizedCardElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: CustomizedCardElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: CustomizedCardElement):
            Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): CustomizedCardElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return CustomizedCardElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: CustomizedCardElement): CustomizedCardElement =
            value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class AddressElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<AddressElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is AddressElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "AddressElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): AddressElement =
        AddressElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<AddressElement> = object : ProtoAdapter<AddressElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        AddressElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.AddressElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: AddressElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: AddressElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: AddressElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): AddressElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return AddressElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: AddressElement): AddressElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class TextInputElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<TextInputElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is TextInputElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "TextInputElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): TextInputElement =
        TextInputElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<TextInputElement> = object : ProtoAdapter<TextInputElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        TextInputElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.TextInputElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: TextInputElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: TextInputElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: TextInputElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): TextInputElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return TextInputElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: TextInputElement): TextInputElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class OptionPickerElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<OptionPickerElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is OptionPickerElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "OptionPickerElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): OptionPickerElement =
        OptionPickerElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<OptionPickerElement> = object :
          ProtoAdapter<OptionPickerElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        OptionPickerElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.OptionPickerElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: OptionPickerElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: OptionPickerElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: OptionPickerElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): OptionPickerElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return OptionPickerElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: OptionPickerElement): OptionPickerElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class DetailRowElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<DetailRowElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is DetailRowElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "DetailRowElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): DetailRowElement =
        DetailRowElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<DetailRowElement> = object : ProtoAdapter<DetailRowElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        DetailRowElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.DetailRowElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: DetailRowElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: DetailRowElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter, `value`: DetailRowElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): DetailRowElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return DetailRowElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: DetailRowElement): DetailRowElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }

  public class CurrencyConversionFlagsElement(
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<CurrencyConversionFlagsElement, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    public override fun newBuilder(): Nothing = throw
        AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    public override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is CurrencyConversionFlagsElement) return false
      if (unknownFields != other.unknownFields) return false
      return true
    }

    public override fun hashCode(): Int = unknownFields.hashCode()

    public override fun toString(): String = "CurrencyConversionFlagsElement{}"

    public fun copy(unknownFields: ByteString = this.unknownFields): CurrencyConversionFlagsElement
        = CurrencyConversionFlagsElement(unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<CurrencyConversionFlagsElement> = object :
          ProtoAdapter<CurrencyConversionFlagsElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        CurrencyConversionFlagsElement::class, 
        "type.googleapis.com/squareup.protos.kotlin.oneof.Form.CurrencyConversionFlagsElement", 
        PROTO_2, 
        null, 
        "form.proto"
      ) {
        public override fun encodedSize(`value`: CurrencyConversionFlagsElement): Int {
          var size = value.unknownFields.size
          return size
        }

        public override fun encode(writer: ProtoWriter, `value`: CurrencyConversionFlagsElement):
            Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun encode(writer: ReverseProtoWriter,
            `value`: CurrencyConversionFlagsElement): Unit {
          writer.writeBytes(value.unknownFields)
        }

        public override fun decode(reader: ProtoReader): CurrencyConversionFlagsElement {
          val unknownFields = reader.forEachTag(reader::readUnknownField)
          return CurrencyConversionFlagsElement(
            unknownFields = unknownFields
          )
        }

        public override fun redact(`value`: CurrencyConversionFlagsElement):
            CurrencyConversionFlagsElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }
}
