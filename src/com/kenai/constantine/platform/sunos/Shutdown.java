// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 14 05:10:55 +0000 2008
package com.kenai.constantine.platform.sunos;
public enum Shutdown implements com.kenai.constantine.Constant {
SHUT_RD(0),
SHUT_WR(1),
SHUT_RDWR(2);
private final int value;
private Shutdown(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 2;

public final int value() { return value; }
}