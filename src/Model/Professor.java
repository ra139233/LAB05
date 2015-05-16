/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Professor#getRegProfessor <em>Reg Professor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Usuario {
	/**
	 * Returns the value of the '<em><b>Reg Professor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Professor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Professor</em>' attribute.
	 * @see #setRegProfessor(int)
	 * @see Model.ModelPackage#getProfessor_RegProfessor()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegProfessor();

	/**
	 * Sets the value of the '{@link Model.Professor#getRegProfessor <em>Reg Professor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Professor</em>' attribute.
	 * @see #getRegProfessor()
	 * @generated
	 */
	void setRegProfessor(int value);

} // Professor
