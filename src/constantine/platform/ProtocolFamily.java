// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Oct 14 15:42:08 +1000 2008
package constantine.platform;
public enum ProtocolFamily implements constantine.Constant {
PF_UNSPEC,
PF_LOCAL,
PF_UNIX,
PF_INET,
PF_IMPLINK,
PF_PUP,
PF_CHAOS,
PF_NS,
PF_ISO,
PF_OSI,
PF_ECMA,
PF_DATAKIT,
PF_CCITT,
PF_SNA,
PF_DECnet,
PF_DLI,
PF_LAT,
PF_HYLINK,
PF_APPLETALK,
PF_ROUTE,
PF_LINK,
PF_XTP,
PF_COIP,
PF_CNT,
PF_SIP,
PF_IPX,
PF_RTIP,
PF_PIP,
PF_NDRV,
PF_ISDN,
PF_KEY,
PF_INET6,
PF_NATM,
PF_SYSTEM,
PF_NETBIOS,
PF_PPP,
PF_ATM,
PF_NETGRAPH,
PF_MAX,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<ProtocolFamily> resolver = ConstantResolver.getResolver(ProtocolFamily.class);
private volatile Integer value;
public final int value() { return resolver.intValue(this); }
public final static ProtocolFamily valueOf(int value) { 
    return resolver.valueOf(value);
}
}