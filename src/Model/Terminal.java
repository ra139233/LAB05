/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Terminal#isTerminalAtivo <em>Terminal Ativo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminal Ativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Ativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Ativo</em>' attribute.
	 * @see #setTerminalAtivo(boolean)
	 * @see Model.ModelPackage#getTerminal_TerminalAtivo()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTerminalAtivo();

	/**
	 * Sets the value of the '{@link Model.Terminal#isTerminalAtivo <em>Terminal Ativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Ativo</em>' attribute.
	 * @see #isTerminalAtivo()
	 * @generated
	 */
	void setTerminalAtivo(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idFuncionarioDataType="org.eclipse.uml2.types.String" idFuncionarioRequired="true" idFuncionarioOrdered="false" senhaDataType="org.eclipse.uml2.types.Integer" senhaRequired="true" senhaOrdered="false"
	 * @generated
	 */
	void fazerLogin(String idFuncionario, int senha);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fazerLogout();

} // Terminal
