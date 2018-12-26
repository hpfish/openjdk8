/*
 * Copyright (c) 1998, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javax.swing;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.awt.Image;

import sun.swing.BeanInfoUtils;

/**
 * Descriptive information about the JDesktopPane class for Java 
 * Beans application builders.  This BeanInfo class provides descriptions
 * of each property, of the bean itself, it indicates which
 * JDesktopPane properties are bound, and it provides other
 * information and icons useful to builders.
 * 
 * @author Auto-Generated Source Code
 */

public class JDesktopPaneBeanInfo extends javax.swing.SwingBeanInfoBase {
    private static final Class classJDesktopPane = javax.swing.JDesktopPane.class;

    /**
     * @return a JDesktopPane BeanDescriptor
     */
    public BeanDescriptor getBeanDescriptor() {
        return BeanInfoUtils.createBeanDescriptor(classJDesktopPane,
                                                  new Object[] {
                BeanInfoUtils.PREFERRED, Boolean.TRUE,
                
                    BeanInfoUtils.SHORTDESCRIPTION, "JDesktopPane"
        });
    }


    /**
     * Create a JDesktopPane PropertyDescriptor.  This is just an internal
     * convenience method that allows one to leave the JDesktopPane.class
     * argument out of the createPropertyDescriptor() class in the 
     * getPropertyDescriptors() method below.
     * 
     * @param name the name of the property
     * @param args an array java.beans.PropertyDescriptor property names and values
     * @return a JDesktopPane PropertyDescriptor.
     * @see BeanInfoUtils#createPropertyDescriptor
     */
    private PropertyDescriptor createPropertyDescriptor(String name, Object[] args) {
        return BeanInfoUtils.createPropertyDescriptor(classJDesktopPane, name, args);
    }


    /**
     * This method returns a list of bean PropertyDescriptors, one for each public
     * property in JDesktopPane.  The first property is the "default" property.
     *
     * @return a complete list of bean PropertyDescriptors for JDesktopPane
     * @see SwingBeanInfo
     * @see java.beans.BeanInfo#getDefaultPropertyIndex
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
         
		Object[] dragModeEnumeration = new Object[] { 
			"LIVE_DRAG_MODE" ,   new Integer(JDesktopPane.LIVE_DRAG_MODE), "JDesktopPane.LIVE_DRAG_MODE",
			"OUTLINE_DRAG_MODE" ,   new Integer(JDesktopPane.OUTLINE_DRAG_MODE), "JDesktopPane.OUTLINE_DRAG_MODE"
		};

        return new PropertyDescriptor[] {
            
             createPropertyDescriptor("UI", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                           sun.swing.BeanInfoUtils.HIDDEN, Boolean.TRUE,
                           "visualUpdate", Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "The UI object that implements the Component's LookAndFeel.",
               }
             ),
             
             createPropertyDescriptor("UIClassID", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "UIClassID",
               }
             ),
             
             createPropertyDescriptor("accessibleContext", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "accessibleContext",
               }
             ),
             
             createPropertyDescriptor("allFrames", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "allFrames",
               }
             ),
             
             createPropertyDescriptor("desktopManager", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Desktop manager to handle the internal frames in the desktop pane.",
               }
             ),
             
             createPropertyDescriptor("dragMode", new Object[] {
                            sun.swing.BeanInfoUtils.BOUND, Boolean.TRUE,
                      "enumerationValues", dragModeEnumeration,
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "Dragging style for internal frame children. ",
               }
             ),
             
             createPropertyDescriptor("selectedFrame", new Object[] {
                 sun.swing.BeanInfoUtils.SHORTDESCRIPTION, "selectedFrame",
               }
             )
             
        };
    }


    /**
     * @return an icon of the specified kind for JDesktopPane
     */
    public Image getIcon(final int kind) {
        Image i;
        switch (kind){
            case ICON_COLOR_32x32:
                i = loadStandardImage("beaninfo/images/JDesktopPaneColor32.gif");
                return ((i == null) ? loadStandardImage("beaninfo/images/JComponentColor32.gif") : i);
            case ICON_COLOR_16x16:
                i = loadStandardImage("beaninfo/images/JDesktopPaneColor16.gif");
                return ((i == null) ? loadStandardImage("beaninfo/images/JComponentColor16.gif") : i);
            case ICON_MONO_32x32:
                i = loadStandardImage("beaninfo/images/JDesktopPaneMono32.gif");
                return ((i == null) ? loadStandardImage("beaninfo/images/JComponentMono32.gif") : i);         
            case ICON_MONO_16x16:
                i = loadStandardImage("beaninfo/images/JDesktopPaneMono16.gif");
                return ((i == null) ? loadStandardImage("beaninfo/images/JComponentMono16.gif") : i);         
            default:
                return super.getIcon(kind);
        }
    }

    /**
     * This is a utility method to help in loading standard icon images.
     *
     * @param  resourceName A pathname relative to the directory holding the
     *         class file of the current class
     * @return an image object. May be null if the load failed.
     * @see java.beans.SimpleBeanInfo#loadImage(String)
     */
    private Image loadStandardImage(final String resourceName) {
        return java.security.AccessController.doPrivileged(
                (java.security.PrivilegedAction<Image>) () -> loadImage(resourceName));
    }
}


