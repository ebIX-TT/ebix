/**
 */
package org.ebix.umm.umm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ebix.umm.umm.UmmPackage#getMultiplicityKind()
 * @model
 * @generated
 */
public enum MultiplicityKind implements Enumerator
{
  /**
   * The '<em><b>Optional</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPTIONAL_VALUE
   * @generated
   * @ordered
   */
  OPTIONAL(0, "Optional", "(0..1)"),

  /**
   * The '<em><b>One</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_VALUE
   * @generated
   * @ordered
   */
  ONE(1, "One", "(1..1)"),

  /**
   * The '<em><b>One Or More</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_OR_MORE_VALUE
   * @generated
   * @ordered
   */
  ONE_OR_MORE(2, "OneOrMore", "(1..*)"),

  /**
   * The '<em><b>Zero Or More</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_OR_MORE_VALUE
   * @generated
   * @ordered
   */
  ZERO_OR_MORE(3, "ZeroOrMore", "(0..*)");

  /**
   * The '<em><b>Optional</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Optional</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPTIONAL
   * @model name="Optional" literal="(0..1)"
   * @generated
   * @ordered
   */
  public static final int OPTIONAL_VALUE = 0;

  /**
   * The '<em><b>One</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>One</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE
   * @model name="One" literal="(1..1)"
   * @generated
   * @ordered
   */
  public static final int ONE_VALUE = 1;

  /**
   * The '<em><b>One Or More</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>One Or More</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_OR_MORE
   * @model name="OneOrMore" literal="(1..*)"
   * @generated
   * @ordered
   */
  public static final int ONE_OR_MORE_VALUE = 2;

  /**
   * The '<em><b>Zero Or More</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Zero Or More</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZERO_OR_MORE
   * @model name="ZeroOrMore" literal="(0..*)"
   * @generated
   * @ordered
   */
  public static final int ZERO_OR_MORE_VALUE = 3;

  /**
   * An array of all the '<em><b>Multiplicity Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MultiplicityKind[] VALUES_ARRAY =
    new MultiplicityKind[]
    {
      OPTIONAL,
      ONE,
      ONE_OR_MORE,
      ZERO_OR_MORE,
    };

  /**
   * A public read-only list of all the '<em><b>Multiplicity Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MultiplicityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Multiplicity Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplicityKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MultiplicityKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Multiplicity Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplicityKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MultiplicityKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Multiplicity Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MultiplicityKind get(int value)
  {
    switch (value)
    {
      case OPTIONAL_VALUE: return OPTIONAL;
      case ONE_VALUE: return ONE;
      case ONE_OR_MORE_VALUE: return ONE_OR_MORE;
      case ZERO_OR_MORE_VALUE: return ZERO_OR_MORE;
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
  private MultiplicityKind(int value, String name, String literal)
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
  
} //MultiplicityKind
