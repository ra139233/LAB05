/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empréstimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Empréstimo#getDataRetirada <em>Data Retirada</em>}</li>
 *   <li>{@link Model.Empréstimo#getDataDevolucao <em>Data Devolucao</em>}</li>
 *   <li>{@link Model.Empréstimo#getIdExemplar <em>Id Exemplar</em>}</li>
 *   <li>{@link Model.Empréstimo#getNumRegistro <em>Num Registro</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getEmpréstimo()
 * @model
 * @generated
 */
public interface Empréstimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Retirada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Retirada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Retirada</em>' attribute.
	 * @see #setDataRetirada(Date)
	 * @see Model.ModelPackage#getEmpréstimo_DataRetirada()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataRetirada();

	/**
	 * Sets the value of the '{@link Model.Empréstimo#getDataRetirada <em>Data Retirada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Retirada</em>' attribute.
	 * @see #getDataRetirada()
	 * @generated
	 */
	void setDataRetirada(Date value);

	/**
	 * Returns the value of the '<em><b>Data Devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Devolucao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Devolucao</em>' attribute.
	 * @see #setDataDevolucao(Date)
	 * @see Model.ModelPackage#getEmpréstimo_DataDevolucao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataDevolucao();

	/**
	 * Sets the value of the '{@link Model.Empréstimo#getDataDevolucao <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Devolucao</em>' attribute.
	 * @see #getDataDevolucao()
	 * @generated
	 */
	void setDataDevolucao(Date value);

	/**
	 * Returns the value of the '<em><b>Id Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Exemplar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Exemplar</em>' attribute.
	 * @see #setIdExemplar(int)
	 * @see Model.ModelPackage#getEmpréstimo_IdExemplar()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdExemplar();

	/**
	 * Sets the value of the '{@link Model.Empréstimo#getIdExemplar <em>Id Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Exemplar</em>' attribute.
	 * @see #getIdExemplar()
	 * @generated
	 */
	void setIdExemplar(int value);

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
	 * @see Model.ModelPackage#getEmpréstimo_NumRegistro()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumRegistro();

	/**
	 * Sets the value of the '{@link Model.Empréstimo#getNumRegistro <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Registro</em>' attribute.
	 * @see #getNumRegistro()
	 * @generated
	 */
	void setNumRegistro(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tipoUsuarioDataType="org.eclipse.uml2.types.Integer" tipoUsuarioRequired="true" tipoUsuarioOrdered="false"
	 * @generated
	 */
	void realizaEmprestimo(int tipoUsuario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tipoUsuarioDataType="org.eclipse.uml2.types.Integer" tipoUsuarioRequired="true" tipoUsuarioOrdered="false"
	 * @generated
	 */
	void calculaMulta(int tipoUsuario);

} // Empréstimo
