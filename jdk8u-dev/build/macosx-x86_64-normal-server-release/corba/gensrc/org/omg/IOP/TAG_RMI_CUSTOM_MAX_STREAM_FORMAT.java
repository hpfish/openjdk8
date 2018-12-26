package org.omg.IOP;


/**
* org/omg/IOP/TAG_RMI_CUSTOM_MAX_STREAM_FORMAT.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2018年9月8日 星期六 下午01时28分32秒 CST
*/

public interface TAG_RMI_CUSTOM_MAX_STREAM_FORMAT
{

  /**
       * RMI-IIOP has multiple stream format versions.  A server
       * can specify its maximum version by including the
       * TAG_RMI_CUSTOM_MAX_STREAM_FORMAT tagged component or
       * rely on the default of version 1 for GIOP 1.2 and less
       * and version 2 for GIOP 1.3 and higher.
       *
       * See Java to IDL ptc/02-01-12 1.4.11.
       */
  public static final int value = (int)(38L);
}
