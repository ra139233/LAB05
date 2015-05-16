/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Usuario#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.Usuario#getInstituto_Faculdade <em>Instituto Faculdade</em>}</li>
 *   <li>{@link Model.Usuario#getNumRegistro <em>Num Registro</em>}</li>
 *   <li>{@link Model.Usuario#getRg <em>Rg</em>}</li>
 *   <li>{@link Model.Usuario#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.Usuario#getTipoUsuario <em>Tipo Usuario</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see Model.ModelPackage#getUsuario_Nome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Instituto Faculdade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituto Faculdade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituto Faculdade</em>' attribute.
	 * @see #setInstituto_Faculdade(String)
	 * @see Model.ModelPackage#getUsuario_Instituto_Faculdade()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstituto_Faculdade();

	/**
	 * Sets the value of the '{@link Model.Usuario#getInstituto_Faculdade <em>Instituto Faculdade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto Faculdade</em>' attribute.
	 * @see #getInstituto_Faculdade()
	 * @generated
	 */
	void setInstituto_Faculdade(String value);

	/**
	 * Returns the value of the '<em><b>Num Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Registro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Registro</em>' attribute.
	 * @see #setNumRegistro(int)
	 * @see Model.ModelPackage#getUsuario_NumRegistro()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumRegistro();

	/**
	 * Sets the value of the '{@link Model.Usuario#getNumRegistro <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Registro</em>' attribute.
	 * @see #getNumRegistro()
	 * @generated
	 */
	void setNumRegistro(int value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rg</em>' attribute.
	 * @see #setRg(int)
	 * @see Model.ModelPackage#getUsuario_Rg()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRg();

	/**
	 * Sets the value of the '{@link Model.Usuario#getRg <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rg</em>' attribute.
	 * @see #getRg()
	 * @generated
	 */
	void setRg(int value);

	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(int)
	 * @see Model.ModelPackage#getUsuario_Cpf()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCpf();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(int value);

	/**
	 * Returns the value of the '<em><b>Tipo Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Usuario</em>' attribute.
	 * @see #setTipoUsuario(int)
	 * @see Model.ModelPackage#getUsuario_TipoUsuario()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getTipoUsuario();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTipoUsuario <em>Tipo Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Usuario</em>' attribute.
	 * @see #getTipoUsuario()
	 * @generated
	 */
	void setTipoUsuario(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRegistroDataType="org.eclipse.uml2.types.Integer" numRegistroRequired="true" numRegistroOrdered="false" idExemplarDataType="org.eclipse.uml2.types.Integer" idExemplarRequired="true" idExemplarOrdered="false"
	 * @generated
	 */
	void reservarExemplar(int numRegistro, int idExemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRegistroDataType="org.eclipse.uml2.types.Integer" numRegistroRequired="true" numRegistroOrdered="false" idExemplarDataType="org.eclipse.uml2.types.Integer" idExemplarRequired="true" idExemplarOrdered="false"
	 * @generated
	 */
	void cancelaReserva(int numRegistro, int idExemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model numRegistroDataType="org.eclipse.uml2.types.Integer" numRegistroRequired="true" numRegistroOrdered="false" idExemplarDataType="org.eclipse.uml2.types.Integer" idExemplarRequired="true" idExemplarOrdered="false"
	 * @generated
	 */
	void emprestaReserva(int numRegistro, int idExemplar);

} // Usuario
