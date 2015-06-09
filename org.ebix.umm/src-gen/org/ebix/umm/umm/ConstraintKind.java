/**
 */
package org.ebix.umm.umm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebix.umm.umm.UmmPackage#getConstraintKind()
 * @model
 * @generated
 */
public enum ConstraintKind implements Enumerator
{
  /**
   * The '<em><b>Invariant</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVARIANT_VALUE
   * @generated
   * @ordered
   */
  INVARIANT(0, "invariant", "invariant"),

  /**
   * The '<em><b>Abie</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABIE_VALUE
   * @generated
   * @ordered
   */
  ABIE(1, "abie", "abie"),

  /**
   * The '<em><b>Bdt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BDT_VALUE
   * @generated
   * @ordered
   */
  BDT(2, "bdt", "bdt"),

  /**
   * The '<em><b>Dependency</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPENDENCY_VALUE
   * @generated
   * @ordered
   */
  DEPENDENCY(3, "dependency", "dependency"),

  /**
   * The '<em><b>Facet</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FACET_VALUE
   * @generated
   * @ordered
   */
  FACET(4, "facet", "facet"),

  /**
   * The '<em><b>Payload</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAYLOAD_VALUE
   * @generated
   * @ordered
   */
  PAYLOAD(5, "payload", "payload"),

  /**
   * The '<em><b>Document</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOCUMENT_VALUE
   * @generated
   * @ordered
   */
  DOCUMENT(6, "document", "document");

  /**
   * The '<em><b>Invariant</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invariant</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVARIANT
   * @model name="invariant"
   * @generated
   * @ordered
   */
  public static final int INVARIANT_VALUE = 0;

  /**
   * The '<em><b>Abie</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Abie</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABIE
   * @model name="abie"
   * @generated
   * @ordered
   */
  public static final int ABIE_VALUE = 1;

  /**
   * The '<em><b>Bdt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bdt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BDT
   * @model name="bdt"
   * @generated
   * @ordered
   */
  public static final int BDT_VALUE = 2;

  /**
   * The '<em><b>Dependency</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dependency</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPENDENCY
   * @model name="dependency"
   * @generated
   * @ordered
   */
  public static final int DEPENDENCY_VALUE = 3;

  /**
   * The '<em><b>Facet</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Facet</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FACET
   * @model name="facet"
   * @generated
   * @ordered
   */
  public static final int FACET_VALUE = 4;

  /**
   * The '<em><b>Payload</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Payload</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAYLOAD
   * @model name="payload"
   * @generated
   * @ordered
   */
  public static final int PAYLOAD_VALUE = 5;

  /**
   * The '<em><b>Document</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Document</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOCUMENT
   * @model name="document"
   * @generated
   * @ordered
   */
  public static final int DOCUMENT_VALUE = 6;

  /**
   * An array of all the '<em><b>Constraint Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConstraintKind[] VALUES_ARRAY =
    new ConstraintKind[]
    {
      INVARIANT,
      ABIE,
      BDT,
      DEPENDENCY,
      FACET,
      PAYLOAD,
      DOCUMENT,
    };

  /**
   * A public read-only list of all the '<em><b>Constraint Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConstraintKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConstraintKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConstraintKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConstraintKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ConstraintKind get(int value)
  {
    switch (value)
    {
      case INVARIANT_VALUE: return INVARIANT;
      case ABIE_VALUE: return ABIE;
      case BDT_VALUE: return BDT;
      case DEPENDENCY_VALUE: return DEPENDENCY;
      case FACET_VALUE: return FACET;
      case PAYLOAD_VALUE: return PAYLOAD;
      case DOCUMENT_VALUE: return DOCUMENT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ConstraintKind(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ConstraintKind
