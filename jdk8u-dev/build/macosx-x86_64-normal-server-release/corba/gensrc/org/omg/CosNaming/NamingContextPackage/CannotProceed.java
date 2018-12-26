package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/CannotProceed.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2018年9月8日 星期六 下午01时28分31秒 CST
*/

public final class CannotProceed extends org.omg.CORBA.UserException
{
  public org.omg.CosNaming.NamingContext cxt = null;
  public org.omg.CosNaming.NameComponent rest_of_name[] = null;

  public CannotProceed ()
  {
    super(CannotProceedHelper.id());
  } // ctor

  public CannotProceed (org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id());
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor


  public CannotProceed (String $reason, org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id() + "  " + $reason);
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor

} // class CannotProceed
