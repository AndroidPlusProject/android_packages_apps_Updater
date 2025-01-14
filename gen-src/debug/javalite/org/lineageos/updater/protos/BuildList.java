// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/lineageos/updater/protos/build.proto

package org.lineageos.updater.protos;

/**
 * Protobuf type {@code appOTA.BuildList}
 */
public  final class BuildList extends
    com.google.protobuf.GeneratedMessageLite<
        BuildList, BuildList.Builder> implements
    // @@protoc_insertion_point(message_implements:appOTA.BuildList)
    BuildListOrBuilder {
  private BuildList() {
    builds_ = emptyProtobufList();
  }
  public static final int BUILDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.lineageos.updater.protos.Build> builds_;
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  public java.util.List<org.lineageos.updater.protos.Build> getBuildsList() {
    return builds_;
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  public java.util.List<? extends org.lineageos.updater.protos.BuildOrBuilder> 
      getBuildsOrBuilderList() {
    return builds_;
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  public int getBuildsCount() {
    return builds_.size();
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  public org.lineageos.updater.protos.Build getBuilds(int index) {
    return builds_.get(index);
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  public org.lineageos.updater.protos.BuildOrBuilder getBuildsOrBuilder(
      int index) {
    return builds_.get(index);
  }
  private void ensureBuildsIsMutable() {
    if (!builds_.isModifiable()) {
      builds_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(builds_);
     }
  }

  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void setBuilds(
      int index, org.lineageos.updater.protos.Build value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureBuildsIsMutable();
    builds_.set(index, value);
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void setBuilds(
      int index, org.lineageos.updater.protos.Build.Builder builderForValue) {
    ensureBuildsIsMutable();
    builds_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void addBuilds(org.lineageos.updater.protos.Build value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureBuildsIsMutable();
    builds_.add(value);
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void addBuilds(
      int index, org.lineageos.updater.protos.Build value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureBuildsIsMutable();
    builds_.add(index, value);
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void addBuilds(
      org.lineageos.updater.protos.Build.Builder builderForValue) {
    ensureBuildsIsMutable();
    builds_.add(builderForValue.build());
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void addBuilds(
      int index, org.lineageos.updater.protos.Build.Builder builderForValue) {
    ensureBuildsIsMutable();
    builds_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void addAllBuilds(
      java.lang.Iterable<? extends org.lineageos.updater.protos.Build> values) {
    ensureBuildsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, builds_);
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void clearBuilds() {
    builds_ = emptyProtobufList();
  }
  /**
   * <code>repeated .appOTA.Build builds = 1;</code>
   */
  private void removeBuilds(int index) {
    ensureBuildsIsMutable();
    builds_.remove(index);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < builds_.size(); i++) {
      output.writeMessage(1, builds_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < builds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, builds_.get(i));
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.lineageos.updater.protos.BuildList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.lineageos.updater.protos.BuildList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.lineageos.updater.protos.BuildList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.lineageos.updater.protos.BuildList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.lineageos.updater.protos.BuildList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code appOTA.BuildList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.lineageos.updater.protos.BuildList, Builder> implements
      // @@protoc_insertion_point(builder_implements:appOTA.BuildList)
      org.lineageos.updater.protos.BuildListOrBuilder {
    // Construct using org.lineageos.updater.protos.BuildList.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public java.util.List<org.lineageos.updater.protos.Build> getBuildsList() {
      return java.util.Collections.unmodifiableList(
          instance.getBuildsList());
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public int getBuildsCount() {
      return instance.getBuildsCount();
    }/**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public org.lineageos.updater.protos.Build getBuilds(int index) {
      return instance.getBuilds(index);
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder setBuilds(
        int index, org.lineageos.updater.protos.Build value) {
      copyOnWrite();
      instance.setBuilds(index, value);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder setBuilds(
        int index, org.lineageos.updater.protos.Build.Builder builderForValue) {
      copyOnWrite();
      instance.setBuilds(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder addBuilds(org.lineageos.updater.protos.Build value) {
      copyOnWrite();
      instance.addBuilds(value);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder addBuilds(
        int index, org.lineageos.updater.protos.Build value) {
      copyOnWrite();
      instance.addBuilds(index, value);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder addBuilds(
        org.lineageos.updater.protos.Build.Builder builderForValue) {
      copyOnWrite();
      instance.addBuilds(builderForValue);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder addBuilds(
        int index, org.lineageos.updater.protos.Build.Builder builderForValue) {
      copyOnWrite();
      instance.addBuilds(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder addAllBuilds(
        java.lang.Iterable<? extends org.lineageos.updater.protos.Build> values) {
      copyOnWrite();
      instance.addAllBuilds(values);
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder clearBuilds() {
      copyOnWrite();
      instance.clearBuilds();
      return this;
    }
    /**
     * <code>repeated .appOTA.Build builds = 1;</code>
     */
    public Builder removeBuilds(int index) {
      copyOnWrite();
      instance.removeBuilds(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:appOTA.BuildList)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.lineageos.updater.protos.BuildList();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        builds_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.lineageos.updater.protos.BuildList other = (org.lineageos.updater.protos.BuildList) arg1;
        builds_= visitor.visitList(builds_, other.builds_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                if (!builds_.isModifiable()) {
                  builds_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(builds_);
                }
                builds_.add(
                    input.readMessage(org.lineageos.updater.protos.Build.parser(), extensionRegistry));
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.lineageos.updater.protos.BuildList.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:appOTA.BuildList)
  private static final org.lineageos.updater.protos.BuildList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BuildList();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.lineageos.updater.protos.BuildList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BuildList> PARSER;

  public static com.google.protobuf.Parser<BuildList> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

