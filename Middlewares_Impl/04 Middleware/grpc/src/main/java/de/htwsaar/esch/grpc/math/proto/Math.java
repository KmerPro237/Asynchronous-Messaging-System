// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: math.proto

package de.htwsaar.esch.grpc.math.proto;

public final class Math {
  private Math() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MathRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MathRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 num1 = 1;</code>
     */
    int getNum1();

    /**
     * <code>int32 num2 = 2;</code>
     */
    int getNum2();
  }
  /**
   * Protobuf type {@code MathRequest}
   */
  public  static final class MathRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MathRequest)
      MathRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MathRequest.newBuilder() to construct.
    private MathRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MathRequest() {
      num1_ = 0;
      num2_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MathRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              num1_ = input.readInt32();
              break;
            }
            case 16: {

              num2_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.htwsaar.esch.grpc.math.proto.Math.MathRequest.class, de.htwsaar.esch.grpc.math.proto.Math.MathRequest.Builder.class);
    }

    public static final int NUM1_FIELD_NUMBER = 1;
    private int num1_;
    /**
     * <code>int32 num1 = 1;</code>
     */
    public int getNum1() {
      return num1_;
    }

    public static final int NUM2_FIELD_NUMBER = 2;
    private int num2_;
    /**
     * <code>int32 num2 = 2;</code>
     */
    public int getNum2() {
      return num2_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (num1_ != 0) {
        output.writeInt32(1, num1_);
      }
      if (num2_ != 0) {
        output.writeInt32(2, num2_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (num1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, num1_);
      }
      if (num2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, num2_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof de.htwsaar.esch.grpc.math.proto.Math.MathRequest)) {
        return super.equals(obj);
      }
      de.htwsaar.esch.grpc.math.proto.Math.MathRequest other = (de.htwsaar.esch.grpc.math.proto.Math.MathRequest) obj;

      boolean result = true;
      result = result && (getNum1()
          == other.getNum1());
      result = result && (getNum2()
          == other.getNum2());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NUM1_FIELD_NUMBER;
      hash = (53 * hash) + getNum1();
      hash = (37 * hash) + NUM2_FIELD_NUMBER;
      hash = (53 * hash) + getNum2();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(de.htwsaar.esch.grpc.math.proto.Math.MathRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MathRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MathRequest)
        de.htwsaar.esch.grpc.math.proto.Math.MathRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                de.htwsaar.esch.grpc.math.proto.Math.MathRequest.class, de.htwsaar.esch.grpc.math.proto.Math.MathRequest.Builder.class);
      }

      // Construct using de.htwsaar.esch.grpc.math.proto.Math.MathRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        num1_ = 0;

        num2_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathRequest_descriptor;
      }

      @java.lang.Override
      public de.htwsaar.esch.grpc.math.proto.Math.MathRequest getDefaultInstanceForType() {
        return de.htwsaar.esch.grpc.math.proto.Math.MathRequest.getDefaultInstance();
      }

      @java.lang.Override
      public de.htwsaar.esch.grpc.math.proto.Math.MathRequest build() {
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public de.htwsaar.esch.grpc.math.proto.Math.MathRequest buildPartial() {
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest result = new de.htwsaar.esch.grpc.math.proto.Math.MathRequest(this);
        result.num1_ = num1_;
        result.num2_ = num2_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof de.htwsaar.esch.grpc.math.proto.Math.MathRequest) {
          return mergeFrom((de.htwsaar.esch.grpc.math.proto.Math.MathRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(de.htwsaar.esch.grpc.math.proto.Math.MathRequest other) {
        if (other == de.htwsaar.esch.grpc.math.proto.Math.MathRequest.getDefaultInstance()) return this;
        if (other.getNum1() != 0) {
          setNum1(other.getNum1());
        }
        if (other.getNum2() != 0) {
          setNum2(other.getNum2());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        de.htwsaar.esch.grpc.math.proto.Math.MathRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (de.htwsaar.esch.grpc.math.proto.Math.MathRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int num1_ ;
      /**
       * <code>int32 num1 = 1;</code>
       */
      public int getNum1() {
        return num1_;
      }
      /**
       * <code>int32 num1 = 1;</code>
       */
      public Builder setNum1(int value) {
        
        num1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 num1 = 1;</code>
       */
      public Builder clearNum1() {
        
        num1_ = 0;
        onChanged();
        return this;
      }

      private int num2_ ;
      /**
       * <code>int32 num2 = 2;</code>
       */
      public int getNum2() {
        return num2_;
      }
      /**
       * <code>int32 num2 = 2;</code>
       */
      public Builder setNum2(int value) {
        
        num2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 num2 = 2;</code>
       */
      public Builder clearNum2() {
        
        num2_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MathRequest)
    }

    // @@protoc_insertion_point(class_scope:MathRequest)
    private static final de.htwsaar.esch.grpc.math.proto.Math.MathRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new de.htwsaar.esch.grpc.math.proto.Math.MathRequest();
    }

    public static de.htwsaar.esch.grpc.math.proto.Math.MathRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MathRequest>
        PARSER = new com.google.protobuf.AbstractParser<MathRequest>() {
      @java.lang.Override
      public MathRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MathRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MathRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MathRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public de.htwsaar.esch.grpc.math.proto.Math.MathRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MathResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MathResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 result = 1;</code>
     */
    int getResult();
  }
  /**
   * Protobuf type {@code MathResponse}
   */
  public  static final class MathResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MathResponse)
      MathResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MathResponse.newBuilder() to construct.
    private MathResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MathResponse() {
      result_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MathResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              result_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.htwsaar.esch.grpc.math.proto.Math.MathResponse.class, de.htwsaar.esch.grpc.math.proto.Math.MathResponse.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    /**
     * <code>int32 result = 1;</code>
     */
    public int getResult() {
      return result_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (result_ != 0) {
        output.writeInt32(1, result_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, result_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof de.htwsaar.esch.grpc.math.proto.Math.MathResponse)) {
        return super.equals(obj);
      }
      de.htwsaar.esch.grpc.math.proto.Math.MathResponse other = (de.htwsaar.esch.grpc.math.proto.Math.MathResponse) obj;

      boolean result = true;
      result = result && (getResult()
          == other.getResult());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(de.htwsaar.esch.grpc.math.proto.Math.MathResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MathResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MathResponse)
        de.htwsaar.esch.grpc.math.proto.Math.MathResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                de.htwsaar.esch.grpc.math.proto.Math.MathResponse.class, de.htwsaar.esch.grpc.math.proto.Math.MathResponse.Builder.class);
      }

      // Construct using de.htwsaar.esch.grpc.math.proto.Math.MathResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        result_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return de.htwsaar.esch.grpc.math.proto.Math.internal_static_MathResponse_descriptor;
      }

      @java.lang.Override
      public de.htwsaar.esch.grpc.math.proto.Math.MathResponse getDefaultInstanceForType() {
        return de.htwsaar.esch.grpc.math.proto.Math.MathResponse.getDefaultInstance();
      }

      @java.lang.Override
      public de.htwsaar.esch.grpc.math.proto.Math.MathResponse build() {
        de.htwsaar.esch.grpc.math.proto.Math.MathResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public de.htwsaar.esch.grpc.math.proto.Math.MathResponse buildPartial() {
        de.htwsaar.esch.grpc.math.proto.Math.MathResponse result = new de.htwsaar.esch.grpc.math.proto.Math.MathResponse(this);
        result.result_ = result_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof de.htwsaar.esch.grpc.math.proto.Math.MathResponse) {
          return mergeFrom((de.htwsaar.esch.grpc.math.proto.Math.MathResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(de.htwsaar.esch.grpc.math.proto.Math.MathResponse other) {
        if (other == de.htwsaar.esch.grpc.math.proto.Math.MathResponse.getDefaultInstance()) return this;
        if (other.getResult() != 0) {
          setResult(other.getResult());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        de.htwsaar.esch.grpc.math.proto.Math.MathResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (de.htwsaar.esch.grpc.math.proto.Math.MathResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int result_ ;
      /**
       * <code>int32 result = 1;</code>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>int32 result = 1;</code>
       */
      public Builder setResult(int value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MathResponse)
    }

    // @@protoc_insertion_point(class_scope:MathResponse)
    private static final de.htwsaar.esch.grpc.math.proto.Math.MathResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new de.htwsaar.esch.grpc.math.proto.Math.MathResponse();
    }

    public static de.htwsaar.esch.grpc.math.proto.Math.MathResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MathResponse>
        PARSER = new com.google.protobuf.AbstractParser<MathResponse>() {
      @java.lang.Override
      public MathResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MathResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MathResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MathResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public de.htwsaar.esch.grpc.math.proto.Math.MathResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MathRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MathRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MathResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MathResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nmath.proto\")\n\013MathRequest\022\014\n\004num1\030\001 \001(" +
      "\005\022\014\n\004num2\030\002 \001(\005\"\036\n\014MathResponse\022\016\n\006resul" +
      "t\030\001 \001(\0052\252\001\n\013MathService\022\"\n\003Add\022\014.MathReq" +
      "uest\032\r.MathResponse\022\'\n\010Subtract\022\014.MathRe" +
      "quest\032\r.MathResponse\022\'\n\010Multiply\022\014.MathR" +
      "equest\032\r.MathResponse\022%\n\006Divide\022\014.MathRe" +
      "quest\032\r.MathResponseB!\n\037de.htwsaar.esch." +
      "grpc.math.protob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MathRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MathRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MathRequest_descriptor,
        new java.lang.String[] { "Num1", "Num2", });
    internal_static_MathResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MathResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MathResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
