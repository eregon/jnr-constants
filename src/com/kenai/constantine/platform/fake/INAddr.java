// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat Nov 29 06:34:50 +0000 2008
package com.kenai.constantine.platform.fake;
public enum INAddr implements com.kenai.constantine.Constant {
INADDR_ANY(1),
INADDR_BROADCAST(2),
INADDR_NONE(3),
INADDR_LOOPBACK(4),
INADDR_UNSPEC_GROUP(5),
INADDR_ALLHOSTS_GROUP(6),
INADDR_ALLRTRS_GROUP(7),
INADDR_MAX_LOCAL_GROUP(8);
private final int value;
private INAddr(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 8;
public final int value() { return value; }
}
