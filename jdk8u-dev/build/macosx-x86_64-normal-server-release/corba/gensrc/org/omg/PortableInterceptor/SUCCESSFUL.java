package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/SUCCESSFUL.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2018年9月8日 星期六 下午01时28分32秒 CST
*/

public interface SUCCESSFUL
{

  /**
     * Indicates a successful Reply Status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SYSTEM_EXCEPTION
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
  public static final short value = (short)(0);
}