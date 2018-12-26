package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynUnionOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2018年9月8日 星期六 下午01时28分31秒 CST
*/


/**
    * DynUnion objects support the manipulation of IDL unions.
    * A union can have only two valid current positions:
    * <UL>
    * <LI>zero, which denotes the discriminator
    * <LI>one, which denotes the active member
    * </UL>
    * The component_count value for a union depends on the current discriminator:
    * it is 2 for a union whose discriminator indicates a named member, and 1 otherwise.
    */
public interface DynUnionOperations  extends org.omg.DynamicAny.DynAnyOperations
{

  /**
          * Returns the current discriminator value.
          */
  org.omg.DynamicAny.DynAny get_discriminator ();

  /**
          * Sets the discriminator of the DynUnion to the specified value.
          * Setting the discriminator to a value that is consistent with the currently active union member
          * does not affect the currently active member. Setting the discriminator to a value that is inconsistent
          * with the currently active member deactivates the member and activates the member that is consistent
          * with the new discriminator value (if there is a member for that value) by initializing the member
          * to its default value.
          * Setting the discriminator of a union sets the current position to 0 if the discriminator value
          * indicates a non-existent union member (has_no_active_member returns true in this case).
          * Otherwise, if the discriminator value indicates a named union member, the current position is set to 1
          * (has_no_active_member returns false and component_count returns 2 in this case).
          *
          * @exception TypeMismatch if the TypeCode of the parameter is not equivalent to the TypeCode
          *            of the union's discriminator
          */
  void set_discriminator (org.omg.DynamicAny.DynAny d) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

  /**
          * Sets the discriminator to a value that is consistent with the value of the default case of a union.
          * It sets the current position to zero and causes component_count to return 2.
          *
          * @exception TypeMismatch if the union does not have an explicit default case
          */
  void set_to_default_member () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

  /**
          * Sets the discriminator to a value that does not correspond to any of the unions case labels.
          * It sets the current position to zero and causes component_count to return 1.
          *
          * @exception TypeMismatch if the union has an explicit default case or if it uses the entire range
          *            of discriminator values for explicit case labels
          */
  void set_to_no_active_member () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

  /**
          * Returns true if the union has no active member, that is, the unions value consists solely
          * of its discriminator because the discriminator has a value that is not listed as an explicit case label.
          * Calling this operation on a union that has a default case returns false.
          * Calling this operation on a union that uses the entire range of discriminator values
          * for explicit case labels returns false.
          */
  boolean has_no_active_member ();

  /**
          * Returns the TCKind value of the discriminators TypeCode.
          */
  org.omg.CORBA.TCKind discriminator_kind ();

  /**
          * Returns the TCKind value of the currently active members TypeCode. 
          *
          * @exception InvalidValue if the union does not have a currently active member
          */
  org.omg.CORBA.TCKind member_kind () throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
          * Returns the currently active member. Note that the returned reference remains valid only
          * for as long as the currently active member does not change. Using the returned reference
          * beyond the life time of the currently active member raises OBJECT_NOT_EXIST. 
          *
          * @exception InvalidValue if the union has no active member
          */
  org.omg.DynamicAny.DynAny member () throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;

  /**
          * Returns the name of the currently active member. If the unions TypeCode does not contain
          * a member name for the currently active member, the operation returns an empty string.
          *
          * @exception InvalidValue if the union has no active member
          */
  String member_name () throws org.omg.DynamicAny.DynAnyPackage.InvalidValue;
} // interface DynUnionOperations