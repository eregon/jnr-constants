// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 28 12:28:13 +1000 2008
package com.kenai.constantine.platform.fake;
public enum RLIM implements com.kenai.constantine.Constant {
RLIM_NLIMITS(1),
RLIM_INFINITY(2),
RLIM_SAVED_MAX(3),
RLIM_SAVED_CUR(4);
private final int value;
private RLIM(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 4;
public final int value() { return value; }
}