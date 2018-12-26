package org.omg.IOP;


/**
* org/omg/IOP/CodecFactoryHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2018年9月8日 星期六 下午01时28分32秒 CST
*/


/**
   * <code>Codecs</code> are obtained from the <code>CodecFactory</code>. 
   * The <code>CodecFactory</code> is obtained through a call to 
   * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
   */
abstract public class CodecFactoryHelper
{
  private static String  _id = "IDL:omg.org/IOP/CodecFactory:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.IOP.CodecFactory that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.IOP.CodecFactory extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.IOP.CodecFactoryHelper.id (), "CodecFactory");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.IOP.CodecFactory read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.IOP.CodecFactory value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static org.omg.IOP.CodecFactory narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.IOP.CodecFactory)
      return (org.omg.IOP.CodecFactory)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  public static org.omg.IOP.CodecFactory unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.IOP.CodecFactory)
      return (org.omg.IOP.CodecFactory)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

}
