/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xalan" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, Lotus
 * Development Corporation., http://www.lotus.com.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xml.dtm;

/**
 * Specifies values related to XPath Axes.
 * <p>The ancestor, descendant, following, preceding and self axes partition a
 * document (ignoring attribute and namespace nodes): they do not overlap
 * and together they contain all the nodes in the document.</p>
 */
public interface Axis
{

  /**
   * The ancestor axis contains the ancestors of the context node;
   *  the ancestors of the context node consist of the parent of context
   *  node and the parent's parent and so on; thus, the ancestor axis will
   *  always include the root node, unless the context node is the root node. 
   */
  public static final int ANCESTOR = 0;

  /**
   * the ancestor-or-self axis contains the context node and the ancestors of
   *  the context node; thus, the ancestor axis will always include the
   *  root node. 
   */
  public static final int ANCESTORORSELF = 1;

  /**
   * the attribute axis contains the attributes of the context node; the axis
   *  will be empty unless the context node is an element.  
   */
  public static final int ATTRIBUTE = 2;

  /** The child axis contains the children of the context node. */
  public static final int CHILD = 3;

  /**
   * The descendant axis contains the descendants of the context node;
   *  a descendant is a child or a child of a child and so on; thus the
   *  descendant axis never contains attribute or namespace nodes.         
   */
  public static final int DESCENDANT = 4;

  /**
   * The descendant-or-self axis contains the context node and the
   *  descendants of the context node.  
   */
  public static final int DESCENDANTORSELF = 5;

  /**
   * the following axis contains all nodes in the same document as the
   *  context node that are after the context node in document order, excluding
   *  any descendants and excluding attribute nodes and namespace nodes. 
   */
  public static final int FOLLOWING = 6;

  /**
   * The following-sibling axis contains all the following siblings of the
   *  context node; if the context node is an attribute node or namespace node,
   *  the following-sibling axis is empty. 
   */
  public static final int FOLLOWINGSIBLING = 7;

  /**
   * The namespace axis contains the namespace nodes of the context node; the
   *  axis will be empty unless the context node is an element.  
   */
  public static final int NAMESPACE = 8;

  /**
   * The parent axis contains the parent of the context node,
   *  if there is one.  
   */
  public static final int PARENT = 9;

  /**
   * The preceding axis contains all nodes in the same document as the context
   *  node that are before the context node in document order, excluding any
   *  ancestors and excluding attribute nodes and namespace nodes 
   */
  public static final int PRECEDING = 10;

  /**
   * The preceding-sibling axis contains all the preceding siblings of the
   *  context node; if the context node is an attribute node or namespace node,
   *  the preceding-sibling axis is empty.  
   */
  public static final int PRECEDINGSIBLING = 11;

  /** The self axis contains just the context node itself. */
  public static final int SELF = 12;

  /** The names of the axes for diagnostic purposes. */
  public static final String[] names = { "ancestor", "ancestor-or-self",
                                         "attribute", "child", "descendant",
                                         "descendant-or-self", "following",
                                         "following-sibling", "namespace",
                                         "parent", "preceding",
                                         "preceding-sibling", "self" };
}
