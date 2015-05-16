/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Model.ModelPackage#getBiblioteca()
 * @model
 * @generated
 */
public interface Biblioteca extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idExemplarDataType="org.eclipse.uml2.types.Integer" idExemplarRequired="true" idExemplarOrdered="false"
	 * @generated
	 */
	void consultarExemplar(int idExemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRegistroDataType="org.eclipse.uml2.types.Integer" numRegistroRequired="true" numRegistroOrdered="false" nomeUsuarioDataType="org.eclipse.uml2.types.String" nomeUsuarioRequired="true" nomeUsuarioOrdered="false"
	 * @generated
	 */
	void consultarUsuario(int numRegistro, String nomeUsuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRegistroDataType="org.eclipse.uml2.types.Integer" numRegistroRequired="true" numRegistroOrdered="false" idExemplarDataType="org.eclipse.uml2.types.Integer" idExemplarRequired="true" idExemplarOrdered="false"
	 * @generated
	 */
	void consultarDataDevolucao(int numRegistro, int idExemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idExemplarDataType="org.eclipse.uml2.types.Integer" idExemplarRequired="true" idExemplarOrdered="false"
	 * @generated
	 */
	void consultarMulta(int idExemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRegistroDataType="org.eclipse.uml2.types.Integer" numRegistroRequired="true" numRegistroOrdered="false"
	 * @generated
	 */
	void verificarReserva(int numRegistro);

} // Biblioteca
