package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingTypeHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2018年9月8日 星期六 下午01时28分31秒 CST
*/


/**
   * Specifies whether the given binding is for a object (that is not a
   * naming context) or for a naming context.
   */
abstract public class BindingTypeHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/BindingType:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CosNaming.BindingType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CosNaming.BindingType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (org.omg.CosNaming.BindingTypeHelper.id (), "BindingType", new String[] { "nobject", "ncontext"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CosNaming.BindingType read (org.omg.CORBA.portable.InputStream istream)
  {
    return org.omg.CosNaming.BindingType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CosNaming.BindingType value)
  {
    ostream.write_long (value.value ());
  }

}
