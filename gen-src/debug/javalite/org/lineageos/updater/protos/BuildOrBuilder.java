// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/lineageos/updater/protos/build.proto

package org.lineageos.updater.protos;

public interface BuildOrBuilder extends
    // @@protoc_insertion_point(interface_extends:appOTA.Build)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string version = 2;</code>
   */
  java.lang.String getVersion();
  /**
   * <code>optional string version = 2;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>optional string buildId = 3;</code>
   */
  java.lang.String getBuildId();
  /**
   * <code>optional string buildId = 3;</code>
   */
  com.google.protobuf.ByteString
      getBuildIdBytes();

  /**
   * <code>optional int32 size = 4;</code>
   */
  int getSize();

  /**
   * <code>optional int64 created = 5;</code>
   */
  long getCreated();

  /**
   * <code>optional string channel = 6;</code>
   */
  java.lang.String getChannel();
  /**
   * <code>optional string channel = 6;</code>
   */
  com.google.protobuf.ByteString
      getChannelBytes();

  /**
   * <code>optional string url = 7;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 7;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional string sha256 = 8;</code>
   */
  java.lang.String getSha256();
  /**
   * <code>optional string sha256 = 8;</code>
   */
  com.google.protobuf.ByteString
      getSha256Bytes();
}