/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atendente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Atendente#getIdFuncionario <em>Id Funcionario</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAtendente()
 * @model
 * @generated
 */
public interface Atendente extends Usuario {
	/**
	 * Returns the value of the '<em><b>Id Funcionario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Funcionario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Funcionario</em>' attribute.
	 * @see #setIdFuncionario(int)
	 * @see Model.ModelPackage#getAtendente_IdFuncionario()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdFuncionario();

	/**
	 * Sets the value of the '{@link Model.Atendente#getIdFuncionario <em>Id Funcionario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Funcionario</em>' attribute.
	 * @see #getIdFuncionario()
	 * @generated
	 */
	void setIdFuncionario(int value);

} // Atendente
