package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerIdsHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2018年9月8日 星期六 下午01时28分31秒 CST
*/

public final class ServerIdsHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public ServerIdsHolder ()
  {
  }

  public ServerIdsHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerIdsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerIdsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerIdsHelper.type ();
  }

}