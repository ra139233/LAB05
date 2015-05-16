/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Aluno#getRegAluno <em>Reg Aluno</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends Usuario {
	/**
	 * Returns the value of the '<em><b>Reg Aluno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Aluno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Aluno</em>' attribute.
	 * @see #setRegAluno(int)
	 * @see Model.ModelPackage#getAluno_RegAluno()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRegAluno();

	/**
	 * Sets the value of the '{@link Model.Aluno#getRegAluno <em>Reg Aluno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Aluno</em>' attribute.
	 * @see #getRegAluno()
	 * @generated
	 */
	void setRegAluno(int value);

} // Aluno
