package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingIteratorOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2018年9月8日 星期六 下午01时28分31秒 CST
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <tt>list</tt>
   * method on the <tt>NamingContext</tt>. 
   * @see org.omg.CosNaming.NamingContext#list
   */
public interface BindingIteratorOperations 
{

  /**
       * This operation returns the next binding. If there are no more
       * bindings, false is returned.
       * 
       * @param b the returned binding
       */
  boolean next_one (org.omg.CosNaming.BindingHolder b);

  /**
       * This operation returns at most the requested number of bindings.
       * 
       * @param how_many the maximum number of bindings tro return <p>
       * 
       * @param bl the returned bindings
       */
  boolean next_n (int how_many, org.omg.CosNaming.BindingListHolder bl);

  /**
       * This operation destroys the iterator.
       */
  void destroy ();
} // interface BindingIteratorOperations
