package org.omg.PortableServer;


/**
* org/omg/PortableServer/AdapterActivatorOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从/Users/gao/WorkSpace/Java/OpenJDK/jdk8u-dev/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2018年9月8日 星期六 下午01时28分32秒 CST
*/


/**
	 * An adapter activator supplies a POA with the ability 
	 * to create child POAs on demand, as a side-effect of 
	 * receiving a request that names the child POA 
	 * (or one of its children), or when find_POA is called 
	 * with an activate parameter value of TRUE.
	 */
public interface AdapterActivatorOperations 
{

  /**
  	 * This operation is invoked when the ORB receives 
  	 * a request for an object reference that identifies 
  	 * a target POA that does not exist. The ORB invokes 
  	 * this operation once for each POA that must be 
  	 * created in order for the target POA to exist.
  	 * @param parent indicates the parent POA for the POA
  	 *               that needs to be created.
  	 * @param name identifies the name of the POA relative to
  	 *             the parent.
  	 * @return returns TRUE if the POA was created or FALSE
  	 *         otherwise.
  	 */
  boolean unknown_adapter (org.omg.PortableServer.POA parent, String name);
} // interface AdapterActivatorOperations
